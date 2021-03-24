package hw19.array_jframeform;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HW19Array_JFrameForm {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] numberOfData=new int [6];
        int n;
        int search;
        int position;
        for (int i = 0; i < numberOfData.length; i++) {
            numberOfData[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the array numbers"));
        }

        System.out.println("");
        System.out.println("----Binary Search----");
        Arrays.sort(numberOfData);
        System.out.println("\t" + Arrays.toString(numberOfData));
        System.out.print("Enter the age to search: ");
        search = input.nextInt();
        Arrays.sort(numberOfData);
        position = Arrays.binarySearch(numberOfData, search);
        System.out.println("Age is in the position: " + position);
        
        
        for (int i = 0; i < numberOfData.length; i++) {
            numberOfData[i] = input.nextInt();
        }
    }
    public int binarySearch(int elements[], int left, int right, int x) {
        if (right >= left) {

            int mid = left + (right - left) / 2;

            if (elements[mid] == x) {
                return mid;
            }
            if (elements[mid] > x) {
                return binarySearch(elements, left, mid - 1, x);
            }
            if (elements[mid] < x) {
                return binarySearch(elements, mid + 1, right, x);
            }
        }
        return -1;
    }
}