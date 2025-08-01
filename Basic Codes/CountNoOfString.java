

public class CountNoOfString {
    public static void main(String args[]){
        String str = "Hello there my name is Sangini";
        int countWord = str.split("\\s").length;
        System.out.println("Number of words are: "+countWord);
    }
}
