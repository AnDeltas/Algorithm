package Algorithm.Sort;

import java.io.IOException;
import java.util.ArrayList;

import Tool.Fromfile.getInt;

public class QuicklySort {

    public static void sort(ArrayList<Integer> data) {
        int i = data.get(0);
        // TODO
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> data = getInt.readInt("Note");
        sort(data);
        for (Integer datum : data) {
            System.out.println(datum);
        }
    }
}
