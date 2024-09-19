package onboarding;

import java.util.List;

class Problem1 {

    private static boolean isException(List<Integer> pages){
        if(pages.get(0) < 1 || pages.get(1) > 400 || pages.get(0) > pages.get(1))
            return true;
        return Math.abs(pages.get(1) - pages.get(0)) > 1;
    }

    private static int findMaxValueByPages(List<Integer> pages){
        int left = findMaxValueByPage(pages.get(0));
        int right = findMaxValueByPage(pages.get(1));

        return Math.max(left,right);
    }

    private static int findMaxValueByPage(int page){
        int sum = 0, mul = 1;

        while(page > 0){
            int cur = page%10;
            sum += cur;
            mul *= cur;
            page /= 10;
        }

        return Math.max(sum,mul);
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer;

        if(isException(pobi) || isException(crong))
            return -1;

        if(findMaxValueByPages(pobi) > findMaxValueByPages(crong))
            answer = 1;
        else if(findMaxValueByPages(pobi) < findMaxValueByPages(crong))
            answer = 2;
        else
            answer = 0;

        return answer;
    }
}