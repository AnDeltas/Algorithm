package Algorithm.Sort;

import java.io.IOException;
import java.util.ArrayList;

import Tool.Fromfile.getInt;

public class QuicklySort {
    private static int scanOnce(ArrayList<Integer> data, int low, int high){
        int index = data.get(low);
        while (low < high){
            while (low < high && data.get(high) >= index) high++;
            data.set(low, data.get(high));
            while (low < high && data.get(low) <= index) low++;
            data.set(high, data.get(low));
        }
        data.set(high, index);
        return high;
    }

    public static void quicklySort(ArrayList<Integer> data, int low, int high) {
        int index = scanOnce(data, low, high);
        quicklySort(data, low, index - 1);
        quicklySort(data, index + 1, high);
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> data = getInt.readInt("Note");
        quicklySort(data, 0, data.size() - 1);
        for (Integer datum : data) {
            System.out.println(datum);
        }
    }
}
