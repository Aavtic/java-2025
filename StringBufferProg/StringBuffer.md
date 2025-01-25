# String Buffer

# - Implement all string methods in StringBuffer class and list out the methods which adapts for stringbuffer concept


### String and String Buffer class in Java works on array of characters. but they differ in Mutability. String is Immutable but a StringBuffer is Mutable.
### There are some methods which are possible in String but not in StringBuffer, They are implemented below on StringBuffer class which ofcourse will result in 
### an Compilation Error

## Code

```
class Main {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello There");
        // Methods in StringBuffer class
        // Append method

        System.out.println("String: " + sb);
        
        System.out.println("" + sb.toLowerCase());
        System.out.println("" + sb.toUpperCase());
        System.out.println("" + sb.trim());
        System.out.println("" + sb.toUpperCase());
        System.out.println("" + sb.equals());
    }
}
```

## Output

```
StringBufferEg.java:9: error: cannot find symbol
        System.out.println("" + sb.toLowerCase());
                                  ^
  symbol:   method toLowerCase()
  location: variable sb of type StringBuffer
StringBufferEg.java:10: error: cannot find symbol
        System.out.println("" + sb.toUpperCase());
                                  ^
  symbol:   method toUpperCase()
  location: variable sb of type StringBuffer
StringBufferEg.java:11: error: cannot find symbol
        System.out.println("" + sb.trim());
                                  ^
  symbol:   method trim()
  location: variable sb of type StringBuffer
StringBufferEg.java:12: error: cannot find symbol
        System.out.println("" + sb.toUpperCase());
                                  ^
  symbol:   method toUpperCase()
  location: variable sb of type StringBuffer
StringBufferEg.java:13: error: method equals in class Object cannot be applied to given types;
        System.out.println("" + sb.equals());
                                  ^
  required: Object
  found:    no arguments
  reason: actual and formal argument lists differ in length
5 errors
```
