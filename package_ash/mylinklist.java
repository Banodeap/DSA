package package_ash;

import java.util.Scanner;

public class mylinklist {
    node head=new node();
    Scanner sc=new Scanner(System.in);
    public void create() {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        int val;
        node temp = new node();
        temp = head;
        while (b) {
            System.out.println("enter value");
//            node n=new node();
//            n.data=sc.nextInt();
            val = sc.nextInt();
            node n = new node(val);

            if (head.next == null) {
                head.next = n;
                temp.next = n;
            } else {
                temp.next = n;
            }

            temp = n;
            System.out.println("Do you want to continue Y/N");
            String c = sc.next();
            if (c.charAt(0) == 'N') {
                b = false;
            }
        }
    }

    public  void insert(int val){
        node temp=head;
        node n1=new node();
        n1.data=val;
        n1.next=null;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n1;
    }

    public void insertbeg(int val){
//        node temp=head;
//        temp.next=head.next;
        node n1=new node(val);
        n1.next=head.next;
        head.next=n1;
    }

    public void inseratpos(int val,int pos){
        node temp=head;int i=0;
        while(i<pos){
            i++;
            temp=temp.next;
        }

        node n1=new node(val);
//        node temp2=temp.next;
//        temp.next=n1;
//        n1.next=temp2;
        n1.next=temp.next;
        temp.next=n1;
    }

    public void delete(){
        node temp=head;
        node prev=temp;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }

    public void deletebeg(){
        node temp=head.next;
        head.next=temp.next;
    }

    public void deleetatpos(int pos){
        node temp=head;int c=0;node prev=temp;
        while(c<pos){
            c++;
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }

        public void display(){
            node temp=head.next;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }


}
