//quick sort
public class NDivideandConquer2 {
    public static void printArray(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int array[],int si,int ei) {
        //base case
        if(si>=ei){
            return;
        }
        //work
        //last element
        int pivotIndex=partition(array,si,ei);
        quickSort(array, si, pivotIndex-1);//left
        quickSort(array, pivotIndex+1, ei); //right
    }
    public static int partition(int array[],int si,int ei) {
        int pivot=array[ei];
        int i=si-1;//to make place for elements smlaller than pivot
    
    for(int j=si;j<ei;j++){
            if(array[j]<=pivot){
                i++;
                //awap
                int temp=array[j];
                array[j]=array[i];
                array[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        array[ei]=array[i];
        array[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int array[]={6,3,9,8,2,5};
        quickSort(array, 0, array.length-1);
        printArray(array);
    }
}
