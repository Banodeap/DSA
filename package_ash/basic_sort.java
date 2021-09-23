package package_ash;

import java.util.Arrays;

public class basic_sort {
    public static void main(String[] args) {
        int[] a={3,6,4,7,1,5,9,2};
        int[] b={1,2,4,5,6,2,1};
//        selection(a);
//
//        for(int i:a){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        selection(b).toString();
//        for(int i:b){
//            System.out.print(i+" ");
//        }
//        System.out.println("-----");
//        bubble(a);
//        for(int i:a){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        bubble(b).toString();
//        for(int i:b){
//            System.out.print(i+" ");
//        }
        System.out.println("-----");
        insertion(a);
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        insertion(b).toString();
        for(int i:b){
            System.out.print(i+" ");
        }
    }

    public static int[] selection(int a[]){
        int min=0;int i,j;int temp;
        for( i=0;i<a.length;i++){
            min=i;
            for(j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
//                    temp=a[j];
//                    a[j]=a[i];
//                    a[i]=temp;
                }
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        return a;
    }

    public static int[] bubble(int a[]){
        int i,j;boolean b=true;
        for(i=0;i<a.length-1;i++){
            b=true;
            for(j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    b=false;
                }
            }
            if(b){
                break;
            }
        }
        return a;
    }

    public static int[] insertion(int a[]){
        int i,j;
        int temp;
        int temp2;
        for(i=1;i<a.length;i++){
            j=i-1;
            temp=a[i];
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        return a;
    }
}
