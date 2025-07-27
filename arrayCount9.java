public class ArrayCount9 {

    // Method to count how many times 9 appears in the array
    public int arrayCount9(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        ArrayCount9 ac9 = new ArrayCount9();

        System.out.println(ac9.arrayCount9(new int[]{1, 2, 9}));           // 1
        System.out.println(ac9.arrayCount9(new int[]{1, 9, 9}));           // 2
        System.out.println(ac9.arrayCount9(new int[]{1, 9, 9, 3, 9}));     // 3
        System.out.println(ac9.arrayCount9(new int[]{1, 2, 3}));           // 0
        System.out.println(ac9.arrayCount9(new int[]{}));                  // 0
    }
}

