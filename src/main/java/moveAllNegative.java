package main.java;


import java.util.Arrays;
import java.util.Scanner;

public class moveAllNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     /*   int temp=0;
       int in=0;
        for(int j=0;j<n;j++) {
            for (int i = 1; i < n; i++) {
                if (arr[i] < 0 && arr[i - 1] > 0) {
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }*/
        int temp=arr[0];
        int k=-1;
        //if(temp<0) k++;
        //  int in=0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                k++;
                temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;

            }
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
