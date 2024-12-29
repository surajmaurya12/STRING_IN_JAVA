public class StringVowelConstent {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int vowelCount = 0;
        int consonantCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);
    }

}

// Vowels: 5, Consonants: 21