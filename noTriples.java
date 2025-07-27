public class NoTriples {

    // Method to check if the array contains no triples (3 same values in a row)
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        NoTriples nt = new NoTriples();

        System.out.println(nt.noTriples(new int[]{1, 1, 2, 2, 1}));           // true
        System.out.println(nt.noTriples(new int[]{1, 1, 2, 2, 2, 1}));        // false
        System.out.println(nt.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));     // false
        System.out.println(nt.noTriples(new int[]{1, 2, 3, 4}));              // true
        System.out.println(nt.noTriples(new int[]{}));                        // true
    }
}

