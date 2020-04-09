package exerciciosdainternet.javainterviewprograms;

/*In this method, first we convert given string to char array using charArray() method.
And then we iterate that array in the reverse order.
*/

public class ReverseAString2 {

    public static void main(String[] args) {
        String str = "exemplo";
        char[] strArray = str.toCharArray();

        for (int i = strArray.length -1; i >= 0 ; i--) {
            System.out.println(strArray[i]); //Output : olpmexe (na vertical)
        }
    }
}
