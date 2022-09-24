public class CircularQueueMain {
    public static void main(String[] args) throws Exception{
        CircularQueue circularQueue =new CircularQueue(4);
        circularQueue.insert(5);
        circularQueue.insert(57);
        circularQueue.insert(45);
        circularQueue.insert(53);
        circularQueue.display();
        circularQueue.remove();
        System.out.println(circularQueue.getFront());
        circularQueue.insert(77);
        circularQueue.display();
        circularQueue.remove();
        circularQueue.display();

    }
}
