import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("String: " + str);
        
        System.out.println("Enter a Char:  ");
        char c = sc.nextLine().charAt(0);
        System.out.println("Char: " + c);

        System.out.println("Enter a Integer:  ");
        int i = sc.nextInt();
        System.out.println("Integer: " + i);

        System.out.println("Enter a Short:  ");
        int s = sc.nextShort();
        System.out.println("Short: " + s);

        System.out.println("Enter a Long:  ");
        long l = sc.nextLong();
        System.out.println("Long: " + i);

        System.out.println("Enter a Float:  ");
        float f = sc.nextFloat();
        System.out.println("Float: " + f);

        System.out.println("Enter a Double:  ");
        double d = sc.nextDouble();
        System.out.println("Double: " + f);
    }
}
