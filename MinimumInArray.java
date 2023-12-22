public class MinimumInArray {
    public static void main(String[] args) {
        int[]arr={23,34,56,78,90,78,54,36};
        System.out.println(minimum(arr));
    }
    static int minimum(int[]arr){
        int element=arr[0];
        for(int i=0;i<arr.length;i++){
            if(element>arr[i]){
                element=arr[i];
                
            }
        }
        return element;
    }
}
    

