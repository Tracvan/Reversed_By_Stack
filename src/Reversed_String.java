import java.util.LinkedList;

public class Reversed_String {
    public static void main(String[] args) {
        String str = "Hello World";
        LinkedList<Character> wStack = new LinkedList<>();
        for (int i=0; i<str.length(); i++){
            wStack.push(str.charAt(i));
        }
        System.out.println("Origin string is: \n" + str);
        System.out.println("After reversed is: ");
        for(int i = 0; i<str.length(); i++){
            System.out.print(wStack.pop());
        }
    }
}
