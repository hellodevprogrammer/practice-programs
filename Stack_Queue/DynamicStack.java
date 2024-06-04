public class DynamicStack extends CustomeStack{
    public DynamicStack(){
        super();//it will call CustomStack()
    }
    public DynamicStack(int size)
    {
        super(size);//it will call CustomStack(int size)
    }
// @Override
    public boolean push(int item){

        // this take care of it being full
        if(this.isFull()){
            // double the size of the array 
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                 temp[i] = data[i];
            }

            data = temp ;
        }

        
        //at this point we know that array is not full
       //insert item
        return super.push(item);
    }
    public static void main(String[] args) {
        
    }
}
