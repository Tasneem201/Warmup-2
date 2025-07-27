public class Has271 {

    // Method to check for 2-7-1 pattern where the last number can differ by at most 2
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            if (nums[i + 1] == val + 5 &&
                Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        Has271 h = new Has271();

        System.out.println(h.has271(new int[]{1, 2, 7, 1}));     // true
        System.out.println(h.has271(new int[]{1, 2, 8, 1}));     // false
        System.out.println(h.has271(new int[]{2, 7, 1}));        // true
        System.out.println(h.has271(new int[]{3, 8, 2}));        // true
        System.out.println(h.has271(new int[]{3, 8, 5}));        // false
    }
}

