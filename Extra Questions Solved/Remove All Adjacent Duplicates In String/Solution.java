class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for(char c:S.toCharArray())
        {
            if(stack.isEmpty())
                stack.push(c);
            else
            {
                if(stack.peek()==c)
                    stack.pop();
                else
                    stack.push(c);
            }
        }
        
        char[] ch = new char[stack.size()];
        for(int i=stack.size()-1;i>=0;i--)
            ch[i] = stack.pop();
        
        return String.valueOf(ch);
    }
}