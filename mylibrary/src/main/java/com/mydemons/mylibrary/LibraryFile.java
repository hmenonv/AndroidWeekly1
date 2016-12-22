package com.mydemons.mylibrary;

/**
 * Created by hareesh.menon on 22-12-2016.
 */

public class LibraryFile {

    // the awesome library that helps you to substract 2 numbers.


    public String substract(int i, int j){

        if(i>j){
            return String.valueOf(i-j);
        }else{
            return String.valueOf(0);
        }

    }


}
