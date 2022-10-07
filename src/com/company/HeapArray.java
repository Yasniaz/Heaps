package com.company;

public class HeapArray {

    int[] heapArray;
    HeapArray(int n){
        heapArray = new int[n];
    }

    public void bubble(Integer data){

        if(data %2 == 0){
            heapArray[(data-2)/2] = data;
        }
        else{
            heapArray[(data-1)/2] = data;
        }
    }



}
