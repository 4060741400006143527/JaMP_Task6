package kz.epam.garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        for (int i = 1; i < 115566; i++) {
            System.out.println(i);
            list.add("str" + i);
        }

        list = null;

        List<String> list1 = new ArrayList<String>();

        for (int i = 1; i < 115566; i++) {
            System.out.println(i);
            list1.add("str" + i);
        }

        list1 = null;

        List<String> list2 = new ArrayList<String>();

        for (int i = 1; i < 115566; i++) {
            System.out.println(i);
            list2.add("str" + i);
        }

        list2 = null;

        List<String> list3 = new ArrayList<String>();

        for (int i = 1; i < 115566; i++) {
            System.out.println(i);
            list3.add("str" + i);
        }
        
        list3 = null;

        List<String> list4 = new ArrayList<String>();

        for (int i = 1; i < 115566; i++) {
            System.out.println(i);
            list4.add("str" + i);
        }
        
        list4 = null;        
    }
}
