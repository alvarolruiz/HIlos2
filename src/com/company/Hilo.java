package com.company;

public class Hilo implements  Runnable{
    public int numeroHilo;

    public Hilo(int numeroHilo) {
        this.numeroHilo = numeroHilo;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(String.format("Calculo del hilo"));
        }
        System.out.println(String.format("Hilo %s finalizado", Thread.currentThread().getName()));
    }
}
