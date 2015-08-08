package com.bdb.model;

import java.util.List;

public class ObjectNestedCollection {

    public ObjectNestedCollection() {
    }

    public List getList() {
        return list;
    }

    public Object getObject() {
        return object;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    private Object object;
    private List list;
}