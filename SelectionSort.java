package Sorting;

public class SelectionSort {

    public static void SelectionSort1(int[]a,int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }

    public static void main(String []args){
        int [] b={4,1,5,2,3};
        int m=b.length;
        SelectionSort1(b,m);
        System.out.println("sorted array: ");
        for(int i:b){
            System.out.print(i+"\t");
        }
    }
}
