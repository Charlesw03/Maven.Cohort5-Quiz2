package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {



        ArrayList<Integer> arrlist = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            arrlist.add(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            arrlist.add(array2[i]);
        }

        Integer[] answer = arrlist.toArray(new Integer[arrlist.size()]);
        return answer;
    }

    public Integer[] rotate(Integer[] array, Integer index) {


        ArrayList<Integer> fuckThis = new ArrayList<>();
        for (Integer aNumber : array) {
            fuckThis.add(aNumber);
        }
        for (int i = 0; i < index; i++) {

            fuckThis.add(fuckThis.get(0));
            fuckThis.remove(0);
        }


        return fuckThis.toArray(new Integer[fuckThis.size()]);

    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            if (valueToEvaluate.equals(array1[i])) {
                count++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (valueToEvaluate.equals(array2[i])) {
                count++;
            }
        }
        return count;
    }



    public Integer mostCommon(Integer[] array) {

        int count = 1, tempcount;
        int mostCommon = array[0];
        int temp = 0;


        for (int i = 0; i <array.length ; i++) {

            temp = array[i];
            tempcount = 0;

            for (int j = 0; j <array.length ; j++) {
                if(temp ==array[j])
                    tempcount++;
            }
            if(tempcount > count){
                mostCommon = temp;
                count = tempcount;

            }
        }

        return mostCommon;
    }
    }
