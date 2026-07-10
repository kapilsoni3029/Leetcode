class Solution {
    public static boolean isPalindrome(int x) {
        int realx=x;
        int rev=0;
        while(x>0){
            int lastDig=x%10;
            rev=rev*10+lastDig;
            x/=10;
        }
        if(realx==rev){
            return true;
        }else{
            return false;
        }
        
    }public static void main(String args[]){
        int x=121;
        System.out.print(isPalindrome(x));
    }
}