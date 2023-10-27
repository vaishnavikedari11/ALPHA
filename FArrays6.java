//pairs in arrays.find all possible pairs
public class FArrays6 {
    public static void pairsArrays(int numbers[]) {
        for(int i=0;i<=numbers.length;i++){
            int current=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.println("("+current+","+numbers[j]+")");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        pairsArrays(numbers);
    }
}
