package com.local.xcode;

public class JoinExm {

    public static void main(String[] args) throws Exception {

        Incr inc = new Incr();

        Thread t = new Thread(
                () -> {
                    for (int i=0;i<1000;i++){
//                        try {
//                            Thread.sleep(1);
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
                    //System.out.println("Hi ");
                        inc.incr();
        }
        });

        Thread t2 = new Thread(
                () -> {
                    for (int i=0;i<1000;i++){
//                        try {
//                            Thread.sleep(1);
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
                        //System.out.println("Hi there ");
                        inc.incr();
                    }
                });

        t.start();
        t2.start();

        t.join();
        t2.join();

        System.out.println("END");

        System.out.println("Total count " + inc.getCnt());
    }

}

class Incr {

    volatile int cnt;

    public synchronized void incr(){
        cnt++;
    }

    public int getCnt(){return cnt;}

}
