package Day_7;

import java.util.Scanner;

public class index_position {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < size; i++) {
            if(arr[i] == search) {
                System.out.println("Number found: " + arr[i]);
                System.out.println("Index position: " + i);
                found = true;
                break;
            }
        }
        if(found == false) {
            System.out.println("Number not found");
        }
        sc.close();
    }
}
