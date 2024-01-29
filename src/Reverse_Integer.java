import java.util.Stack;

public class Reverse_Integer {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println("Orginal of array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" \nArray after reversed: ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }


    }

}


