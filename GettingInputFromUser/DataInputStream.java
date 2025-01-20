import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a String: ");
        String str = br.readLine();
        System.out.println("String: " + str);
        
        System.out.println("Enter a Char:  ");
        char c = br.readLine().charAt(0);
        System.out.println("Char: " + c);

        System.out.println("Enter a Integer:  ");
        int i = Integer.parseInt(br.readLine());
        System.out.println("Integer: " + i);

        System.out.println("Enter a Short:  ");
        int s = Short.parseShort(br.readLine());
        System.out.println("Short: " + s);

        System.out.println("Enter a Long:  ");
        long l = Long.parseLong(br.readLine());
        System.out.println("Long: " + i);

        System.out.println("Enter a Float:  ");
        float f = Float.parseFloat(br.readLine());
        System.out.println("Float: " + f);

        System.out.println("Enter a Double:  ");
        double d = Double.parseDouble(br.readLine());
        System.out.println("Double: " + f);
    }
}
