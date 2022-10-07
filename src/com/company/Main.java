package com.company;

import java.util.Random;

public class Main {

    public static void randomAdder(Heaps h, int n){
        Random rd = new Random();
        for (int i = 0; i < n ; i++) {
            int t = rd.nextInt(n);
            h.addData(t, i);
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Heaps h = new Heaps();
      /*  //Benchmark.benchmark(1000);
        Heaps h = new Heaps();
        randomAdder(h,64);

        Random rd = new Random();
        float[] array = new float[64];
        float sum = 0;
        for (int i = 0; i < 64; i++) {
           float x =  h.root.push(rd.nextInt(10,20));
            array[i] = x;
            sum+=x;
        }
        System.out.println(sum/64);

         sum = 0;
         Integer a = rd.nextInt(10,20);
         Integer b = rd.nextInt(10,20);
        for (int i = 0; i < 64; i++) {
            float x =  (float)h.root.add(a,b);
            array[i] = x;
            sum+=x;
        }
        System.out.println(sum/64); */
        randomAdder(h,64);
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            h.root.add(rd.nextInt(10),rd.nextInt(10) );
        }
        h.root.print();
    }
}
