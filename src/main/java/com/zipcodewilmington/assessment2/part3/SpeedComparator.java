package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        Integer o1Speed = o1.getSpeed();
        Integer o2Speed = o2.getSpeed();
        return o2Speed.compareTo(o1Speed);
    }
}
