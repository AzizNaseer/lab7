package com.company;

public class Pizza {
    private String size_of_pizza;
    private int number_of_cheese_toppings, number_of_pepperoni_toppings,number_of_ham_toppings;
    Pizza(){
        size_of_pizza="small";
        number_of_cheese_toppings=0;
        number_of_pepperoni_toppings=0;
        number_of_ham_toppings=0;}
    Pizza(String size_of_pizza){
        this.size_of_pizza=size_of_pizza;
        number_of_cheese_toppings=0;
        number_of_pepperoni_toppings=0;
        number_of_ham_toppings=0;}
    Pizza(String size_of_pizza,int number_of_cheese_toppings){
        this.size_of_pizza=size_of_pizza;
        this.number_of_cheese_toppings=number_of_cheese_toppings;
        number_of_pepperoni_toppings=0;
        number_of_ham_toppings=0;}
    Pizza(String size_of_pizza,int number_of_cheese_toppings,int number_of_pepperoni_toppings){
        this.size_of_pizza=size_of_pizza;
        this.number_of_cheese_toppings=number_of_cheese_toppings;
        this.number_of_pepperoni_toppings=number_of_pepperoni_toppings;
        number_of_ham_toppings=0;}
    Pizza(String size_of_pizza,int number_of_cheese_toppings,int number_of_pepperoni_toppings,int number_of_ham_toppings){
        this.size_of_pizza=size_of_pizza;
        this.number_of_cheese_toppings=number_of_cheese_toppings;
        this.number_of_pepperoni_toppings=number_of_pepperoni_toppings;
        this.number_of_ham_toppings=number_of_ham_toppings;}
    public void setNumber_of_cheese_toppings(int number_of_cheese_toppings) {
        this.number_of_cheese_toppings = number_of_cheese_toppings;
    }
    public void setNumber_of_ham_toppings(int number_of_ham_toppings) {
        this.number_of_ham_toppings = number_of_ham_toppings;
    }
    public void setNumber_of_pepperoni_toppings(int number_of_pepperoni_toppings) {
        this.number_of_pepperoni_toppings = number_of_pepperoni_toppings;
    }
    public void setSize_of_pizza(String size_of_pizza) {
        this.size_of_pizza = size_of_pizza;
    }
    public int getNumber_of_cheese_toppings() {
        return number_of_cheese_toppings;
    }
    public int getNumber_of_ham_toppings() {
        return number_of_ham_toppings;
    }
    public int getNumber_of_pepperoni_toppings() {
        return number_of_pepperoni_toppings;
    }
    public String getSize_of_pizza() {
        return size_of_pizza;
    }
    public double calcCost() {
        double cost= number_of_cheese_toppings*2+number_of_ham_toppings*2+number_of_pepperoni_toppings*2;
        if(size_of_pizza.equals("small"))   cost+=10;
        else if(size_of_pizza.equals("medium")) cost+=12;
        else if(size_of_pizza.equals("large")) cost+=14;
        return cost;
    }

    @Override
    public String toString() {
        return "size_of_pizza=" + size_of_pizza +
                ", number_of_cheese_toppings=" + number_of_cheese_toppings +
                ", number_of_pepperoni_toppings=" + number_of_pepperoni_toppings +
                ", number_of_ham_toppings=" + number_of_ham_toppings +", cost is "+calcCost();
    }
}
