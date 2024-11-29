//Kiersten Chou, 11/29/24

import java.util.ArrayList;

class Driver {
    
    public static void main(String[] args) {
        //q1
        Eratosthenes.sieve(100);
        
        //q2
        Goldbach.conjecture(8);
        
        //q3
        ArrayList<Integer> a = new ArrayList();
        ArrayList<Integer> b = new ArrayList();
        a.add(9);
        b.add(9);
        b.add(9);
        b.add(9);
        BigInts.addingBigInts(a, b);
    }
}