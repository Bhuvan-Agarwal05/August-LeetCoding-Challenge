class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
            return true;
        else if(flowerbed.length==1)
            if(flowerbed[0]==1 && n==1)
                return false;
            else 
                return true;
        
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==0)
            {
                if(i==0 && flowerbed[i+1]==0)
                {
                    flowerbed[i]=1;
                    n--;
                }
                else if(i==flowerbed.length-1 && flowerbed[i-1]==0)  
                {
                    flowerbed[i] = 1;
                    n--;
                }
                else if(i>0 && i<flowerbed.length-1)
                {
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0)
                    {
                        flowerbed[i]=1;
                        n--;
                    }
                }
            }
            else
            {
                if( (i-1>=0 && flowerbed[i-1]==1) || (i+1<flowerbed.length && flowerbed[i+1]==1) )
                        return false;
            }
            
            if(n==0)
                break;
        }
        
        if(n==0)
            return true;
        else
            return false;
        
        
    }
}

