package com.zipcodewilmington.assessment2.part1;



import java.util.Arrays;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        Boolean answer = false;
        if(array.length %2==0){
           answer = true;
       }
        return answer;

    }

    public Integer[] range(int start, int stop) {
       Integer[] answer = new Integer[stop-start+1];
       int index = 0;
        for (int i = stop; i < start ; i--) {
            answer[index] = i;
            index++;
        }

        return answer;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer first= array[0];
        Integer second = array[1];
        Integer answer = first+ second;
        return  answer;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
    Integer first = array[0];
    Integer second = array[1];
    Integer answer = first * second;
        return answer;
    }
}
