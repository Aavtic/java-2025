# Getting Input from User

# Write a program to get byte,short,int,long,float,double,char,boolean as input in run time using the below specified classes
# 1. DataInputStream
# 2. BufferedReader
# 3. Scanner
# 4. System.console()


# 1. DataInputStream

## Code

```
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
```

## Output

```
Enter a String: 
Hello There
String: Hello There
Enter a Char:  
aldsfkjas
Char: a
Enter a Integer:  
234
Integer: 234
Enter a Short:  
234
Short: 234
Enter a Long:  
123123123123
Long: 234
Enter a Float:  
12312.123
Float: 12312.123
Enter a Double:  
1231.1
Double: 12312.123

[Process exited 0]
```


# 2. BufferedReader

## Code

```
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
```

## Output

```
Enter a String: 
UWU   
String: UWU
Enter a Char:  
UR
Char: U
Enter a Integer:  
2034
Integer: 2034
Enter a Short:  
1023
Short: 1023
Enter a Long:  
104120
Long: 2034
Enter a Float:  
3091
Float: 3091.0
Enter a Double:  
231123 
Double: 3091.0
```


# 3. Scanner

## Code

```
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
```

## Output

```
Enter a String: 
Hello Friend
String: Hello Friend
Enter a Char:  
X
Char: X
Enter a Integer:  
324
Integer: 324
Enter a Short:  
4124
Short: 4124
Enter a Long:  
123123
Long: 324
Enter a Float:  
123121.32
Float: 123121.32
Enter a Double:  
123
Double: 123121.32

[Process exited 0]
```


# 4. System.console()

## Code

```
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

```

## Output

```
Enter a String: 
Hello There
String: Hello There
Enter a Char:  
12314
Char: 1
Enter a Integer:  
123123
Integer: 123123
Enter a Short:  
12312
Short: 12312
Enter a Long:  
1231414
Long: 123123
Enter a Float:  
12312.123
Float: 12312.123
Enter a Double:  
123123.1231
Double: 12312.123

[Process exited 0]
```
