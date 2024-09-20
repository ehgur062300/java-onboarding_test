package onboarding;

public class Problem3 {
    public static int solution(int number) {
        return gameResult(number);
    }

    private static int gameResult(int number){
        int clap = 0;
        for(int i=1; i<=number; i++){
            int cnt = 0;
            clap += clapCount(i,cnt);
        }
        return clap;
    }

    private static int clapCount(int number, int cnt){
        while(number > 0){
            int n = number % 10;
            if(n != 0 && n%3 == 0)
                cnt++;
            number /= 10;
        }
        return cnt;
    }
}
