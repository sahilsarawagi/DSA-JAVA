public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    protected int end =0,front = 0;
    private int size=0;
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }
    public Boolean insert(int element) throws Exception {
        if (isFull()){
            throw new Exception("Queue is full");
        }
        data[end++] = element;
        end = end%data.length;
        size++;
        return true;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is EMPTY");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    private boolean isEmpty() {
        return size == 0;
    }
    public int getFront() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }
    public void display() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int ptr  = front;
        do {
            System.out.print(data[ptr++] + "<-");
            ptr =ptr%data.length;
        }while (ptr!=end);
        System.out.println("END");
    }
}
