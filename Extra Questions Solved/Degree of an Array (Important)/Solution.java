class Solution {
    public int findShortestSubArray(int[] nums) {
        
        if(nums.length==1)
            return 1;
        
        HashMap<Integer , Integer> map = new HashMap<>();
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        
        int max = 0;
        
        for(int i:map.keySet())
            if(map.get(i) > max)
                max = map.get(i);
        
        
        for(int i:map.keySet())
        {
            if(map.get(i)==max)
                list.add(i);
        }
        
        
        if(list.size()==1)
        {
            int temp = list.get(0);
            int flag=0;
            int count=0;
            int elementCount = 0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==temp)
                {
                    elementCount++;
                    flag=1;
                }
                if(flag==1)
                    count++;
                
                if(elementCount == max)
                    break;
            }
            
            return count;
        }
        else
        {
            int count = 0 , elementCount=0;
            int min = nums.length;
            int flag=0;
            
            for(int i:list)
            {
                count=0;
                flag=0;
                elementCount = 0;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[j]==i)
                    {
                        elementCount++;
                        flag=1;
                    }
                    if(flag==1)
                        count++;
                   
                    if(elementCount == max)
                        break;
                }
                if(count < min)
                    min = count;
            }
            
            return min;
        }
    }
}