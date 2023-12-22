import java.util.Random;

//find the  kth largest and  kth smallest number in an array
public class FArrays12 {
    // public static int smallestLargestNumber(int array[]) {
    //     int smallest=Integer.MAX_VALUE;
    //     int largest=Integer.MIN_VALUE;
    //     for(int i=0;i<array.length;i++){
    //         if(largest<array[i]){
    //             System.out.println("largest number is = " +largest);
    //         }else{
    //             System.out.println("smallest number is = "+smallest);
    //         }
    //     }

    //     return smallest;
    // }
    // public static void main(String[] args) {
    //     int array[]={2,4,1,6,7,8,4,5,4};
    //     smallestLargestNumber(array);
    // }

    void swap(int array[],int l,int r){
        int temp=array[l];
        array[l]=array[r];
        array[r]= temp;
    }
    int randomPartition(int array[],int l,int r){
        int n=r-l+1;
        Random rd=new Random();
        int pivot=rd.nextInt(n);
        swap(array, l+pivot, r);
        return randomPartition(array, l, r);
    }
    int kthSmallest(int array[],int l,int r,int k){
        //if k is smaller than that nuber in array
        if(k>0 &&k<=r-l+1){
            //find position for random partitrion
            int position=randomPartition(array, l, r);
            //if thids position gives the kth smallest element then return
            if(position-l==k-1){
                return array[position];
            }
            //else recurrse for the left and right half accordingly
            if(position-l>k-1){
                return kthSmallest(array, position+1, r, k-position+l-1);
            }
            return Integer.MAX_VALUE;
        }

        int partition(int array[],int l,int r){
            int x=array[r],i=l;
            for(int j=l;j<=r-1;j++){
                if(array[j]<=x){
                    swap(array, i, j);
                    i++;
                }
            }
            swap(array, i, r);
            return i;
        }
    }

    
    public static void main(String[] args) {
        int array[]={2,3,4,5,7,34,7,9};
        
    }
}
