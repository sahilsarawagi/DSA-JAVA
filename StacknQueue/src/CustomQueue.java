public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end =0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size] ;
    }

    public boolean insert(int element) throws Exception {
        if (isFull()){
            throw new Exception("Queue is full");
        }
        data[end++] =  element;
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed =data[0];
        for (int i = 1; i <end ; i++) {
            data[i-1] =data[i];
        }
        end--;
        return removed;
    }
    public void display(){
        if (isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "<-");
        }
        System.out.println("END");
    }
    protected boolean isFull() {
        return end== data.length;
    }
    protected boolean isEmpty() {
        return end==0;
    }

}
