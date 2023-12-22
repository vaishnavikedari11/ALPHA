//find a peak element which is not smaller than its neighbours
//
public class FArrays8 {
    public static int findPeakElement(int array[],int lower,int higher,int n) {
        int mid=(lower+higher)>>1;
        for(int i=0;i<=n;i++){
            //compare middle element with its neighbours
            if(mid==0 || array[mid-1]<=array[mid] && (mid==n-1 || array[mid+1]<=array[mid])){
                return  mid;
            }else if(mid>0 && array[mid-1]>array[mid]){
                return findPeakElement(array, lower, (mid-1), n);
            }else{
                return findPeakElement(array, (mid+1), higher, n);
            }
        }
        return findPeakElement(array, lower, higher, n);
        
    }
    public static void main(String[] args) {
        int array[]={5,10,20,15};
        int n=array.length;
        System.out.println("the peak element is "+array[findPeakElement(array, 0, n-1, n)]);

    }
}
