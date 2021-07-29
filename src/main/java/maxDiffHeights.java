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
        int ans=arr[n-1]-arr[0];
        int small=arr[0]+k;
        int big=arr[n-1]-k;
        int temp=0;
        if (small>big){
            temp=small;
            small=big;
            big=temp;
        }
        for(int i=1;i<n-1;i++){
            int add=arr[i]-k;
            int sub=arr[i]+k;
            if(add<=big || sub>=small){
                continue;
            }
            if(big-sub<=add-small){
                small=sub;
            }
            else {
                    big=add;
            }
        }
        System.out.println(big-small);
    }
}
