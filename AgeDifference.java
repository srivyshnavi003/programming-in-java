public class AgeDifference {

    public static void main(String[] args) {
        int olderAge = 28;
        int youngerAge = 24;

        int timeElapsed = 56 - olderAge;
        int youngerBrotherFutureAge = youngerAge + timeElapsed;

        int ageDiffFuture = ageDifference(olderAge, youngerBrotherFutureAge);

        if (ageDiffFuture > 0) {
            System.out.println("When the older brother is 56, the younger brother will be " + youngerBrotherFutureAge + " years old, and the age difference will still be " + ageDiffFuture + " years.");
        } else {
            System.out.println("The age difference is not greater than 3 at any point.");
        }
    }

    public static int ageDifference(int olderAge, int youngerAge) {
        int ageDiff = olderAge - youngerAge;
        if (ageDiff > 3) {
            return ageDiff;
        } else {
            return 0;
        }
    }
}