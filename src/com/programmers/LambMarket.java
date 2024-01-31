package com.programmers;

/**
 *
 */
public class LambMarket {
    static final int lAMB_SKEWERS_PRICE = 12000;
    static final int DRINK_PRICE = 2000;
    static final int BONUS_DRINK = 10;

    public static void main(String[] args) {
        System.out.println(LambMarket.solution(10, 3));
    }

    public static int solution(int n, int k) {
        int service = n / BONUS_DRINK;
        int answer = (n * lAMB_SKEWERS_PRICE) + (k * DRINK_PRICE) - (service * DRINK_PRICE);

        return answer;
    }
}
