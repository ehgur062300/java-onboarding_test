package onboarding;

public class Problem4 {
    public static String solution(String word) {
        Problem4 T = new Problem4();
        return T.convertWord(word);
    }

    private String convertWord(String word){
        StringBuilder sb = new StringBuilder();
        for (Character ch : word.toCharArray()) {
            if(Character.isLowerCase(ch))
                sb.append(lowerConvert(ch));

            else if(Character.isUpperCase(ch))
                sb.append(upperConvert(ch));

            else
                sb.append(" ");
        }
        return sb.toString();
    }

    private char upperConvert(char c){
        return (char) ('Z' - (c - 'A'));  // 대문자 변환
    }

    private char lowerConvert(char c){
        return (char) ('z' - (c - 'a'));  // 소문자 변환
    }
}
