package lesson1;

public class string1 {
    public static void main(String[] args) {
        //String text = "Some text";    // length 9
        String text = "Some" + "Stext";  // length 8
        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        System.out.println(text.replace('S', 'M'));     // replace all char

        System.out.println(text.indexOf('t'));      // index of first matched char, -1 as result if not found
    }
}