package Algorithm.Sort;

import java.io.IOException;
import java.util.ArrayList;
import Tool.Fromfile.getInt;

/**
 * 插入排序
 * @author mrc
 */
public class InsertionSort {
    /**
     * 插入排序
     * @param array 待排序的元素
     */
    public static void insertionSort(ArrayList<Integer> array){
        for (int j = 1; j < array.size(); j++) {
            int key = array.get(j), i;
            for (i = j - 1; i >= 0 && array.get(i) > key; i--){
                array.set(i + 1, array.get(i));
            }
            array.set(i + 1, key);
        }
    }

    public static void main(String[] args) throws IOException {
        String filename = args[0];
        ArrayList<Integer> integers = getInt.readInt(filename);
        insertionSort(integers);
        integers.forEach(System.out::println);
    }
}
