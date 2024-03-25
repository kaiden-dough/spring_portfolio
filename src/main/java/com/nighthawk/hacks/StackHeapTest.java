package com.nighthawk.hacks;

public class StackHeapTest {
    public int n = 5;// primitive data type on heap

    public String name ="Kai";
    
    public double a = 5.0;
    public static void changeInt(int nValue, int nRefN, StackHeapTest nRef) {
        System.out.println("The n value before is: " + nValue + ". The nRefN value before is: "+ nRefN+". The nRef value before is: "+ nRef);
        nValue+=10;
        nRefN += 10;
        nRef.n+=10;
        System.out.println("The n value after is: " + nValue + ". The nRefN value after is: "+ nRefN+". The nRef.n value after is: "+ nRef.n);
    }
    public static void changeString(String nameValue, String nRefName, StackHeapTest nRef) {
        System.out.println("The n value before is: " + nameValue + ". The nRefN value before is: "+ nRefName+". The nRef value before is: "+ nRef);
        nameValue = nameValue.replace("a","x");
        nRefName= nRefName.replace("a","x");
        nRef.name = nRef.name.replace("a","x");
        System.out.println("The n value after is: " + nameValue + ". The nRefN value after is: "+ nRefName+". The nRef.n value after is: "+ nRef.name);
    }
    public static void changeDouble(double aValue, double nRefA, StackHeapTest nRef) {
        System.out.println("The n value before is: " + aValue + ". The nRefN value before is: "+ nRefA+". The nRef value before is: "+ nRef);
        aValue+=10.0;
        nRefA+=10.0;
        nRef.a+=10.0;
        System.out.println("The n value after is: " + aValue + ". The nRefN value after is: "+ nRefA+". The nRef.n value after is: "+ nRef.a);
    }

    public static void main(String[] args){
        int n=5;
        String name="Kai";
        double a = 5.0;
        StackHeapTest nRef = new StackHeapTest();
        System.out.println("int: Before");
        System.out.println("n: "+n+" or "+ System.identityHashCode(n));
        System.out.println("nRef.n: "+nRef.n);
        System.out.println("nRef: "+ nRef + " or "+ System.identityHashCode(nRef));
        System.out.println("");
        changeInt(n, nRef.n, nRef);
        System.out.println("");
        System.out.println("After");
        System.out.println("n: "+n+" or "+ System.identityHashCode(n));
        System.out.println("nRef.n: "+nRef.n);
        System.out.println("nRef: "+ nRef + " or "+ System.identityHashCode(nRef));

        System.out.println("");
        System.out.println("String: Before");
        System.out.println("n: "+name+" or "+ System.identityHashCode(name));
        System.out.println("nRef.name: "+nRef.name);
        System.out.println("nRef: "+ nRef + " or "+ System.identityHashCode(nRef));
        System.out.println("");
        changeString(name, nRef.name, nRef);
        System.out.println("");
        System.out.println("After");
        System.out.println("n: "+name+" or "+ System.identityHashCode(name));
        System.out.println("nRef.name: "+nRef.name);
        System.out.println("nRef: "+ nRef + " or "+ System.identityHashCode(nRef));

        System.out.println("");
        System.out.println("double: Before");
        System.out.println("n: "+a+" or "+ System.identityHashCode(a));
        System.out.println("nRef.a: "+nRef.a);
        System.out.println("nRef: "+ nRef + " or "+ System.identityHashCode(nRef));
        System.out.println("");
        changeDouble(a, nRef.a, nRef);
        System.out.println("");
        System.out.println("After");
        System.out.println("n: "+a+" or "+ System.identityHashCode(a));
        System.out.println("nRef.n: "+nRef.a);
        System.out.println("nRef: "+ nRef + " or "+ System.identityHashCode(nRef));
    }
    
}
