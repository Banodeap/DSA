package package_ash;

public class runlinklist {
    public static void main(String[] args) {

//        ulinklist l1=new ulinklist();
//        l1.create();
//        l1.inseratpos(4,0);
//        l1.insertbeg(1);
//        l1.insert(4);
//        l1.deleetatpos(2);
//        l1.deletebeg();
//        l1.delete();
//        l1.display();

//        mylinklist l=new mylinklist();
//        l.create();
//        l.inseratpos(4,2);
//        l.insertbeg(1);
//        l.insert(5);
//        l.delete();
//        l.deletebeg();
//        l.deleetatpos(3);
//        l.display();

//        myqueue_l my=new myqueue_l(5);
//        circularqueue my=new circularqueue(5);
//        my.enque(1);
//        my.enque(2);
//        my.enque(3);
//        my.enque(4);
//        my.enque(5);
//
//        System.out.println(my.deque());
//        System.out.println(my.deque());
//        System.out.println(my.deque());
//        System.out.println(my.deque());
//        my.enque(7);
//        my.enque(8);
//        my.enque(9);
//        my.enque(6);
//        System.out.println(my.deque());
//        System.out.println(my.deque());
//        System.out.println(my.deque());
//        System.out.println(my.deque());
//        System.out.println(my.deque());
//
//        System.out.println(my.deque());
//        System.out.println(my.deque());

        double_queue d=new double_queue(5);
        d.insertEnd(3);
        d.insertEnd(4);
        d.insertFront(5);
        d.insertEnd(2);
        d.insertFront(7);
        d.insertEnd(9);
        d.insertFront(10);
        d.display();
        System.out.println(d.deleteFront());
        System.out.println(d.deleteRear());
        System.out.println(d.deleteFront());
        System.out.println(d.deleteRear());
        System.out.println(d.deleteFront());
        System.out.println(d.deleteRear());
        d.insertEnd(3);
        d.insertEnd(4);
        System.out.println(d.deleteFront());
        System.out.println(d.deleteRear());
    }
}
