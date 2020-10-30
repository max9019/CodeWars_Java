/*

https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a/train/java

Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.

Your task is to make 'Past' function which returns time converted to milliseconds.

Example:
Past(0, 1, 1) == 61000
Input constraints: 0 <= h <= 23, 0 <= m <= 59, 0 <= s <= 59
 */


public class Beginner_Series_2_Clock {

    public static int Past(int h, int m, int s) {
        int result;
        result = (h * 3600 + m * 60 + s) * 1000;

        return result;
    }
}
