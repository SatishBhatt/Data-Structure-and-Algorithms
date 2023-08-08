public class SearchInString {
    public static void main(String[] args) {
        String name = "Satish Bhatt";

        char target = 'B';
        System.out.println(search(name,target));

    }

    static int  search(String name,char target){


        for (int i = 0 ; i < name.length() ; i++){

            char ch = name.charAt(i);

            if(ch == target){
                return i;
            }
        }
        return -1;
    }
}
