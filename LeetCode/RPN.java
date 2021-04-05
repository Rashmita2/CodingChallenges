class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer>stack = new Stack<>();
        int value, nums1, nums2;
       // String operators = ["+", "-", "*", "/"];
        for(String token : tokens){
            if(token.equals("+")){
                 nums1 = stack.pop();
                 nums2 = stack.pop();
                stack.push(nums2+nums1);
            }
             else if(token.equals("-")){
               nums1 = stack.pop();
                 nums2 = stack.pop();
                stack.push(nums2-nums1);
            }
             else if(token.equals("*")){
                 nums1 = stack.pop();
                 nums2 = stack.pop();
                stack.push(nums2*nums1);
            }
            else if(token.equals("/")){
                 nums1 = stack.pop();
                 nums2 = stack.pop();
                stack.push(nums2/nums1);
            }
            else{
                value = Integer.parseInt(token);
                stack.push(value);
            }       
        }
        return stack.pop();
    }
}