//linear search--searching line by line
//find value x=10
public class FArrays2 {
    public static int linearSearch(int n[],int key) {
        for(int i=0;i<=n.length;i++){
            if(n[i]==10){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10,12,14,16};
        int key=10;

        int index=linearSearch(n, key);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("found at index = "+index);
        }
    }
}
