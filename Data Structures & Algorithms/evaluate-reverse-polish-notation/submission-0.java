class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") 
               || tokens[i].equals("/") || tokens[i].equals("*")) {

                int second = st.pop();
                int first = st.pop();

                int res = 0;

                if(tokens[i].equals("+")) res = first + second;
                else if(tokens[i].equals("-")) res = first - second;
                else if(tokens[i].equals("*")) res = first * second;
                else res = first / second;

                st.push(res);
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}