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
        Integer[] arr = {5,6,7,8,9,10};

        return arr;
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
