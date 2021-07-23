package main.java;

import java.util.Scanner;
public class kthMinMaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input size of your Array:");
        int n= sc.nextInt();
        System.out.println("Enter value of k:");
        int k=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }


        }
        System.out.println("Kth largest Element is:"+arr[n-k]);

    }
}
