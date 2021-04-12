package com.company;

public class lab7AR {
    public static void main(String[] args) {
        Pizza p1=new Pizza("small"),p2=new Pizza("medium",2,2),p3=new Pizza("large",2,5,4),p4= new Pizza("large",1,1,2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        oderPizza op = new oderPizza(p2,p4);
        System.out.println(op.calcTotal());










    }

}
