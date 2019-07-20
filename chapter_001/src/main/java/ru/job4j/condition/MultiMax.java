package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first > second? first:second;
        if (result == second){
           result = second > third? second : third;
        } else {
            result = first > third? first : third;
        }
        // if ...
        return result;
    }
}