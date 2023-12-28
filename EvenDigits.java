public class EvenDigits {
    public static void main(String[] args) {
        int[]nums={12,345,2,6,7896};
    }
    static int findNumbers(int[]nums){
        int count =0;
        for(int i=0;i<nums.lenght;i++){
            if(nums[i]%2==0){
                count++;
            }
        }
        return count;
    }
    static int digits(int num){
        int count=0;
        while (num>0){
            num=num/10;
            count++;
        }
        
    }

    
}
