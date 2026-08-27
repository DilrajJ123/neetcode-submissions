class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();

        for (String i : operations) {
            if (i.equals("+")){
                int top = record.pop();
                int sum = top + record.peek();
                record.push(top);
                record.push(sum);
            }
            else if (i.equals("D")){
                record.push(2 * record.peek());
            }
            else if (i.equals("C")){
                record.pop();
            }
            else{
                record.push(Integer.parseInt(i));
            }
        }
        int totalSum = 0;
        for (int score : record){
            totalSum += score;
        }

        return totalSum;
    }

}