package cn.testutils.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZLS on 2018/3/29.
 */
public class Test {
    public static void add() {
        Test t = new Test();
        t.Print();
    }

    public void Print() {
        System.out.println("result");
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        //  sort(list, new ArrayList<Integer>(), list.size(), 3);
        // System.out.println();
        String[] str = new String[]{"a", "b", "c", "d", "F", "G"};
        arr(str, 0, 3);
        System.out.println();
    }

    private static void arr(String[] str, int flag, int length) {
        if(flag==length){
            for (int i = 0; i <length ; i++)
                System.out.print(str[i]);
            System.out.println();
        }else{
            for (int i = flag; i <str.length ; i++) {
                swap(str,flag,i);
                arr(str,flag+1,length);
                swap(str,flag,i);
            }
        }
    }


    private static void swap(String[] str, int st, int i) {
        String temp = new String();
        temp = str[st];
        str[st] = str[i];
        str[i] = temp;
    }

    private static void sort(List<Integer> list, List<Integer> workspace, int size, int n) {
        List<Integer> copyData;
        List<Integer> copyWorkSpace;
        if (workspace.size() == n) {
            for (int i : workspace)
                System.out.print(i);
            System.out.println();
        }
        for (int i = 0; i < list.size(); i++) {
            copyData = new ArrayList<>(list);
            copyWorkSpace = new ArrayList<>(workspace);

            copyWorkSpace.add(copyData.get(i));
            for (int j = i; j >= 0; j--)
                copyData.remove(j);
            System.out.println(copyData.toString() + "  " + copyWorkSpace.toString());
            sort(copyData, copyWorkSpace, size, n);
        }

    }
}