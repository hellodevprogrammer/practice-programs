public class Stackmain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
