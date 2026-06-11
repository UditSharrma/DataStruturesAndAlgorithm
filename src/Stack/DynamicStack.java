package Stack;

public class DynamicStack extends CustomStack {

    public DynamicStack(){
        super();//it will call the CustomStack()
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (isFull()) {
            int[] arr = new int[data.length * 2];

            // copy all previous item into new data
            for (int i = 0; i < data.length; i++) {
                arr[i]=data[i];
            }
            data=arr;
        }
        return super.push(item);
    }

    public boolean isFull() {
        return prt==data.length-1;
    }

    public boolean isEmpty(){
        return prt==-1;
    }
}
