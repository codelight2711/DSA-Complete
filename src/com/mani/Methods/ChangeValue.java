package com.mani.Methods;

import java.util.Arrays;
import java.util.HashMap;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array

        int[] arr = {1,3,2,45,6};
        change(arr);

        System.out.println(Arrays.toString(arr));
    }
    static  void change(int[] nums){
        nums[0]=90; // idf you make a change to the object via this ref variable ,same object will be changed
    }
}
