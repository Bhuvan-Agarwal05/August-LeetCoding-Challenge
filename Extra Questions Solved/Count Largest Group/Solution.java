
class Solution {
    public int countLargestGroup(int n) {
        if(n<=9)
            return n;
        
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        int digitSum = 0;
        for(int i=1;i<=n;i++)
        {
            digitSum = sumOfDigits(i);
            
            if(map.containsKey(digitSum))
            {
                ArrayList<Integer> list = map.get(digitSum);
                list.add(i);
                map.put(digitSum,list);
            }
            else
            {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(digitSum,list);
            }
        }
        
        
        int max = 0;
        for(int i:map.keySet())
        {
            if(map.get(i).size()>max)
                max = map.get(i).size();
        }
        
        int count=0;
        for(int i:map.keySet())
        {
            if(map.get(i).size()==max)
                count++;
        }
        
        return count;
        
    }
    
    private int sumOfDigits(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            sum += n%10;
            n /= 10;
        }
        
        return sum;
    }
}