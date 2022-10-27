package com.company;

public class Control2 {

    public static void main(String[] args) {
        /*Контрольная работа:

2. Номиналы белорусских монет: 1,2,5,10,20,50.
Дана сумма сдачи: 51..99 копеек.
Выдать сдачу минимальным количеством монет. */
        int n = 6;
        int a = 64;
        int[] arr = {50, 20, 10, 5, 2, 1};
        for (int i = 0; i <n; i++) {
            if (a==0)
                break;
         while (a-arr[i]>=0){
                    a -= arr[i];
                System.out.println(arr[i]);}


        }

    }
}
