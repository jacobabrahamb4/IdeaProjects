public class Main {
    public static void main(String[] args) {
        int[] sortedArray = {2,3,6,8,9,13,20};
        System.out.println("Search 13: " + binarySearch(sortedArray, 13));
    }

    private static int binarySearch(int sortedArray[], int number) {

        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midNumber = sortedArray[mid];
            if (number == midNumber) return mid;
            if (number < midNumber) high = mid - 1;
            if (number > midNumber) low = mid + 1;
        }

        return -1;
    }



}