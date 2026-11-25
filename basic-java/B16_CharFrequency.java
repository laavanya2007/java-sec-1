public class B16_CharFrequency {
    public static void main(String[] args) {
        String s = "programming";
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) System.out.println((char) ('a' + i) + " = " + freq[i]);
        }
    }
}
