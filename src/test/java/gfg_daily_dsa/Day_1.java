package gfg_daily_dsa;

import org.testng.annotations.Test;

public class Day_1 {

/*

Second Largest => https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735

Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.
Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
*/

    @Test
    public void test() {
        int[] arr = {28078,19451,935,28892,2242,3570,5480,231};
        System.out.println(getSecondLargest(arr));
    }

    public int getSecondLargest(int[] arr) {
        // Code Here

        if(arr.length == 0
                || arr.length == 1
                ||(arr.length == 2 && (arr[0] == arr[1]))) return -1;


        int max = Math.max(arr[0], arr[1]);
        int secondMax = Math.min(arr[0], arr[1]);
        if(arr.length > 2) {
            for(int i = 2; i < arr.length; i++) {
                if(arr[i] > max) {
                    secondMax = max;
                    max = arr[i];
                }
                if(arr[i] < max && arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        if(max == secondMax) return -1;
        else return secondMax;

    }



}
