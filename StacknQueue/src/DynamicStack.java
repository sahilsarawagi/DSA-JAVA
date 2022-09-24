

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int element) throws StackException {
        if (super.isFull()){
            int[] temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i] =data[i];
            }
            data= temp;
        }
        // now this array is not full
        // this return will add up element
        return super.push(element);
    }
}
