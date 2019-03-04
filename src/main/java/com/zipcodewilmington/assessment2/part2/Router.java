package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Router {
    Map<String,String> map= new TreeMap<>();

    public void add(String path, String controller) {
    //map.put(path,controller);
    map.put(path,controller);
    }

    public Integer size() {
       // map.size();

        return map.size();
    }

    public String getController(String path) {
        return map.get(path);
    }

    public void update(String path, String studentController) {
        add(path, studentController);
        //add(path,studentController);
    }

    public void remove(String path) {
        //map.remove(path);
        map.remove(path);
    }
    @Override
    public String toString(){
        String result = "";
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(Map.Entry<String, String> e : entries ) {

            result += (e.getKey() + " -> " + e.getValue() + "\n");
        }

        return  result;

    }
}



