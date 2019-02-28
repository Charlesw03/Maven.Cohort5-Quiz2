package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        Boolean answer = false;
        if (value >= 5) {
            return true;
        }

        return answer;
    }

    public Boolean isLessThan7(Integer value) {
        Boolean answer = false;
        if (value <= 7) {
            return true;
        }
        return answer;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        Boolean answer = false;
        if (valueToEvaluate >= 5 && valueToEvaluate <= 7) {
            return true;
        }
        return answer;
    }

    public Boolean startsWith(String string, Character character) {
        Boolean answer = false;
        String firstLetter = string.substring(0, 1);
        if (firstLetter.equalsIgnoreCase(character.toString())) {
            answer = true;
        }
        return answer;
    }
}
