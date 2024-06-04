import java.util.Stack;

public class CustomeStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomeStack() {
        this(DEFAULT_SIZE);
    }

    public CustomeStack(int size) {
        this.data = new int[size];

    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("satck is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("cant not pop from an empty stack");
        }
        int removed = data[ptr];
        --ptr;
        return removed;
    }

    public int peek() throws StackException {

        if (isEmpty()) {
            throw new StackException("cant not peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;// if no element is inserted
    }
}
