//back tracking on array
public class OBackTracking1 {
    public static void changeArray(int array[],int i,int value) {
        //base case
        if(i==array.length){
            printArray(array);
            return;
        }
        //recursion
        array[i]=value;
        changeArray(array, i+1, value+1);
        array[i]=array[i]-2;
    }
    public static void printArray(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[]=new int[5];
        changeArray(array, 0, 0);
        printArray(array);
    }
}
