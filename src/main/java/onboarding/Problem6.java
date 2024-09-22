package onboarding;

import java.util.*;

public class Problem6 {

    private static final Set<String> tokens = new HashSet<>();
    private static final Set<String> duplicateTokens = new HashSet<>();
    private static final TreeSet<String> result = new TreeSet<>();

    public static List<String> solution(List<List<String>> forms) {
        Problem6 T = new Problem6();
        return T.duplicationNickNames(forms);
    }

    private List<String> duplicationNickNames(List<List<String>> forms){

        for(List<String> form : forms){
            String email = form.get(0);
            String nickName = form.get(1);

            checkDuplication(email,nickName);
        }
        checkDuplication(forms.get(0).get(0),forms.get(0).get(1));

        return new ArrayList<>(result);
    }

    private void checkDuplication(String email, String nickName){
        int strLength = nickName.length();
        for(int i=0; i<strLength-1; i++){
            String token = nickName.substring(i,i+2);

            // 이미 중복된 토큰이라면 해당 이메일을 결과에 추가
            if (duplicateTokens.contains(token)) {
                result.add(email);
            }
            // 아직 중복된 적 없는 토큰이라면 토큰에 추가
            else if (tokens.contains(token)) {
                result.add(email);  // 이미 존재하는 토큰이므로 중복
                duplicateTokens.add(token); // 중복된 토큰을 기록
            } else {
                tokens.add(token);  // 처음 본 토큰이면 tokens에 추가
            }
        }
    }
}
