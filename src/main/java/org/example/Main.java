package org.example;

public class Main {

    public static void main(String[] args) {
        double [] numbders = {3.4, 4.5, -4.4, 8.4, -2.4, 1.3, -3.8, 9.4, -9.4, 7.4, -2.9, -3.3, -2.4, 8.3, -7.4,};
        int sum = 0;
        boolean a = false;
        int num = 0;
        for(double number: numbders) {
            if(number < 0){
                a = true;
            }
            if(a && number > 0) {
                num++;
                sum+= number;
            }
        }
        System.out.println(sum/num);
    }
}


