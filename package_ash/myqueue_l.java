package package_ash;

public class myqueue_l {
    int a[];
    int front,rear;
    int c;
    myqueue_l(int c){
        front=-1;
        rear=-1;
        this.c=c;
        a=new int[c];
    }
    public void enque(int data){

        if(front==-1){
            front=0;
            rear=0;
            a[rear]=data;
        }else if(rear==c-1){
            System.out.println("overflow "+data);
            return;
        }
        else{
            a[++rear]=data;
        }
    }

    public int deque(){
        if(front==-1 || front>rear){
            System.out.println("queue underflow");
            return -99;
        }else{
            int temp;
            temp=a[front];
            if(front==rear){
                front=-1;
                rear=-1;
            }else{
                front++;
            }
            return temp;
        }
    }
}
