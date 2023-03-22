package com.class2;

public class IntegerManagement {

    public void changeInt(int a) { // variable
        a += 2;
        System.out.println("Number in function: " + a);
    }

    public void changeInteger( Integer oInt ) { // object
        //change value of oInt + 2
        //oInt = new Integer( oInt.intValue() + 2 );
        oInt = oInt.intValue() + 2;
        System.out.println("Integer in function: " + oInt.intValue() );
    }

}
