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
