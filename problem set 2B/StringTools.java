class StringTools {

    public StringTools() {

    }

    public String lastLetter(String str) {
        int len = str.length();
        return str.substring(len-1);
    }

    public String formatPhoneNumber(String str) {
        String firstPart = str.substring(0, 3);
        String secondPart = str.substring(3, 6);
        String thirdPart = str.substring(6);
        return "(" +firstPart+ ") " +secondPart+ "-" +thirdPart;
    }

    public String middleThree(String str) {
        int i = (str.length()-3)/2; //number of characters on each side of middle
        return str.substring(i, str.length()-i);
    }

    public String swapLastTwo(String str) {
        String og = str.substring(0, str.length()-2);
        String newSecondLast = str.substring(str.length()-1);
        String newLast = str.substring(str.length()-2, str.length()-1);
        return og + newSecondLast + newLast;
    }

    /*public boolean frontAgain(String str, int n) {
    return str.substring(0, n).compareTo(str.substring(str.length()-n));
    }
     */
}