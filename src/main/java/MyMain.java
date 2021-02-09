import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        // YOUR CODE HERE
        ArrayList<Integer> newList = new ArrayList<>();
        for (int listVal: list) {
            int i = 0;
            for (int newListVal: newList) {
                if (newListVal>listVal) break;
                i++;
            }
            newList.add(i, listVal);
        }
        return newList;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        // YOUR CODE HERE
        int[] arr3 = new int[arr1.length+arr2.length];

        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i<arr1.length+arr2.length; i++) {
            if (i2>=arr2.length || (i1<arr1.length && arr1[i1]<arr2[i2])) {
                arr3[i] = arr1[i1];
                i1++;
            }
            else {
                arr3[i] = arr2[i2];
                i2++;
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
