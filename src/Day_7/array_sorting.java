package Day_7;

import java.util.Scanner;

public class array_sorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Ascending order logic
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        // Descending order logic
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nDescending Order:");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
