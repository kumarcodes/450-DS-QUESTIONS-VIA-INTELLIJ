package main.java;

import java.util.Scanner;

public class cyclicRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x=arr[n-1];


        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;
        for (int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
    }
}
