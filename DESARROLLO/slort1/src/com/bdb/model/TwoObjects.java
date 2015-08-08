package com.bdb.model;


public class TwoObjects {

    public TwoObjects() {
    }

    
    public TwoObjects(Object obj1, Object obj2) {
    	this.object1 = obj1;
    	this.object2 = obj2;
    }

    
    public Object getObject1() {
        return object1;
    }

    public Object getObject2() {
        return object2;
    }

    public void setObject1(Object object) {
        object1 = object;
    }

    public void setObject2(Object object) {
        object2 = object;
    }

    private Object object1;
    private Object object2;
}