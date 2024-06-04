public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

   protected int end = 0;
   protected int front = 0;
   private int  size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];

    }


    public boolean isFull() {
        return size == data.length ; // ptr is at last index
    }

    public boolean isEmpty() {
        return size == 0;// if no element is inserted
    }


    public boolean insert(int item)
    {
      if (isFull()) {
        return false;
      }
      data[end++] = item;

      end =end % data.length;
      size++;
      return true;
    }


    public int remove() throws Exception{
        if(isEmpty())
        {
            throw new Exception("queue is empty cant remove element");
        }
        int remove = data[front++];
          front = front % data.length;
          size--;
                
        return remove;
    }

    public int front() throws Exception
    {

        if (isEmpty()) {
            throw new Exception("EMPTY QUEUE");
        }
        return data[front];

    }

    public void display()
    {
        for (int i = front; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("end");
    }

}
