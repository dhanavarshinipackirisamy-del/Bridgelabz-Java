package stackqueuehash.hash;

import java.util.HashSet;

class pairSum {
    static void findPair(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(sum - num)) {
                System.out.println("Pair found");
                return;
            }
            set.add(num);
        }
        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        findPair(arr, sum);
    }
}
