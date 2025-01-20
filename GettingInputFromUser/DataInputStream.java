import java.io.DataInputStream;
import java.io.IOException;

class Main {
    public static void main(String args[]) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        
        System.out.println("Enter a String: ");
        String str = dis.readLine();
        System.out.println("String: " + str);
        
        System.out.println("Enter a Char:  ");
        char c = dis.readLine().charAt(0);
        System.out.println("Char: " + c);

        System.out.println("Enter a Integer:  ");
        int i = Integer.parseInt(dis.readLine());
        System.out.println("Integer: " + i);

        System.out.println("Enter a Short:  ");
        int s = Short.parseShort(dis.readLine());
        System.out.println("Short: " + s);

        System.out.println("Enter a Long:  ");
        long l = Long.parseLong(dis.readLine());
        System.out.println("Long: " + i);

        System.out.println("Enter a Float:  ");
        float f = Float.parseFloat(dis.readLine());
        System.out.println("Float: " + f);

        System.out.println("Enter a Double:  ");
        double d = Double.parseDouble(dis.readLine());
        System.out.println("Double: " + f);
    }
}
