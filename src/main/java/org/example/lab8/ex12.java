package org.example.lab8;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ex12 {
    public static ArrayList<String> rec(ArrayList<String> str, int n) {
        if (str.size() == n) {
            return str;
        }
        if (Integer.parseInt(str.get(n)) % 2 != 0)
            System.out.println(str.get(n));
        return rec(str, n+1);
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            String number = in.nextLine();
            if (number.equals("0"))
                flag = false;
            arr.add(number);
        }
        rec(arr, 0);

    }
}
