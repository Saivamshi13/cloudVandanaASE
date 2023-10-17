public class Pangram{
    public static void main(String[] args) {
        String str = "Hello!! what are you doing in my house?";
        boolean Pangram = Pangram(str);
        
        if (Pangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    
    public static boolean Pangram(String str) {
        str = str.replaceAll(" ", "").toLowerCase();
        boolean[] alphabetPresent = new boolean[26];
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('a' <= c && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }

        for (boolean Present : alphabetPresent) {
            if (!Present) {
                return false;
            }
        }
        
        return true;
    }
}
