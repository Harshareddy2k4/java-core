package com.Method1;

public class Constructor1 {
    String brand;
    String model;
    String ram;
    String storage;
    double price;

    Constructor1(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    Constructor1(Constructor1 t, String ram, String storage) {
        this(t.brand, t.model);
        this.ram = ram;
        this.storage = storage;
    }

    Constructor1(Constructor1 t1, double price) {
        this(t1.brand, t1.model);
        this.ram = t1.ram;
        this.storage = t1.storage;
        this.price = price;
    }

    void show() {
        System.out.println("Mobile Brand  : " + brand);
        System.out.println("Mobile Model  : " + model);
        System.out.println("RAM           : " + ram);
        System.out.println("Storage       : " + storage);
        System.out.println("Price         : " + price);
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        Constructor1 t = new Constructor1("Vivo", "T3 Pro");
        Constructor1 t1 = new Constructor1(t, "12GB", "1TB");
        Constructor1 t2 = new Constructor1(t1, 20000);

        t2.show();
    }
}
