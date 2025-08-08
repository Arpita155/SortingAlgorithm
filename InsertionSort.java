package Sorting;

public class InsertionSort {

    public static void InsertionSort1(int[]a,int n){
        for(int i=1;i<n;i++){
            int curr=a[i];
            int prev=i-1;
            while (prev>=0 && a[prev]>curr){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }
    }

    public static void main(String []args){
        int [] b={5,1,4,2,8};
        int m=b.length;
        System.out.println("Original array:");
        for(int i:b){
            System.out.print(i+" ");
        }
        InsertionSort1(b,m);
        System.out.println("\nsorted array: ");
        for(int i:b){
            System.out.print(i+" ");
        }
    }
}
