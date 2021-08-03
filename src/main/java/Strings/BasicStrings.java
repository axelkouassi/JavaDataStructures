package Strings;

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
        return null;
    }

    public String reverseCase(String string) {
        return null;
    }

    public String oneAtATime(String string1, String string2) {
        return null;
    }
}
