public class DynamicStackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stac = new DynamicStack(3);
        stac.push(53);
        stac.push(56);
        stac.push(54);
        stac.push(58);
        stac.pop();
    }
}
