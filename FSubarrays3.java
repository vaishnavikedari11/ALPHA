//kadanes alg
public class FSubarrays3 {
    public static void kadanes(int numbers[]) {
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, i);
        }
        System.out.println("our max subarrays sum is = "+ms);
    }
    public static void main(String[] args) {
        int numbers[]={-2,3,4,-2,1,5,-3};
        kadanes(numbers);
    }
}
