package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    private static final int[] moneys = {50000,10000,5000,1000,500,100,50,10,1};

    public static List<Integer> solution(int money) {
        Problem5 T = new Problem5();
        return T.wallet(money);
    }

    private List<Integer> wallet(int money){
        List<Integer> divisionMoney = new ArrayList<>();

        for(int m : moneys){
            divisionMoney.add(money/m);
            money %= m;
        }
        return divisionMoney;
    }
}
