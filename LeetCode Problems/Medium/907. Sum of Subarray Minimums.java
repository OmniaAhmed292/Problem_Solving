//https://leetcode.com/problems/sum-of-subarray-minimums/
public static int sumSubarrayMins(int[] arr) {
        long sum = 0;
        Stack<Integer> stack = new Stack<>(); // To store the index of the array
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int index = stack.pop();
                long left = index - (stack.isEmpty() ? -1 : stack.peek());
                long right = i - index;
                sum = (sum + (arr[index] * left * right) % 1000000007) % 1000000007;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            long left = index - (stack.isEmpty() ? -1 : stack.peek());
            long right = arr.length - index;
            sum = (sum + (arr[index] * left * right) % 1000000007) % 1000000007;
        }
        return (int) sum;
    }
