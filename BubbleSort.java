package Sorting;

public class BubbleSort {

    // Sort an array in ascending order using bubble sort.
    public static void BubbleSort1(int[]a,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[]args){
        int []b ={4,1,5,2,3};
        int m = b.length;
        BubbleSort1(b,m);
        System.out.println("sorted array: ");
        for(int i:b){
            System.out.print(i+" ");
        }
    }
}
