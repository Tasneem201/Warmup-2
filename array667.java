public class Array667 {

    // Method to count how many times 6 is followed by 6 or 7
    public int array667(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        Array667 a667 = new Array667();

        System.out.println(a667.array667(new int[]{6, 6, 2}));        // 1
        System.out.println(a667.array667(new int[]{6, 6, 2, 6}));     // 1
        System.out.println(a667.array667(new int[]{6, 7, 2, 6}));     // 1
        System.out.println(a667.array667(new int[]{6, 6, 6, 7, 6}));  // 3
        System.out.println(a667.array667(new int[]{1, 2, 3}));        // 0
    }
}

