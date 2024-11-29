//Kiersten Chou, 11/29/24

import java.util.ArrayList;

class BigInts {
    
    public static ArrayList<Integer> addingBigInts(ArrayList<Integer> big1, ArrayList<Integer> big2) {
        ArrayList<Integer> output = new ArrayList();
        int leadingZeros = 0;
        boolean checkCarry = false;
        //make sure ArrayList are same size
        if (big1.size() > big2.size()) {
            leadingZeros = big1.size()-big2.size();
            for (int i = 0; i < leadingZeros; i++) {
                big2.add(0, 0);
            }
        } else if (big2.size() > big1.size()) {
            leadingZeros = big2.size()-big1.size();
            for (int i = 0; i < leadingZeros; i++) {
                big1.add(0, 0);
            }
        }
        //add
        for (int i = big1.size()-1; i >= 0; i--) {
            int sum = 0;
            if (checkCarry) {
                sum = 1+(big1.get(i) + big2.get(i));
            } else {
                sum = (big1.get(i) + big2.get(i));
            }
            int n = 0;
            if (sum >= 10) {
                n = sum % 10;
                checkCarry = true;
            } else {
                n = sum;
                checkCarry = false;
            }
            output.add(0, n);
        }
        if (checkCarry) output.add(0, 1);
        //print to terminal
        System.out.println(output.size());
        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i));
        }
        return output;
    }
}