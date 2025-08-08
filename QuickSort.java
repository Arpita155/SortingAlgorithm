package Sorting;

public class QuickSort {

    public static void QuickSort1(int[]arr,int start,int end){
        if(start<end){
            int pivotIdx = partition(arr,start,end);
            QuickSort1(arr,start,pivotIdx-1);
            QuickSort1(arr,pivotIdx+1,end);
        }
    }
    public static int partition(int[]arr,int start,int end){
        int idx=start-1;
        int pivot=arr[end];
        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                idx++;
                int temp=arr[j];
                arr[j]=arr[idx];
                arr[idx]=temp;
            }
        }
        idx++;
        int temp=arr[end];
        arr[end]=arr[idx];
        arr[idx]=temp;
        return  idx;
    }

    public static void main(String []args){
        int [] b={5,1,4,2,8};
        int m=b.length;
        QuickSort1(b,0,b.length-1);
        System.out.println("sorted array: ");
        for(int i:b){
            System.out.print(i+" ");
        }
    }
}
