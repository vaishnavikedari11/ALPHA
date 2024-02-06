// Given an array nums of size n, returnthe majority element. (MEDIUM)
//The majority element is the element that appears more than ⌊n / 2⌋ times. 
//You mayassume that the majority element always exists in the array
public class NDivideandConquerExersize2 {
    public static int majorityElement(int array[]) {
        int majorityCount=array.length/2;
        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j=0;j<array.length;j++){
                if(array[j]==array[i]){
                count +=1;
            }
        }
        if(count>majorityCount){
            return array[i];
        }
    }
    
    return -1;
}
    public static void main(String[] args) {
        int array[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(array));
    }
}
