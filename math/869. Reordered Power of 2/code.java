class Solution {
    private int[] getDigitsCount(int n)
    {
        int arr[] = new int[10];
        while(n > 0)
        {
            arr[n%10]++;
            n /= 10;
        }
        return arr;
    }
    public boolean reorderedPowerOf2(int n) {
        int []digitOfN = getDigitsCount(n);
        int num = 1;
        for(int i = 0; i < 31; i++)
        {
            if(Arrays.equals(digitOfN, getDigitsCount(num)))
                return true;
            num = num << 1;
        }
        return false;
    }
}