public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        for (int i = rows; i >= 1; i--) { // Loop from 5 down to 1
            for (int j = 1; j <= i; j++) { // Loop to print stars
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}




Stack :

1. Syntax ----->Stack<String> a = new Stack<String>();
2.LIFO(Last in first out)
3.a.push() -----> stacks/adds element one above other
4.a.pop() -----> removes topmost(last element you gave through push method)
5.a.empty() -----> gives true if stack is empty and vice versa 
6.a.peek() -----> shows the topmost element in the stack
7.Used in : Undo/Redo
            backward/forward button on google

Queue :
1.Syntax ------> Queue<String> a = new LinkedList<>();
2.FIFO(First in first out)
3.a.offer() ------> same as push
4.a.poll() ------> same as pop
5.a.peek() same
6.a.contains("...")
7.a.isEmpty()