package Tool.Fromfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class getInt {
    /**
     * 使用正则表达式匹配数字
     * @param fileName 要读入的文件的路径
     * @return 获取的数字
     */
    public static ArrayList<Integer> readInt(String fileName) throws IOException {
        return readStringInt(new String(new FileInputStream(fileName).readAllBytes()));
    }

    public static ArrayList<Integer> readStringInt(String text) {
        Matcher m = Pattern.compile("\\d+").matcher(text);
        ArrayList<String> data = new ArrayList<>();
        while (m.find())
            data.add(m.group());
        return data.stream().map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
    }

    public static void main(String[] args) throws IOException {
        System.out.println("测试用例");
        ArrayList<Integer> note2 = readInt(args[0]);
        for (Integer integer : note2) {
            System.out.println(integer);
        }
    }
}
