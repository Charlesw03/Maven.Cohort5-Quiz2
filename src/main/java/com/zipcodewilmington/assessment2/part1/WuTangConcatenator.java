package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
   //private Integer input;
    private Integer input;
    public WuTangConcatenator(Integer input) {
        //this.input = input;
    this.input = input;
    }

    public Boolean isWu() {
        Boolean answer = false;
        //return input % 3==0;
            if(input % 3 ==0){
                answer= true;
            }
            return answer;
    }

    public Boolean isTang() {
    Boolean answer = false;
    if( input % 5 ==0){
        answer = true;
    }
      return answer;
       // return input %5==0;
    }

    public Boolean isWuTang() {

        return isTang() && isWu();
    }
}
