package com.finalkeyword;

class FinalClass { // removed 'final'
	
    void show()
    {
        System.out.println("Value of a: ");
    }
}

public class FinalClassDemo extends FinalClass {
	
    public static void main(String[] args) {
        FinalClassDemo obj = new FinalClassDemo();
        obj.show();
    }
	
}
