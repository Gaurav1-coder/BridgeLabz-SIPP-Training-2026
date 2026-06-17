public class MovieSeatReservation {

    int seats[] = {101, 102, 103, 104, 105};

    // Method to get seat number
    public int getSeat(int index) {

        try {
            return seats[index];

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid seat position requested!");
            return -1;
        }
    }

    public static void main(String[] args) {

        MovieSeatReservation movie = new MovieSeatReservation();

        int seatNumber = movie.getSeat(8);

        System.out.println("Seat Number: " + seatNumber);
    }
}