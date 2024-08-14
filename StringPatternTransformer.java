public class StringPatternTransformer {
    
    public static void main(String[] args) {
        String input1 = "a1b10";
        String input2 = "b13c6d15";
        
        System.out.println(transformString(input1));  // Output: abbbbbbbbbb
        System.out.println(transformString(input2));  // Output: bbbccccccdddddddddd
    }
    
    public static String transformString(String input) {
        StringBuilder result = new StringBuilder();
        int length = input.length();
        int i = 0;
        
        while (i < length) {
            char currentChar = input.charAt(i);
            i++;
            
            StringBuilder numberBuilder = new StringBuilder();
            while (i < length && Character.isDigit(input.charAt(i))) {
                numberBuilder.append(input.charAt(i));
                i++;
            }
            
            int repeatCount = Integer.parseInt(numberBuilder.toString());
            for (int j = 0; j < repeatCount; j++) {
                result.append(currentChar);
            }
        }
        
        return result.toString();
    }
}