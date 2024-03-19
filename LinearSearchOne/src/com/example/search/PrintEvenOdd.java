package com.example.search;

import javax.swing.plaf.TableHeaderUI;

public class PrintEvenOdd {

    int counter = 1;
    int N = 10;

    public void printOddNumber() {
        synchronized (this) {
            while (counter < N) {
                if (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " - " + counter);
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (counter < N) {
                if (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " - " + counter);
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        PrintEvenOdd printEvenOdd = new PrintEvenOdd();
        new Thread(new Runnable() {
            @Override
            public void run() {
                printEvenOdd.printOddNumber();
            }
        }, "Thread - 1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                printEvenOdd.printEvenNumber();
            }
        }, "Thread  - 2").start();
    }


}
