/**
 * Dean Dai
 */
public class Stage1 {

    public static void removeConsecutiveDuplicates(String input) {
        int beforLength = input.length();
        int i = 0;
        while (i < input.length() - 2) {
            char currentChar = input.charAt(i);
            if (currentChar == input.charAt(i + 1) && currentChar == input.charAt(i + 2)) {
                input = input.substring(0, i) + input.substring(i + 3);
                break;
            } else {
                i++;
            }
        }
        // If no more consecutive duplicates were found, exit the loop
        if (input.length() != beforLength) {
            System.out.println("-> " + input);
            removeConsecutiveDuplicates(input);
        }
    }

    public static void main(String[] args) {
        //Supports any string as aabcccbbaddaq
        String input = "aabcccbbad";
        System.out.println("Original input: " + input);
        System.out.println("Output: ");
        removeConsecutiveDuplicates(input);
    }
}