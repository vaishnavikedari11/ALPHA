//check if given array is sorted or not
public class MRecursion6 {
    public static boolean isSorted(int array[],int i) {
        //base case
        if(i==array.length-1){
            return true;
        }
        if(array[i]>array[i+1]){
            return false;
        }
        //definig  what our function want to do
        return isSorted(array,i+1);
    }
    public static void main(String[] args) {
        //int array[]={ 1,2,3,4} ;
        int array[]={1,3,2,4,6,3};
        System.out.println(isSorted(array,0));

    }
}
