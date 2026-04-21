import java.util.HashMap;

public class SubStrings{
    public static int atMostKDistinct(String s, int k){
        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int res = 0;

        for(int right = 0; right<s.length() ; right++){
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0) + 1);

            while(freq.size() > k){
                char leftChar = s.charAt(left);

                freq.put(leftChar, freq.get(leftChar) - 1);

                if(freq.get(leftChar) == 0) freq.remove(leftChar);
                    left++;
            }

            res += right - left + 1;
        }
        return res;
    }

    public static int countSubstrings(String s, int k){
        return atMostKDistinct(s, k) - atMostKDistinct(s, k-1);
    }

    public static void main(String[]args){
        String s = "pqpqs";
        int k = 2;

        // Output the result
        System.out.println("Count: " + countSubstrings(s, k)); // Output: 7
    }
}