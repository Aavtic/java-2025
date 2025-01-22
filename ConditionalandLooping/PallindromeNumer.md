# Pallindrome Number LeetCode


## Code

```
class Main {
    public static void main(String args[]) {
        int x = 121;
        String n = String.valueOf(x);
        StringBuffer reverse = new StringBuffer();

        for (int i=n.length()-1; i>-1; i--) {
            reverse.append(n.charAt(i));
        }

        System.out.println(n + ", " + reverse.toString());
        if (n.equals(reverse.toString())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
```

## Output

```
true
```
