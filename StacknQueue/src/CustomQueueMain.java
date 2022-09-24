public class CustomQueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue que = new CustomQueue(4);
        que.insert(6);
        que.insert(69);
        que.insert(68);
        que.insert(61);
        que.display();
        que.remove();
        que.display();
        que.remove();
        que.display();
        que.remove();
        que.display();
        que.remove();
        que.display();
//        que.remove();
    }
}
