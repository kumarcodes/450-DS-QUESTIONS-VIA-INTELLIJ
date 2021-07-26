package main.java;

import java.util.Scanner;

public class unionIntersectionSortedArraySix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        for (int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        for (int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int temp=n1+n2;
        int arrunion[]=new int[temp];
        int j=0,k=0;
        for(int i=0;i<temp;i++){
            if(arr1[i]<arr2[i]){
                arrunion[i]=arr1[i];
                j++;
            }
            else if(arr1[i]>arr2[i]){
                arrunion[i]=arr2[i];
                k++;
            }
            else{
                arrunion[i]=arr1[i];
                j++; k++;
            }
        }
        for(int i=0;i<n1+n2;i++){
            System.out.println(arrunion[i]);
        }

    }
}
