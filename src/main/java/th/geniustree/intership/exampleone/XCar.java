/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.exampleone;

public class XCar implements Car {

    private Engine engine;

    private boolean checkBattery() {
        return true;
    }

    private boolean checkOil() {
        return true;
    }

    private boolean fuel() {
        return true;
    }

    @Override
    public boolean startEngine() {
        if (checkBattery() == true) {
            System.out.println("checkBattery true");
        }
        if (checkOil() == true) {
            System.out.println("checkOil true");
        }
        if (fuel() == true) {
            System.out.println("fuel true");
        }
        return false;
    }

    @Override
    public void go() {
        System.out.println("Go");
    }



}
