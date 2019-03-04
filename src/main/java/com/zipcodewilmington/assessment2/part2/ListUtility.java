package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {

   private List<Integer> list = new ArrayList<Integer>();

    public Boolean add(Integer i) {

        return list.add(i);

    }

    public Integer size() {

        return list.size();
    }

    public List<Integer> getUnique() {
        List<Integer> unique = new ArrayList<>();
        for (Integer number: list) {
            if(!unique.contains(number)){
                unique.add(number);
            }
        }
        return unique; }

    public String join() {
        String result = "";
        for (int i = 0; i < list.size() ; i++) {
            result += list.get(i);
            if(i < list.size() -1){
                result+= ", ";
            }
        }

        return result;
    }

    public Integer mostCommon() {
        Integer common = list.get(0);
        int commoncount = countOccurence(common);

        for (Integer currentNumber: list) {
            int currentCount = countOccurence(currentNumber);
            if(currentCount > commoncount) {
                common = currentNumber;
                commoncount = currentCount;
            }
        }

        return common;
    }
            //nhu reated this method to use in the most common method signature
    private int countOccurence(Integer valueTocount){
        int count = 0;
            for (Integer currentvalue : list) {
                if(currentvalue == valueTocount ){
                    count++;
                }
            }
                    return count;

        }
    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
