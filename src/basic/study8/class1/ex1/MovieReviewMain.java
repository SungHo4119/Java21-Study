package basic.study8.class1.ex1;

public class MovieReviewMain {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview movie1 = new MovieReview();

        MovieReview movie2 = new MovieReview();

        movie1.title = "영화1";
        movie1.review = "매우 좋아용";

        movie2.title = "영화2";
        movie2.review = "매우 나빠용";
        // 영화 리뷰 정보 출력
        System.out.println("영화 제목: " + movie1.title + ", 리뷰: " + movie1.review);
        System.out.println("영화 제목: " + movie2.title + ", 리뷰: " + movie2.review);
    }
}