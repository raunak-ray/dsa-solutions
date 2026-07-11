class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String ch : tokens) {
            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || 
                ch.equals("/")) {
                int op1 = st.pop();
                int op2 = st.pop();

                int result = calculate(op1, op2, ch);

                st.push(result);
            }
            else st.push(Integer.parseInt(ch));
        }

        return st.pop();
    }

    public int calculate(int op1, int op2, String op) {
        if (op.equals("+")) return op2 + op1;
        else if (op.equals("-")) return op2 - op1;
        else if (op.equals("*")) return op2 * op1;
        else if (op.equals("/")) return op2 / op1;

        return 0;
    }
}