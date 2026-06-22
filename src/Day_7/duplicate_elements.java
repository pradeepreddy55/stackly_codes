package Day_7;

import java.util.Scanner;

public class duplicate_elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("duplicate elements are:");
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

        sc.close();
    }
}
