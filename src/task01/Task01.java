package task01;

import outputer.OutPuter;

import java.util.LinkedList;
import java.util.Queue;

public class Task01 {
    public static void main(String[] args) {

        String title = " Initial data: ";
        Queue<String> set = getInitData();
        OutPuter.getOutput(OutPuter.formData(title, set));

        title = " Update data: ";

        OutPuter.getOutput(OutPuter.formData(title, UpdateData(set)));
    }

    private static Queue<String> getInitData() {
        Queue<String> set = new LinkedList<>();
        set.add("apricot");
        set.add("mango");
        set.add("cherry");
        set.add("rice");
        return set;
    }


    private static Queue<String> UpdateData(Queue<String> set){
        set.add("kiwi");
        return set;
    }
}
