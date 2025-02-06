package Assignments.Arrays;

/**
 * Assignment 2: Movie Theater Implementation
 1: Simulate a movie theater that helps users to book and reserve seats.
 2: reserve seats (if seat is taken, let them know it is taken and suggest an available seat)
cancel seats
 3: retrieve initial seating charting
 **/

public class MovieTheater {
    // Make 2D array "seats".
    private final int[][] seats;

    public MovieTheater (int rows, int columns ){
        seats = new int[rows][columns];
    }

    public boolean reserveSeat (int row, int column) {
        if (seats[row][column] == 1 ) {
            System.out.println("This seat is taken, please choose different seat. ");
            return false;
        } else { // If seat is open assign to user
            seats [row] [column] = 1;
            System.out.println("Seat Reserved");
            return true;
        }
    }

    public boolean cancelSeat(int row, int column) {
        if (seats[row][column] == 0) {
            System.out.println("This seat is already empty.");
            return false;
        } else {
            seats[row][column] = 0;
            System.out.println("Seat reservation canceled.");
            return true;
        }
    }

    public void printSeating() {
        System.out.println("Seating Chart: ");
        for (int[] seat : seats) {
            for (int i : seat) {
                System.out.print(i == 1 ? "[x]" : "[ ]");
            }
            System.out.println();
        }
    }

    // Testing to see if code functions right.
    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater(25,25);
        theater.printSeating();

        if (theater.reserveSeat(18,12)) {
            System.out.println("Seat '18.12'Reserved ");
        } else {
            System.out.println("Failed to reserve seat 4.8");
        }
        theater.reserveSeat(2,3);
        theater.reserveSeat(7,9);
        theater.reserveSeat(5,4);

        theater.printSeating();


    }

}

