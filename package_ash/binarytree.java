package package_ash;

import java.util.Scanner;

public class binarytree {
    static Scanner sc=new Scanner(System.in);
    static treenode binarytree(){
        System.out.println("Entre data");
        int data= sc.nextInt();
        if(data==-1){
            return null;
        }
        treenode root=new treenode(data);
        System.out.println("Entre left node of "+data);
        root.left=binarytree();
        System.out.println("Entre right node of "+data);
        root.right=binarytree();
        return root;
    }
    public static void inorder(treenode root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    public static void preorder(treenode root){
        if(root!=null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postorder(treenode root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }
    public static void main(String[] args) {
        treenode obj=binarytree();
        inorder(obj);
    }
}
