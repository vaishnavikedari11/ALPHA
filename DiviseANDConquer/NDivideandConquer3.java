//search in roteated sorted array
public class NDivideandConquer3 {
    public static int search(int array[],int target,int si,int ei) {
        //base case

        //work
        int mid=si+(ei-si)/2;
       
        //case found
        if(array[mid]==target){
            return mid;
        }
        //mid on l1
        if(array[si]<=array[mid]){
            //case a :;left
            if(array[si]<=target && target <=array[mid]){
                return search(array, target, si, mid-1);
            }else{
                //case b:right
                return search(array, target, mid+1, ei);
            }
        }
        //mid on l2
        else{
            //case c: right
            if(array[mid]<= target && target<=array[mid]){
                return search(array, target, mid+1, ei);
            }else{
                //case d: left
                return search(array, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int array[]={4,5,6,7,0,1,2};
        int target=0;//output =4
        int targetIndex=search(array, target, 0, array.length-1);
        System.out.println(targetIndex);
    }
}
