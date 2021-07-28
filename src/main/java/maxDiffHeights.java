package main.java;

import java.util.Scanner;

public class maxDiffHeights {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                arr[i-1]=k+arr[i-1];
            }
            else{
                arr[i]=arr[i]-k;
            }
        }
        if(arr[n-1]<arr[n-2]){
            arr[n-1]=arr[n-1]+k;
        }
        else{
            arr[n-1]=arr[n-1]-k;
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
