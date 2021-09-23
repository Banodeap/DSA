package package_ash;

public class circularqueue {
    int a[];
    int front,rear,capacity;

    circularqueue(int c){
        capacity=c;
        rear=-1;
        front=-1;
        a=new int[c];
    }
    public boolean isfull(){
        if((rear==capacity-1 && front==0)|| rear==front-1){
            return true;
        }
        return false;
    }
    public boolean isempty(){
        if(front==-1 && rear==-1){
            return true;
        }
        return false;
    }

    public void enque(int data){
        if(isfull()){
            System.out.println("Overflow "+data);
            return;
        }else if(isempty()){
            front=0;
            rear=0;
            a[rear]=data;
        }else{
            rear=(rear+1)%capacity;
//            if(!isfull()) {
                a[rear] = data;
//            }else{
//                System.out.println("Overflow "+data);
//                return;
//            }
        }
    }
    public int deque(){
        if(isempty()){
            System.out.println("Underflow");
        }else{
            int temp=a[front];
            if(front==rear) {
                front=-1;
                rear=-1;
            }else if(front==capacity-1){
                front=0;
            }
            else{
                front++;
            }
            return temp;
        }
        return -1;
    }
//    public void display(){
//        int j=front;
//        for(int i=front;i<)
//    }
}
