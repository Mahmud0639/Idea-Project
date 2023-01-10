package list;

import java.util.ArrayList;

public class MyList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(0,25);
        System.out.println("List size: "+list.size());
        System.out.println(list);

        for (int x : list){
            System.out.print(" "+x);
        }
    }
}
