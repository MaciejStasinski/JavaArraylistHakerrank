package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<ArrayList> listOfLists = new ArrayList<ArrayList>();

        int n = scanner.nextInt();//5
        for (int i=0;i<n;i++) {
            listOfLists.add(new ArrayList());
            int d = scanner.nextInt();
            for (int j=0;j<d;j++)
                listOfLists.get(i).add(scanner.nextInt());
        }

        int q=scanner.nextInt();
        for (int i=0;i<q;i++){
            try{
                int x= scanner.nextInt();
                int y= scanner.nextInt();
                System.out.println(listOfLists.get(x-1).get(y-1));
            }catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
