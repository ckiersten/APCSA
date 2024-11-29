//Kiersten Chou, 11/28/24

import java.util.ArrayList;

class Goldbach {
    
    public static void conjecture(int n) {
        ArrayList <Integer> temp = new ArrayList();
        temp = Eratosthenes.sieve(n);
        int num1, num2;
        num1 = num2 = 0;
        //check ArrayList of prime numbers for what adds up to n
        for (int o = 0; o < temp.size(); o++) {
            for (int i = o; i < temp.size(); i++) {
                if (temp.get(o) + temp.get(i) == n) {
                    num1 = temp.get(o);
                    num2 = temp.get(i);
                }
            }
        }
        //print to terminal
        //System.out.println(n+" = "+num1+" + " +num2);
    }
}