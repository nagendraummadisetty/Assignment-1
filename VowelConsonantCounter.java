public class VowelConsonantCounter {
    public static void main(String[] args) {
        String inputString = "DataValley";
        
        int[] result = countVowelsAndConsonants(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Number of vowels: " + result[0]);
        System.out.println("Number of consonants: " + result[1]);
    }

    // Function to count the number of vowels and consonants in a string
    private static int[] countVowelsAndConsonants(String input) {
        int[] counts = new int[2];
        input = input.toLowerCase(); // Convert the string to lowercase for case-insensitivity

        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    counts[0]++; // Increment vowel count
                } else {
                    counts[1]++; // Increment consonant count
                }
            }
        }

        return counts;
    }
}

