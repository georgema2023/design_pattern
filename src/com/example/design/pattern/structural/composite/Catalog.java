package com.example.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Catalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<>();
    private String name;
    private Integer level;

    public Catalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
    System.out.println(this.name);
    items.forEach(
        catalogComponent -> {
          if (this.level != null) {
            for (int i = 0; i < this.level; i++) {
                System.out.print(" ");
            }
          }

          catalogComponent.print();
        });
    }
}
