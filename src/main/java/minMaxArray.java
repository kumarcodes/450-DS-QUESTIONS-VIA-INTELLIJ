package main.java;
import java.util.Scanner;
public class minMaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input size of your Array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int tempSmallest=arr[0];
        int tempLargest=arr[0];
        int secondLargest=0;
        for (int i=1;i<n;i++){
            if(arr[i]<tempSmallest){
                tempSmallest=arr[i];
            }
            if(arr[i]>tempLargest){
                tempLargest=arr[i];
            }
        }
        for (int i=0;i<n;i++){
            if(arr[i]>secondLargest && arr[i]!=tempLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Largest Element in given Array:"+" "+tempLargest);
        System.out.println("Second Largest Element in given Array:"+" "+secondLargest);
        System.out.println("Smallest Element in given Array:"+" "+tempSmallest);

    }
}
