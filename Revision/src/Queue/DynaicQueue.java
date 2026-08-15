package Queue;

public class DynaicQueue extends CustomQueue {
    public DynaicQueue() {
        super();
    }

    public DynaicQueue(int size) {
        super(size);
    }

    @Override
    public void insert(int item){
        if (this.isFull()){
            int[] temp=new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        super.insert(item);
    }
}
