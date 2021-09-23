package package_ash;

public class sort2 {
    public static void main(String[] args) {
        int arr[]={2,5,3,1,9,7,8};
        merge(arr,0,arr.length-1);
        display(arr);
//        quick(arr,0,arr.length-1);
//        display(arr);
    }

    public static void merge(int a[],int l,int r){
        int mid;
        if(l<r){
            mid=(l+r)/2;
            merge(a,l,mid);
            merge(a,mid+1,r);
            combine(a,l,mid,r);
        }
    }
    public static void combine(int a[],int lb,int mid,int rb){
        int l=lb,r=mid+1;int i=0;

        int a1[]=new int[mid-lb+1];
        int a2[]=new int[rb-mid];

        for(int k=0;k<a1.length;k++){
            a1[k]=a[l+k];
        }
        for(int k=0;k<a2.length;k++){
            a2[k]=a[r+k];
        }
        l=0;
        r=0;
        int t=lb;
        while(l<a1.length && r<a2.length){
            if(a1[l]<a2[r]){
                a[t]=a1[l];
                l++;
            }else{
                a[t]=a2[r];
                r++;
            }
            t++;
        }
        while(l< a1.length){
            a[t]=a1[l];
            l++;
            t++;
        }
        while(r<a2.length){
            a[t]=a2[r];
            r++;
            t++;
        }
    }

    public static void display(int a[]){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    public static void quick(int a[],int l,int h){
        if(l<h){
            int pivot=partition(a,l,h);
            quick(a,l,pivot-1);
            quick(a,pivot+1,h);
        }
    }
    public static int partition(int a[],int l,int h){
        int pivot=a[l];
        int i=l,j=h;
        while(i<j){
            while(a[i]<pivot){
                i++;
            }
            while(a[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        if(j<l){
            int temp=a[l];
            a[l]=a[j];
            a[j]=temp;
        }
        return j;
    }
}

