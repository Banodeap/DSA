package package_ash;

import java.util.Scanner;

class treenode{
    int data;
    treenode left;
    treenode right;
    treenode(int data){
        this.data=data;
    }
}

public class BST {
    static Scanner sc=new Scanner(System.in);
    treenode root;
    treenode createtree(int data){
        treenode node=new treenode(data);
        if(root==null){
            root=node;

        }else {
            treenode prev=null;
            treenode temp=root;
            while(temp!=null) {
                if (temp.data > data) {
                    prev = temp;
                    temp = temp.left;
                } else {
                    prev = temp;
                    temp = temp.right;
                }
            }
            if(prev.data>data){
                prev.left=node;
            }else{
                prev.right=node;
            }
        }
        return root;
    }
     static void inorder(treenode root){
        treenode temp=root;
        if(temp!=null) {
            inorder(temp.left);
            System.out.println(temp.data);
            inorder(temp.right);
        }
    }
    public static void main(String[] args) {
        int a[]={2,5,4,7,3,9};
        BST obj=new BST();
        for( int i=0;i<a.length;i++){
            obj.createtree(a[i]);
        }
//        System.out.println((obj.root).data);
        obj.inorder(obj.root);

    }
}
