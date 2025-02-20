public class CircularQueueAR {
    public static class Queue{
        static int[] arr;
        static int rear=-1;
        static int front=-1;
        static int size;
        Queue(int n){
            size=n;
            arr=new int[size];
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue Full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            int res=arr[front];
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return res;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args){
        //Queue q=new Queue(5);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        Queue.add(5);
        while(!Queue.isEmpty()){
            System.out.println(Queue.remove());
        }
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        Queue.add(5);
        System.out.println("Removing:"+ Queue.remove());
        Queue.add(6);
        System.out.println("Removing:"+ Queue.remove());
        Queue.add(7);
        while(!Queue.isEmpty()){
            System.out.println(Queue.remove());
        }
    }
}
