package package_ash;

public class linearsearch {
    public static int search(int a[],int item){
        int i;
        for( i=0;i<a.length;i++){
            if(a[i]==item){
                break;
            }
        }
        if(i==a.length){
            System.out.println("element not present");
            return -1;
        }
        return i;
    }

    public static int bsearch(int a[],int item){
        int i=0,j=a.length-1;
        int mid=-5;
        int lb=i;
        int ub=j;
        while(lb<=ub){

            mid=(lb+ub)/2;
            if(a[mid]==item){
                break;
            }
            else if(a[mid]<item){
                lb=mid+1;
            }else{
                ub=mid-1;
            }
        }
        if(lb>ub){
            System.out.println("Not found");
            return -1;
        }
        return mid;
    }

    public static void main(String[] args) {
        int a[]={2,54,7,8,9,5};
        System.out.println(search(a,0));
        System.out.println("------");
        System.out.println(bsearch(a,0));
    }
}
