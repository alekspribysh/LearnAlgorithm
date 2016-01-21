/**
 * Created by aprybysh on 1/21/16.
 */
public class BinarySearch {


    public static void main(String[] args) {

        BinarySearch mbs = new BinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: " +  mbs.binarySearch(arr, 14));
        int[] arr1 = {6, 34, 78, 123, 432, 900};
        System.out.println("Key 432's position: " + mbs.binarySearch(arr1, 432));

    }


    public int binarySearch (int [] arr, int key){

        int low = 0;
        int high = arr.length-1;

        int middle = (high - low)/2;

        while (high >= low){

            if (arr[middle] == arr[key]){
                return middle;
            }

            if (arr[middle] > arr[key]){

                high = middle -1;
            }else {
                low = middle +1;
            }


        }


       return -1;
    }

}
