// Last updated: 7/9/2026, 10:08:15 AM
class Solution{
    public boolean checkGoodInteger(int n){
        int digitSum = 0;
        int squareSum = 0;

        while(n > 0){
            int digit = n % 10;
            digitSum = digitSum + digit;
            squareSum = squareSum + digit * digit;
            n = n/10;
        }
        int value = squareSum - digitSum;
        if( value >= 50){
            return true;
        }else{
            return false;
        }
    }
}