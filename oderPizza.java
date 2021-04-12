package com.company;

public class oderPizza {
    Pizza[] pizzas=new Pizza[3];
    oderPizza(Pizza p1){pizzas[0]=p1;}
    oderPizza(Pizza p1,Pizza p2){pizzas[0]=p1;pizzas[1]=p2;}
    oderPizza(Pizza p1,Pizza p2,Pizza p3){pizzas[0]=p1;pizzas[1]=p2;pizzas[2]=p3;}
    public double calcTotal() {
        double cost = 0;
        if (pizzas[0] != null) cost += pizzas[0].calcCost();
        if (pizzas[1] != null) cost += pizzas[1].calcCost();
        if (pizzas[2] != null) cost += pizzas[2].calcCost();
        return cost;
    }
}
