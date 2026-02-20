public class CountVowelInString {
    public static void main(String[] args) {
        System.out.println(countVowelsInString("AeIoU"));
    }
    static String countVowelsInString(String s){
        return  countVowelsInString(s.toLowerCase(), 0, s.length() - 1);
    }
    static String countVowelsInString(String s, int count, int position){
        if(position == -1) return ""+count;
        char ch = s.charAt(position);
        if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u') return countVowelsInString(s, ++count, --position);
        else
            return countVowelsInString(s, count, --position);
    }
}
