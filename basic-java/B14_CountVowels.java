public class B14_CountVowels {
    public static void main(String[] args) {
        String s = "Dayananda Sagar University";
        int vowels = 0, consonants = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
            else if (c >= 'a' && c <= 'z') consonants++;
        }
        System.out.println("Vowels = " + vowels + ", Consonants = " + consonants);
    }
}
