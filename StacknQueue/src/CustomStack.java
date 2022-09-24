
public class CustomStack {
    protected int[] data;
    protected int ptr =-1;
    private static final int  DEFAULT_SIZE  = 12;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data =new int[size];
    }

    public boolean push(int element) throws StackException {
        if (isFull()){
            throw new StackException("No element can be added Stack is Full");
        }
        data[++ptr] = element;
        return true;

    }
    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("No element can be removed Stack is Empty");
        }
        return data[ptr--];

    }

    public int peek() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot peek, Stack is Empty");
        }
        return data[ptr];

    }

    protected boolean isFull() {
        return ptr == data.length - 1;
    }
    private boolean isEmpty() {
        return ptr == -1;
    }
}
