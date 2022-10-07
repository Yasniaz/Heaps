package com.company;

import java.util.Random;

public class Benchmark {

    public static void addll(LinkedList ls, int n){
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            ls.addPrioLinear(rd.nextInt(n));
        }
    }

        public static void benchmark(int iteration) {
            int[] nValues = new int[]{1000, 250, 500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 128000, 256000};
            Random rd = new Random();

            for(int i = 0; i < nValues.length; ++i) {
                long t = 0L;
                int value = Math.abs(rd.nextInt(nValues[i] - 1));

                for(int j = 0; j < iteration; ++j) {
                    LinkedList ls = new LinkedList();
                    addll(ls, nValues[i]);

                    long t0 = System.nanoTime();

                    //ls.addPrioLinear(value);
                    //ls.PrioRemoveLinear();
                    //ls.PrioRemoveConstant();

                    long t1 = System.nanoTime();
                    t += t1 - t0;
                }

                System.out.println(nValues[i] + "\t" + t / (long)iteration);
            }

        }
    }

