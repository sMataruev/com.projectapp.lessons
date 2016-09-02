package com.projectapp.lessons._10_Generic.A1_DontGenericExample;


public class A1_DontGeneric {
    private Object ob;

    public A1_DontGeneric(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }
    public void showType() {
        System.out.println(ob + " type is = " + ob.getClass().getName());
    }



}
