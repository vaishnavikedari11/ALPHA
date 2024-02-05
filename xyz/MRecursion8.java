//write a function to find last occurence of an element in array
public class MRecursion8 {
    public static int  lastOccurence(int array[],int key,int i) {
        //base case
        if(i==array.length){
            return -1;
        }
        int isFound=lastOccurence(array, key, i+1);
        if(isFound==-1 && array[i]==key){
            return i;
        }
        //defining what our function want to do
        
        return isFound;

    }
    public static void main(String[] args) {
        int array[]={8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurence(array, 5, 0));
    }
}
