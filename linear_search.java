public class linear_search{
    public static void main(String[] args) {
        int[]arr={6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int key=17;
        System.out.println(linearSearch(arr,key));
    }
    static int linearSearch(int[]arr,int key){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element==key){
                return element;
            }
            }
            return -1;
        }
    }
