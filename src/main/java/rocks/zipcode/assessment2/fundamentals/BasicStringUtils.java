package rocks.zipcode.assessment2.fundamentals;

import java.util.Arrays;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder result = new StringBuilder(string1);

        return result.reverse().toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder result = new StringBuilder(string1);
        StringBuilder result2 = new StringBuilder(string2);
        String revers = result.reverse().toString();
        String revers2 = result2.reverse().toString();
        return  revers+revers2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
//            return string.replace(charactersToRemove,"");

//        char[] stringToChar = string.toCharArray();
//        char[] removeToChar = charactersToRemove.toCharArray();
//
//
//        StringBuilder sb = new StringBuilder(Arrays.toString(stringToChar));
//        for( int i = 0 ; i < removeToChar.length ; i++) {
//            for ( int j = 0 ; j < stringToChar.length ; j++)
//            if ( removeToChar[i] == stringToChar[j]) {
//                sb.deleteCharAt(i);
//            }
//        }

        return string.replaceAll("[" + charactersToRemove + "]", "");


    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String removed = string.replaceAll("[" + charactersToRemove + "]", "");
        StringBuilder reverse = new StringBuilder(removed);
        return reverse.reverse().toString();
    }
}
