package com.company;

public class Plane extends Vehicle {
    private double height=0;
    private int quantityOfPassengers=0;

    void setQuantityOfPassengers(int quantityOfPassengers){
        quantityOfPassengers=this.quantityOfPassengers;
    }
    int getQuantityOfPassengers(){
    return  quantityOfPassengers;
    }
    void setHeight(double height){
        this.height=height;
    }
    double getHeight(){
        return height;
    }


    public void getInfoPlane(Plane plan){
        System.out.println("Тип транспортного средства: Автобус\nСтоимость: "+plan.getPrice()+
                "\nCкорость:"+plan.getSpeed()+"\nКоличество пассажиров"+plan.getQuantityOfPassengers()+"\nВысота:"+plan.getHeight());
    }


}
