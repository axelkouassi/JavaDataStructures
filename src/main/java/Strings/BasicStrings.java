package Strings;

import java.util.Arrays;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {

        return string2 + string1;
    }

    public char getChar(String string, int index) {

        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String result = "";
        for(int i = 0; i <string.length(); i++){
            result += " ";
        }
        return result;
    }

    public String loudAndClear(String string) {

        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        String result = "";
        char temp = 0;
        for(int i = 0; i < string.length(); i++){
            if(Character.isLowerCase(string.charAt(i))){
                temp = Character.toUpperCase(string.charAt(i));
                result += temp;
                continue;
            }else if(Character.isUpperCase(string.charAt(i))){
                temp = Character.toLowerCase(string.charAt(i));
                result += temp;
                continue;
            }
            result += string.charAt(i);
        }
        return result;
    }

    public String oneAtATime(String string1, String string2) {
        return null;
    }
}
