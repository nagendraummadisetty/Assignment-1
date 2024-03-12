public class ReplaceChar {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        int indexToReplace = 7;
        char replacementChar = '*';

        String modifiedString = replaceCharAtIndex(originalString, indexToReplace, replacementChar);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }

    // Function to replace a character at a specific index in a String
    private static String replaceCharAtIndex(String original, int index, char replacementChar) {
        if (index < 0 || index >= original.length()) {
            System.out.println("Index out of bounds");
            return original;
        }

        char[] charArray = original.toCharArray();
        charArray[index] = replacementChar;

        return new String(charArray);
    }
}
