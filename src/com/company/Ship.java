package com.company;

public class Ship extends  Vehicle {
    private int quantityOfPassengers=0;
    private int portNumber=0;

    void setQuantityOfPassengers(int quantityOfPassengers){
        quantityOfPassengers=this.quantityOfPassengers;
    }
    int getQuantityOfPassengers(){
        return  quantityOfPassengers;
    }

    void setPortNumber(int portNumber){
        this.portNumber=portNumber;
    }
    int getPortNumber(){
        return portNumber;
    }

    public void getInfoShip(Ship ship){
        System.out.println("Тип транспортного средства: Корабль\nСтоимость: "+ship.getPrice()+
                "\nCкорость:"+ship.getSpeed()+
                "\nКоличество пассажиров"+ship.getQuantityOfPassengers()+
                "Номер родного порта:"+ship.getPortNumber());
    }




}
