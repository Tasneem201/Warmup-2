public class ArrayFront9 {

    // Method to check if 9 appears in the first 4 elements
    public boolean arrayFront9(int[] nums) {
        int len = Math.min(nums.length, 4);

        for (int i = 0; i < len; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }

        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        ArrayFront9 af9 = new ArrayFront9();

        System.out.println(af9.arrayFront9(new int[]{1, 2, 9, 3, 4}));  // true
        System.out.println(af9.arrayFront9(new int[]{1, 2, 3, 4, 9}));  // false
        System.out.println(af9.arrayFront9(new int[]{1, 2, 3, 4, 5}));  // false
        System.out.println(af9.arrayFront9(new int[]{9, 2}));           // true
        System.out.println(af9.arrayFront9(new int[]{1}));              // false
        System.out.println(af9.arrayFront9(new int[]{}));               // false
    }
}

