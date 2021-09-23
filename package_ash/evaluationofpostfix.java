package package_ash;

public class evaluationofpostfix {
    public static void main(String[] args) {
        String s="231*+9-";
        System.out.println(evaluate.evaluates(s));

    }
}
class evaluate{
    public static int ops(char c,int x,int y){
        switch (c) {
            case '+':
                return x+y;
            case '-':
                return y-x;
            case '%':
                return y%x;
            case '*':
                return x*y;
            case '^':
                return y^x;
            default:
                return -1;
        }
    }
    public static int evaluates(String s){
        stack s1=new stack (100);int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='%' || s.charAt(i)=='*' || s.charAt(i)=='^'  ){
                int x=s1.pop();
                int y=s1.pop();
                sum=ops(s.charAt(i),x,y);
                s1.push(sum);

            }else{
                s1.push(Character.getNumericValue(s.charAt(i)));
            }
        }
        return sum;
    }
}