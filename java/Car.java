package org.example;

import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;

    // TODO: uzupelnij implementacje. Interfejs pozostaje bez zmian.
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = 0;
    }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public int getMileage() { return mileage; }
    public int getAge(int currentYear) { if(currentYear>=year)return currentYear-year;return -1; }
    public boolean renameModel(String newModel) {

        if(newModel == null){
            return false;
        }

        String reject = " \r\n\t";
        boolean any = false;
        for(int i=0;i<newModel.length();i++){
            String leter = String.valueOf(newModel.charAt(i));
            if(!reject.contains(leter)){
                any = true;
            }
        }

        if(any){
            model = newModel;
        }
        return any;
    }
    public boolean drive(int distance) {
        if (distance >0 && distance+mileage <= 1000000) {
            mileage += distance;
            return true;
        }
        return false;
    }
}
