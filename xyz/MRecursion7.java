//write a function to find the firsty occurence of an element in array
public class MRecursion7 {
    public static int firstOccurence(int array[],int key,int i) {
        //base case
        if(i==array.length){
            return -1;
        }
        if(array[i]==key){
            return i;
        }
        //defining what our function want to do
        return firstOccurence(array,key,i+1);
    }
    public static void main(String[] args) {
        int array[]={8,3, 6,9,5,10,2,5,3} ;
        System.out.println(firstOccurence( array,5,0));
    }
}
