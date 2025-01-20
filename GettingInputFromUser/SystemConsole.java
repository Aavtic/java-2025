class Main {
    public static void main(String args[]) {
        System.out.println("Enter a String: ");
        String str = System.console().readLine();
        System.out.println("String: " + str);
        
        System.out.println("Enter a Char:  ");
        char c = System.console().readLine().charAt(0);
        System.out.println("Char: " + c);

        System.out.println("Enter a Integer:  ");
        int i = Integer.parseInt(System.console().readLine());
        System.out.println("Integer: " + i);

        System.out.println("Enter a Short:  ");
        int s = Short.parseShort(System.console().readLine());
        System.out.println("Short: " + s);

        System.out.println("Enter a Long:  ");
        long l = Long.parseLong(System.console().readLine());
        System.out.println("Long: " + i);

        System.out.println("Enter a Float:  ");
        float f = Float.parseFloat(System.console().readLine());
        System.out.println("Float: " + f);

        System.out.println("Enter a Double:  ");
        double d = Double.parseDouble(System.console().readLine());
        System.out.println("Double: " + f);
    }
}
