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
        int j=0,k=0,i=0;
        int m=0;
        while(j<n1 && k<n2){
            if(arr1[j]<arr2[k]){
               System.out.println(arr1[j]);
                j++;
            }
            else if(arr1[j]>arr2[k]){
                System.out.println(arr2[k]);
                k++;
            }
            else{
                System.out.println(arr1[j]);
                j++; k++;

            }
        }
        while (j<n1){
            System.out.println(arr1[j++]);
        }
        while (k<n2){
            System.out.println(arr2[k++]);
        }



    }
}
