class Solution {
    public int getWinner(int[] arr, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i:arr)
            list.add(i);
        
        if(k>=arr.length)
            return Collections.max(list);
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 1;
        int ans = 0;
        while(true)
        {
            if(list.get(0)>list.get(1))
            {
                if(map.containsKey(list.get(0)))
                {
                    map.put(list.get(0),map.get(list.get(0))+1);
                    if(map.get(list.get(0)) > max)
                    {
                        max = map.get(list.get(0));
                        ans = list.get(0);
                    }
                    
                }
                else
                {
                    map.put(list.get(0),1);
                    ans = list.get(0);
                }
                
                list.add(list.remove(1));
            }
            else
            {
                if(map.containsKey(list.get(1)))
                {
                    map.put(list.get(1),map.get(list.get(1))+1);
                    if(map.get(list.get(1)) > max)
                    {
                        max = map.get(list.get(1));
                        ans = list.get(0);
                    }
                }
                else
                {
                    map.put(list.get(1),1);
                    ans = list.get(1);
                }
                
                list.add(list.remove(0));
            }
     
            if(max==k)
                break;
        }
        
        return ans;
    }
}