package com.company;

public class Control22 {
    public static void main(String[] args) {


    /*1. Вывести паттерн в виде треугольника заданной высоты:
            *
           *  *
          *    *
         *********/
    int n =8;
    String[][]arr=new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==n-1)
                    arr[i][j]="*";


            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
}
 }