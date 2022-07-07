package com.example.design.pattern.structural.composite;

public class Test {
  public static void main(String[] args) {
      CatalogComponent linuxCourse = new Course("linux",1);
      CatalogComponent windowsCourse = new Course("windows",2);

      CatalogComponent javaCourseCatalog = new Catalog("java course catalog",2);
      CatalogComponent course1 = new Course("course1",3);
      CatalogComponent course2 = new Course("course2",4);

      javaCourseCatalog.add(course1);
      javaCourseCatalog.add(course2);

      CatalogComponent allCourseCatalog = new Catalog("all course catalog",1);
      allCourseCatalog.add(linuxCourse);
      allCourseCatalog.add(windowsCourse);
      allCourseCatalog.add(javaCourseCatalog);

      allCourseCatalog.print();
  }
}
