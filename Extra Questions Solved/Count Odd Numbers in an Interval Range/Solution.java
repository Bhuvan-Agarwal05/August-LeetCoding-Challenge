class Solution {
    public int countOdds(int low, int high) {
        
        // If both the boundary are even then , in this range even and odd numbers are equal
        if(low%2==0 && high%2==0)
            return (high-low)/2;
        // If any one of it is odd , then in this range odd numbers will be 1 more than the even numbers
        else
            return (high-low)/2 + 1;
        
        
            
            
    }
}