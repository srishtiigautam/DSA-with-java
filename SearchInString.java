public class SearchInString {
    public static void main(String[] args) {
        String str="Srishti Gautam";
        char key='a';
        System.out.println(linearsearch(str ,key));
        
    }

    static boolean linearsearch(String str, char key){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            int element = str.charAt(i);
            if(element==key){
                return true;
            }

        }
        return false;
    }
    
}
