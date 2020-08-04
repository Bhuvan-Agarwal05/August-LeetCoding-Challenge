class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] output = new int[A.length];
        
        int evenPtr=0,oddPtr=A.length-1;
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            {
                output[evenPtr]=A[i];
                evenPtr++;
            }
            else
            {
                output[oddPtr] = A[i];
                oddPtr--;
            }
        }
        
        return output;
    }
}