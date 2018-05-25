class Televisor {
    boolean isOn = false;

    void turnOn(){
        isOn = true;
    }

    void turnOff(){
        isOn = false;
    }

    void showStatus(){
        System.out.println("Czy telewizor jest włączony?");
        System.out.println(isOn);
    }

}

