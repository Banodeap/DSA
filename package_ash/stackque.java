package package_ash;

import java.util.*;

public class stackque {
    public static List ngr(int a[]){
        List<Integer> l=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            if(st.empty()){
                l.add(-1);

            }
            else if(!(st.empty()) && st.peek() > a[i]){
                l.add(st.peek());
            }
            else {
                while (!(st.empty()) && st.peek() < a[i]) {
                    st.pop();
                }
                if (!st.empty()) {
                    l.add(st.peek());
                } else {
                    l.add(-1);
                }
            }
            st.push(a[i]);
            System.out.println(l);
        }
        Collections.reverse(l);

        return l;
    }

    public static List ngl(int a[]){
        List<Integer> l=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length;i++){
            if(st.empty()){
                l.add(-1);

            }
            else if(!(st.empty()) && st.peek() > a[i]){
                l.add(st.peek());
            }
            else {
                while (!(st.empty()) && st.peek() < a[i]) {
                    st.pop();
                }
                if (!st.empty()) {
                    l.add(st.peek());
                } else {
                    l.add(-1);
                }
            }
            st.push(a[i]);
            System.out.println(l);
        }
//        Collections.reverse(l);

        return l;
    }

    public static List<Integer> stackspan(int[] a){
        List<Integer> l=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        int c=1;
        for(int i=0;i<a.length;i++){

            if(st.empty()){
                l.add(1);

            }
            else if(!(st.empty()) && st.peek() > a[i]){
                l.add(1);
            }
            else {
                while (!(st.empty()) && st.peek() < a[i]) {
                    st.pop();
                    c++;
                }
                l.add(c);

//                if (!st.empty()) {
//                    l.add(c);
//                } else {
//                    l.add(-1);
//                }
            }
            st.push(a[i]);
            System.out.println(l);
        }
//        Collections.reverse(l);

        return l;
    }
    public static List<Integer> stackspan2(int[] a){
        List<Integer> l=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        for(int i=0;i<a.length;i++){
            if(st.empty()){
                l.add(-1);

            }
            else if(!(st.empty()) && st.peek() > a[i]){
                l.add(st2.peek());

            }
            else {
                while (!(st.empty()) && st.peek() < a[i]) {
                    st.pop();
                    st2.pop();
                }
                if (!st.empty()) {
                    l.add(st2.peek());

                } else {

                    l.add(-1);
                }
            }
            st.push(a[i]);
            st2.push(i);
        }
        for(int i=0;i<a.length;i++){
            l.set(i,i-l.get(i)
            );
        }

        return l;
    }

    public int[] dailyTemperatures(int[] arr) {
        Stack<int []> st = new Stack<>();
        int n = arr.length;
        int k = n-1;
        int ans[] = new int[n];

        for(int i=n-1; i>=0; i--){

            if(st.size() == 0)
                ans[k--] = 0;

            else if(st.size()>0 && st.peek()[0] > arr[i])
                ans[k--] = 1;
            else if(st.size()>0 && st.peek()[0] <= arr[i]){
                while(st.size()>0 && st.peek()[0] <= arr[i])
                    st.pop();

                if(st.size() == 0)
                    ans[k--] = 0;
                else
                    ans[k--] = st.peek()[1] - i;
            }
            st.push(new int[]{arr[i], i});

        }
        return ans;
    }

    public static void main(String[] args) {
        int[]a={100, 80, 60, 70, 60, 75, 85};
        List<Integer>l=new ArrayList<>();
//        l=ngr(a);
//        System.out.println(l);
//        System.out.println(ngl(a));
        System.out.println(stackspan(a));
        System.out.println(stackspan2(a));
//        for(int i:l){
//            System.out.println(i);
//        }
    }
}
