public class IsArraySortedTwo {
    
    public static boolean isArraySorted(int[] input) {
        return isSorted(input, 0);
    }

    public static boolean isSorted(int[] input, int startIndex) {
        if(startIndex >= input.length - 1) {
            return true;
        }

        if(input[startIndex] > input[startIndex + 1]) {
            return false;
        }
        
        return isSorted(input, startIndex + 1);
    }
    
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 6, 5};
        System.out.println(isArraySorted(input));
    }
}
