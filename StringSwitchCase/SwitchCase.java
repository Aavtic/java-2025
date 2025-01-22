import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        StringBuilder newString = new StringBuilder(str);

        for (byte i=0; i<newString.length(); ++i) {
            if (Character.toLowerCase(newString.charAt(i)) == 'a' || Character.toLowerCase(str.charAt(i)) == 'e' || Character.toLowerCase(str.charAt(i)) == 'i' || Character.toLowerCase(str.charAt(i)) == 'o' || Character.toLowerCase(str.charAt(i)) == 'u') {
                if (newString.charAt(i) > ('a' - 1) && newString.charAt(i) < ('z' + 1))
                    newString.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else
                if (Character.isLetter(newString.charAt(i)))
                    if (Character.isUpperCase(newString.charAt(i))) {
                        char lc = Character.toLowerCase(str.charAt(i));
                        newString.setCharAt(i,  lc);
                    }
        }
        System.out.println(newString);
    }
}
