package package_ash;

import java.util.Scanner;

public class ulinklist {
    node head;
    Scanner sc=new Scanner(System.in);

    public void create() {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        int val;
        node temp = new node();
        temp = head;
        while (b) {
            System.out.println("enter value");
            val = sc.nextInt();
            node n = new node(val);

            if (head== null) {
                head= n;
                temp = n;
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
        if(temp==null){
            head=n1;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n1;
    }

    public void insertbeg(int val){

        node n1=new node(val);
        n1.next=head;
        head=n1;
    }

    public void inseratpos(int val,int pos){
        node temp=head;int i=0;
        if(head==null){
            head=new node(val);
            return;
        }
        while(i<pos-1){
            i++;
            temp=temp.next;
        }

        node n1=new node(val);

        n1.next=temp.next;
        temp.next=n1;
    }

    public void delete(){
        node temp=head;
//        node prev=temp;
        while(temp.next.next!=null){
//            prev=temp;
            temp=temp.next;
        }
        temp.next=null;
    }

    public void deletebeg(){
//        node temp=head.next;
//        head.next=temp.next;
        head=head.next;
    }

    public void deleetatpos(int pos){
        node temp=head;int c=0;
        while(c<pos-1){
            c++;
//            prev=temp;
            temp=temp.next;
        }
//        prev.next=temp.next;
        temp.next=temp.next.next;
    }

    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}
