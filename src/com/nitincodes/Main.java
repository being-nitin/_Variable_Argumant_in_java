package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// write your code here
    SumofVa obj1 = new SumofVa();
    obj1.variableArgumant(12,13,14,15,16);
    }
}
class SumofVa{
    int sum =0;
    public void variableArgumant(int... a){
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
