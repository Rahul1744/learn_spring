package org.example.prgm4;

public class Singleton {
    public static void main(String[] args) {

    ABC singleObj = ABC.getInstance();

    singleObj.checkInstance();
    }
}

class ABC{
    static ABC obj = new ABC();

    private ABC(){

    }
    public static ABC getInstance(){
        return obj;
    }

    public void checkInstance(){
        System.out.println("This class allows create only single instance of this class.");
    }
}
