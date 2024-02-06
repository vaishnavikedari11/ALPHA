//merge sort
public class NDivideandConquer1 {

    public static void printArray(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        
    }
    public static void mergeSort(int array[],int si,int ei) {
        //base case 
        if(si>=ei){
            return;
        }
        //work
        int mid=si+(ei-si)/2;//(si+ei)/2
        mergeSort(array, si, mid);//left part
        mergeSort(array, mid+1, ei);//right part
        merge(array,si,mid,ei);
    }
    public static void merge(int array[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp array

        while(i<=mid && j<=ei){
            if(array[i]<array[j]){
                temp[k]=array[i];
                i++;
            }else{
                temp[k]=array[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++]=array[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]=array[j++];
        }
        //copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            array[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int array[]={6,3,9,5,2,8};
        mergeSort(array, 0, array.length-1);
        printArray(array);
    }
}
