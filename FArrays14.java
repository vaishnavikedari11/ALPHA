//sort the array of 0s.1s.and 2s
public class FArrays14 {
    public static void sortArray(int array[],int n) {
        int low=0,high=n-1,mid=0;
        
            while(mid<=high){
                if(array[mid]==0){
                    int temp=array[low];
                    array[low]=array[mid];
                    array[mid]=temp;
                    low++;
                    mid++;
                }else if(array[mid]==1){
                    mid++;
                }else{
                    int temp=array[mid];
                    array[mid]=array[high];
                    array[high]=temp;
                    high--;
                }
            }
        
        
    }
    public static void main(String[] args) {
        int n=5;
        int array[]={0,2,1,2,0};
        System.out.println(sortArray(array, n));
    }
}
