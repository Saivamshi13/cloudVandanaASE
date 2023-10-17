import java.util.HashMap;
import java.util.Map;

public class ConRtoI {
    public static void main(String[] args) {
        System.out.println(romanToInteger("IX")); 
        System.out.println(romanToInteger("MCMXCIX")); 
    }
    public static int romanToInteger(String a) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int result = 0;
        for (int i = 0; i < a.length(); i++) {
            int currentVal = romanValues.get(a.charAt(i));
            int nextVal = (i < a.length() - 1) ? romanValues.get(a.charAt(i + 1)) : 0;
            if (currentVal < nextVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }
        return result;
    }
}
