//Kiersten Chou, 11/27/24

import java.util.ArrayList;

class Eratosthenes {

    public static ArrayList<Integer> sieve(int n) {
        ArrayList<Integer> lst = new ArrayList();
        //fill list
        for (int i = 2; i <= n; i++) {
            lst.add(i);
        }
        //find primes
        for (int o = 0; o < lst.size(); o++) {
            int p = lst.get(o);
            for (int i = 0; i < lst.size(); i++) {
                if (lst.get(i) > p && lst.get(i) % p == 0) {
                    lst.remove(i);
                    i--;
                }
            }

        }
        /*for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
        */
        return lst;
    }
}