public class mainStack {
    public static void main (String[] args) {

        stackOfIntegers stack = new stackOfIntegers();

        for (int i = 0; i < 10; i++){
            stack.push(i);
        }

        while (!stack.empty())
            System.out.print(stack.pop() + " ");

    }
}
