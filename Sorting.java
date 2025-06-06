import java.util.*;
public class Sorting {
    public static void main(String[] agrs){
        Sorting.sortpancake();
        Sorting.sortSelection();
    }
    static void flip(int[] arr,int k){
        int left=0,right=k-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++; 
            right--;
        }
    }
    static int  findMaxindex(int[] arr ,int n){
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    } 
    static void pancakeSort(int[] arr) {
        int n = arr.length;
        for (int size = n; size > 0; size--) {
            int maxIndex = findMaxindex(arr, size);
            if (maxIndex != size - 1) {
                if (maxIndex != 0) {
                    flip(arr, maxIndex + 1);
                }

                flip(arr, size);
            }
        }
    }
    public static void sortpancake() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=s.nextInt();
        System.out.println("Enter "+n+" elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println("Original array: " + Arrays.toString(arr));
        pancakeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        s.close();
    }
    public static void sortSelection(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        ss(a);
        System.out.println("Sorted Arrays: ");
        for(int num:a){
            System.out.print(num);
            System.out.print(" ");
        }
        s.close();
    }
    static void ss(int[] a){
        int n= a.length ;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }

}
