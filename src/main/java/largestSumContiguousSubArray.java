package main.java;
import java.util.Scanner;
public class largestSumContiguousSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sumtemp=0,sumper=0;
        for (int i=0;i<n;i++){
            sumtemp=sumtemp+arr[i];
            if(sumtemp<0){
                sumtemp=0;
            }
            if(sumtemp>sumper){
                sumper=sumtemp;
            }
        }
        System.out.println(sumper);
    }
}
