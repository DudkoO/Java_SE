package com.company;

public class BadPupil implements Pupil  /* наследование от интерфейса */
 {


     @Override
     public void study() {
         System.out.println(" Плохо учится");
     }

     @Override
     public void read() {
         System.out.println(" Плохо  читает");
     }

     @Override
     public void relax() {
         System.out.println(" Отдыхает постоянно");
     }

     @Override
     public void Study() {

     }
 }
