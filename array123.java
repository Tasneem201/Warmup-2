public class Array123 {

    // Method to check if 1, 2, 3 appears in the array consecutively
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        Array123 a123 = new Array123();

        System.out.println(a123.array123(new int[]{1, 1, 2, 3, 1}));     // true
        System.out.println(a123.array123(new int[]{1, 1, 2, 4, 1}));     // false
        System.out.println(a123.array123(new int[]{1, 1, 2, 1, 2, 3}));  // true
        System.out.println(a123.array123(new int[]{1, 2}));              // false
        System.out.println(a123.array123(new int[]{}));                  // false
    }
}

