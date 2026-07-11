class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        int[] nge = findNge(temperatures);

        for (int i = 0; i<n; i++) {
            ans[i] = nge[i] == -1 ? 0 : nge[i] - i;
        }

        return ans;
    }

    public int[] findNge(int[] arr) {
        int[] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i>=0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i])
                st.pop();

            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return nge;
    }
}