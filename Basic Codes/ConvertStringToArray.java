public class ConvertStringToArray {
    public static void main(String args[]){
        String str = "Hello There";
        char ch[] = str.toCharArray();
        // for(int i=0; i<ch.length; i++){
        //     System.out.println(ch[i]);
        // }
        for(char i: ch){
            System.out.println(i);
        }
    }
}
