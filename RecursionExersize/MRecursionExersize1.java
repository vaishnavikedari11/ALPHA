//: For a given integer array of size N.
// You have to ﬁnd all the occurrences (indices) of a given element (Key) 
//and print them.
// Use a recursive function to solve this problem.
public class MRecursionExersize1 {
    public static int findOccurence(int array[],int key,int i) {
        //base case
        if(i==array.length){
            return -1;
        }
        //work
        if(array[i]==key){
            System.out.println(i+" ");
        }
         return findOccurence(array, key, i+1);
    }
    public static void main(String[] args) {
        int array[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        System.out.println();
        findOccurence(array, key, 0);


    }
}
