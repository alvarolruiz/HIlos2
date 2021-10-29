package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static int NUMERO_HILOS=2;
public static  List <Thread> hilos = new ArrayList<>();
    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i < NUMERO_HILOS; i++) {
        hilos.add(new Thread(new Hilo(i+1)));
        hilos.get(0);
        }

        for (int i = 0; i < hilos.size(); i++) {
            try {
                hilos.get(i).start();
                Thread.currentThread().wait(1000);
                hilos.get(i).interrupt();
            }catch (InterruptedException e)
        }

    }


}
