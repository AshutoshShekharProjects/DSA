public class QueueAR {
    static class Queue{
        static int[] arr;
        static int rear;
        static int size;
        Queue(int n){
            size=n;
            arr=new int[size];
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static boolean isFull(){
            return rear==size-1;
        }
        public static void add(int data){
            if(isFull()) {
                System.out.println("Queue Full");
                return;
            }
            arr[++rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }
            return arr[0];
        }
        public static void main(String[] args){
            Queue q=new Queue(5);
            add(1);
            add(2);
            add(3);
            while(!isEmpty()){
                System.out.println(remove());
            }
            add(1);
            add(2);
            add(3);
            System.out.println("Peeked:"+peek());
            System.out.println("Removed:"+remove());
            System.out.println("Peeked:"+peek());
        }
    }
}
