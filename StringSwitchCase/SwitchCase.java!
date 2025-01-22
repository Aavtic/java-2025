import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();

        for (byte i=0; i<str.length(); ++i) {
            if (Character.toLowerCase(str[i]) == 'a' || Character.toLowerCase(str[i]) == 'e' || Character.toLowerCase(str[i]) == 'i' || Character.toLowerCase(str[i]) == 'o' || Character.toLowerCase(str[i]) == 'u')
                if (str[i] > ('a' - 1) && str[i] < ('z' + 1))
                    str[i] -= 32;
            else
                if (Character.isLetter(str[i]))
                    if (Character.isUpperCase(str[i]))
                        str[i] += 32;
        }
        System.out.println(str);
    }
}
