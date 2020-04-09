package exerciciosdainternet.javainterviewprograms.recursivemethod;

//Here is the method which reverses the string by calling itself recursively

public class ReverseAString3 {
    static String recursiveMethod(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}