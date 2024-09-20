package onboarding;

public class Problem4 {
    public static String solution(String word) {
        Problem4 T = new Problem4();
        return T.convertWord(word);
    }

    private String convertWord(String word){
        StringBuilder sb = new StringBuilder();
        for (Character ch : word.toCharArray()) {
            if(ch == ' ')
                sb.append(' ');
            else if(ch > 90)
                sb.append(lowerConvert(ch));
            else
                sb.append(upperConvert(ch));
        }
        return sb.toString();
    }

    private char upperConvert(char c){
        int num = 155-(int)c;
        return (char)num;
    }

    private char lowerConvert(char c){
        return (char) (219-(int)c);
    }


}
