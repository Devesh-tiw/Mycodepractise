
class Solution {

    public double myPow(double x, int n) {

        long power = n;  
        if (power < 0) {
            x = 1 / x;    
            power = -power;
        }

        double result = 1;

        while (power > 0) {
            result *= x;
            power--;
        }

        return result;
    }
}
