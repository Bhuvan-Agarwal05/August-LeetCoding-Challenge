class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
            map.put(ch , map.getOrDefault(ch,0)+1);
        
        
        int ans = 0;
        boolean oddExists = false;
        
        for(char ch : map.keySet())
        {
            if(map.get(ch)%2==0)
                ans += map.get(ch);
            else
            {
                oddExists = true;
                ans += map.get(ch) - 1;
            }
        }
        
        if(oddExists)
            return ++ans;
        return ans;
    }
}