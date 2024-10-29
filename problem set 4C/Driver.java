//Kiersten Chou, 10/29/24

class Driver {
    
    public static void main(String[] args) {
        System.out.println(Review.totalSentiment("reviewExample.txt"));
        System.out.println(Review.starRating("reviewExample.txt"));
        System.out.println(Review.fakeReview("reviewExample.txt"));
    }
}