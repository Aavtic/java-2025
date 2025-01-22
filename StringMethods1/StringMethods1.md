# Perform the following String Methods and specify the output:
# 1. char charAt(int index)2. int codePointAt(int index)
# 3. int codePointBefore(int index)
# 4. length()


## Code

```
class Main {
    public static void main(String args[]) {
        String str = "Hello";

        System.out.println("charAt = " + str.charAt(1));
        System.out.println("codePointAt = " + str.codePointAt(3));
        System.out.println("codePointBefore = " + str.codePointBefore(3));
        System.out.println("length = " + str.length());
    }
}
```

## Output

```
charAt = e
codePointAt = 108
codePointBefore = 108
length = 5
```
