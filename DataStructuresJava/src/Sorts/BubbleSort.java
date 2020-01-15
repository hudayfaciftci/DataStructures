package Sorts;

public class BubbleSort {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  

                int arr[] ={3,69,35,2,43,320,5};  

                int arr1[] ={3,78,35,41,45,320,5};  

                 
                System.out.println("Dizi Oncesi Bubble Sort");  
                for(int i=0; i < arr1.length; i++){  
                        System.out.print(arr1[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr1);  
                 
                System.out.println("Dizi Sonrasi Bubble Sort");  
                for(int i=0; i < arr1.length; i++){  
                        System.out.print(arr1[i] + " ");  
                }  
   
        }  
}  