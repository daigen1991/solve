/**
 * Dean Dai
 */
public class Stage2 {

    public static void replaceConsecutiveDuplicates(String input) {
        int beforLength = input.length();
        int i = 0;
        StringBuilder output = new StringBuilder();
        while (i < input.length() - 2) {
            char currentChar = input.charAt(i);
            if (currentChar == input.charAt(i + 1) && currentChar == input.charAt(i + 2)) {
                char replacementChar = (char) (currentChar - 1);
                if (replacementChar < 'a') {
                    output.append(input.substring(0, i)).append(input.substring(i + 3));
                }else{
                    StringBuilder replac = new StringBuilder(input.substring(i,i + 3));
                    input = input.substring(0, i) + replacementChar + input.substring(i + 3);
                    output.append(input).append(", " ).append(replac).append( " is replaced by " +replacementChar);
                }
                break;
            } else {
                i++;
            }
        }
        // If no more consecutive duplicates were found, exit the loop
        System.out.println("-> " + output );
        if (input.length() != beforLength) {
            replaceConsecutiveDuplicates(input);
        }
    }

    public static void main(String[] args) {
        String input = "abcccbad";
        System.out.println("Original input: " + input);
        System.out.println("Output: ");
        replaceConsecutiveDuplicates(input);
    }
}
