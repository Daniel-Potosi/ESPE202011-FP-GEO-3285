package ws24.bubblesort;

public class WS24BubbleSort {

    public static void main(String[] args) {
        // TODO code application logic here
         int[] integersToSort = {9, 7, 1, 6, 2, 3};
        
        System.out.println("Unsorted integers");
        printArray(integersToSort);
        sortByBubbleSort(integersToSort);
        System.out.println("");
        printArray(integersToSort);
        
        int[] integersToSort2 = {8, 1, 7, 2, 5};
        
        System.out.println("Unsorted integers");
        printArray(integersToSort2);
        sortByBubbleSort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);
        
    }

    public static void sortByBubbleSort(int integers[]) {

        //for (int i = 0; i < integers.length - 1; i++) {
        //
        //}
        int n = integers.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(integers[j] > integers[j+1])
                {
                    //swap
                    temp = integers[j];
                    integers[j] = integers[j+1];
                    integers[j+1] = temp;
                    
                }
                System.out.print("sorting --> ");
                printArray(integers);

            }
            System.out.println("");

        }
        

    }
    
    public static void printArray(int[] integers){
        int n = integers.length;
        for (int i = 0 ; i <n;i++){
            System.out.print(integers[i] + " , ");
        }
        System.out.println("");
    }
    
}
