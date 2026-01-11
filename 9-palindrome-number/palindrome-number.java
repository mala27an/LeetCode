class Solution {
    //sdfg
    public boolean isPalindrome(int x) {
       if(x<0){
        return false;
       }
       String num = x + "";
       return checkPalindrome(num);
    }

    public static boolean checkPalindrome(String num)
    {
        int i = 0;
        int j = num.length()-1;

        while(i<j)
        {
            if(num.charAt(i)!=num.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}