import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            while(left < right && !Character.isLetterOrDigit(l)){
                 left++;
            l = s.charAt(left);
            }

        while(left < right && !Character.isLetterOrDigit(r)){
            right--;
        r = s.charAt(right);
        }

        l = Character.toLowerCase(l);
        r = Character.toLowerCase(r);
        if(l!=r)return false; 
            left++;right--;
        }
        return true;
    }
}