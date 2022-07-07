package com.example.design.pattern.structural.composite;

public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("add is unsupported");
    }
    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("remove is unsupported");
    }
    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("getName is unsupported");
    }
    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("getPrice is unsupported");
    }

    public void print(){
        throw  new UnsupportedOperationException("print is unsupported");
    }

}
