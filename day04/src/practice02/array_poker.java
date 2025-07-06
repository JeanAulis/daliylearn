package practice02;

import java.util.Arrays;

public class array_poker {

    public static void main(String[] args) {

        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] pokersArray = new String[colors.length * numbers.length + 2];

        System.out.println(pokersArray.length);
        pokersArray[0] = "大王";
        pokersArray[1] = "小王";
        int index = 2;
        
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                pokersArray[index++] = colors[i] + numbers[j];
            }
        }
        System.out.println(Arrays.toString(pokersArray));


        // 洗牌
        for (int i = 0; i < pokersArray.length; i++) {
            int randomIndex = (int)(Math.random() * pokersArray.length);
            String temp = pokersArray[i];
            pokersArray[i] = pokersArray[randomIndex];
            pokersArray[randomIndex] = temp;
        }
        System.out.println(Arrays.toString(pokersArray));
    }
}
