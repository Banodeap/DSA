package package_ash;

public class double_queue {
    int a[];
    int size;
    int front,rear;
    double_queue(int size){
        this.size=size;
        a=new int[size];
        front=-1;
        rear=-1;
    }
    public boolean isEmpty(){
        if(front==-1 && rear==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(front==rear+1 || (front==0 && rear==size-1)) {
            return true;
        }
        return false;
    }

    public void insertFront(int data){
        if(isFull()){
            System.out.println("Overlflow");
            return;
        }
        else if(front==-1 && rear==-1){
            front=0;
            rear=0;
        }else if(front==0){
            front=size-1;
        }else{
            front--;
        }
        a[front]=data;
    }

    public void insertEnd(int data){
        if(isFull()){
            System.out.println("Overlflow");
            return;
        }
        else if(front==-1 && rear==-1){
            front=0;
            rear=0;
        }else{
            rear=(rear+1)%size;
        }
        a[rear]=data;
    }

    public int deleteFront(){
        if(isEmpty()){
            System.out.println("UnderFlow");
            return -99;
        }else {
            int temp=a[front];
            if(front==rear){
                front=-1;
                rear=-1;
            }else{
                front=(front+1)%size;
            }
            return temp;
        }
    }

    public int deleteRear(){
        if(isEmpty()){
            System.out.println("UnderFlow");
            return -99;
        }else{
            int temp=a[rear];
            if(front==rear){
                front=-1;
                rear=-1;
            }else if(rear==0){
                rear=size-1;
            }else{
                rear--;
            }
            return temp;
        }
    }
    public void display(){
        if(front<rear){
            for(int i=front;i<=rear;i++){
                System.out.print(a[i]);
            }
        }else{
            for(int i=front;i<size;i++){
                System.out.print(a[i]);
            }
            for(int i=0;i<=rear;i++){
                System.out.print(a[i]);
            }
            System.out.println("");
        }
    }
}
