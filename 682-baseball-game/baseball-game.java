class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("D")) {
                s.push(2 * s.peek());
            } 
            else if (arr[i].equals("+")) {
                int a = s.pop();
                int b = s.pop();

                s.push(b);
                s.push(a);
                s.push(a + b);
            } 
            else if (arr[i].equals("C")) {
                s.pop();
            } 
            else {
                s.push(Integer.parseInt(arr[i]));
            }
        }

        int sum = 0;
        while (!s.isEmpty()) {
            sum += s.pop();
        }

        return sum;
    }
}