package com.company;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.m1();

    }
}

class Thread extends java.lang.Thread {
    A a = new A();
    B b = new B();

    public void m1 () {
        this.start();
        a.d1(b);
    }

    @Override
    public void run() {
        super.run();
        b.d2(a);
    }
}

class A {
        public synchronized void d1(B b) {
            System.out.println("Started execution of d1 method");
            try {
                java.lang.Thread.sleep(0) ;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread1 trying to call A's last method");
            b.last();
        }
        public synchronized void last() {
            System.out.println("Inside A's last method");
        }
}

class B {
    public synchronized void d2(A a) {
        System.out.println("Started execution of d2 method");
        try {
            java.lang.Thread.sleep(0) ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread2 trying to call B's last method");
        a.last();
    }
    public synchronized void last() {
        System.out.println("Inside A's last method");
    }
}
