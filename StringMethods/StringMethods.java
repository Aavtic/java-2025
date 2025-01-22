//1. int indexOf(int ch)2. int indexOf(int ch, int fromIndex)
//3. int indexOf(String str)
//4. int indexOf(String str, int fromIndex) 
//5. int lastIndexOf(int ch)
//6. int lastIndexOf(int ch, int fromIndex)
//7. int lastIndexOf(String str)
//8. int lastIndexOf(String str, int fromIndex)

class Main {
    public static void main(String args[]) {
        String myString = new String("Hello There\n");

        System.out.println("indexOf: " + myString.indexOf((int) ('e'))); // First occurrence of 'e'
        System.out.println("indexOf: " + myString.indexOf("here"));      // First occurrence of "here"
        System.out.println("indexOf: " + myString.indexOf("he", 3));     // "he" starting at index 3
        System.out.println("lastIndexOf: " + myString.lastIndexOf((int) ('e'))); // Last occurrence of 'e'
        System.out.println("lastIndexOf: " + myString.lastIndexOf((int) ('e'), 2)); // Last occurrence of 'e' before index 2
        System.out.println("lastIndexOf: " + myString.lastIndexOf("he", 3)); // Last occurrence of "he" before index 3
        System.out.println("indexOf: " + myString.indexOf("he"));        // First occurrence of "he"
        System.out.println("indexOf: " + myString.indexOf("re", 3));     // "re" starting at index 3
    }
}

