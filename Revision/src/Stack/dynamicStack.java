package Stack;

public class dynamicStack extends customStack {

    public dynamicStack(){
        super();
    }

    public dynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            int[] arr=new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                arr[i]=data[i];
            }
            data=arr;
        }
        return super.push(item);
    }
}
