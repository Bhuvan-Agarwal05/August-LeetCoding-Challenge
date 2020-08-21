class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int idx = 0, candies_count = 1;
        while(candies > 0){
            result[idx++] += candies_count;
            candies -= candies_count++;
            if(idx == num_people) idx = 0;
            if(candies_count > candies) candies_count = candies;
        }
        return result;
    }
}