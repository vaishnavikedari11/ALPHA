//Apply Merge sort to sort an array of Strings.
//(Assume that all the characters in all the Strings are in lowercase).
public class NDivideandConquerExersize1 {
    public static String[] mergeSort(String array[],int lo,int hi) {
        //base case
        if(lo==hi){
            String[]A={array[lo]};
            return A;
        }
        int mid=lo+(hi-lo)/2;
        String[]array1=mergeSort(array, lo, hi);
        String[]array2=mergeSort(array1, mid+1, hi);
        String[] array3=merge(array1,array2);
        return array3;  
    }
    static String[] merge(String[] array1,String[]array2){
        int m=array1.length;
        int n=array2.length;
        String[] array3=new String(m+n);

        int index=0;
        int i=0;
        int j=0;

        while(i<m && j<n){
            if(isAlphabeticallySmaller(array1[i],array2[j])){
                array3[index]=array1[i];
                i++;
                index++;
            }else{
                array3[index]=array2[j];
                j++;
                index++;
            }
            while(i<m){
                array3[index]=array1[index];
                i++;
                index++;
            }
            while(j<n){
                array3[index]=array2[j];
                j++;
                index++;
            }
            return array3;
        }
        //return true if str1 appears before str2 in alphabetical order
        static boolean isAlphabeticallySmaller(String str1,String str2) {
            if(str1.compareTo(str2)<0){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        String  array[]={"sun","earth","mars","mercury"};
        String[] a=mergeSort(array, 0, array.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
