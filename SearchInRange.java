public class SearchInRange {
    public static void main(String[] args) {
        int[]arr={45,67,89,56,65,42,38,74,94};
        int start=2;
        int end=7;
        int target=42;
        System.out.println(linearsearch(arr, start, end, target));
    }
    static int linearsearch(int[]arr,int start,int end,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
            
        }
        return -1;
    }
    
}
