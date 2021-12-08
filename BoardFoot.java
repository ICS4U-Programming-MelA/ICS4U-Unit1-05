// Copyright (c) 2021 Mel Aguoth All rights reserved.
//
// Created By: Mel Aguoth
// Date: December 8, 2021
// Calculates the length of a board that's 144^3 inches with user input.

// Import modules.
import java.util.InputMismatchException;
import java.util.Scanner;

class BoardFoot {
  public static double calcBoardFoot(double boardWidth, double boardHeight) {

    // Calculate the board's length.
    double boardLength = 144 / boardWidth / boardHeight;

    // Return the board length.
    return boardLength;
  }

  public static void main(String[] args) {

    // Introduce the program.
    System.out.print("This program calculates and displays the length of a wooden board"
                   + " that's 144 inches cubed when given the width and height.");
    Scanner input = new Scanner(System.in);
    while (true) {
      try {

        // Get the user's board width.
        System.out.print("\n" + "Enter the width (inches): ");
        double userBoardWidth = input.nextDouble();

        // Get the user's board height.
        System.out.print("Enter the height (inches): ");
        double userBoardHeight = input.nextDouble();

        // If one of the user's measurements is below 0, display as such to the user.
        if (userBoardWidth < 0 || userBoardHeight < 0) {
          System.out.print("\n" + "One of your measurements is below 0. Please try again.");
        } else {

          // Call calcBoardFoot.
          BoardFoot obj = new BoardFoot();
          double result = calcBoardFoot(userBoardWidth, userBoardHeight);

          // Display the board length to the user.
          System.out.print("\n" + "This board's length is: " + result + " inches");
          input.close();
          break;
        }

      // If one of the user's measurements isn't a number, display as such to the user.
      } catch (InputMismatchException e1) {
        System.out.print("\n" + "One of your measurements isn't a number. Please try again.");
        input.reset();
        input.next();
      }
    }
    System.out.print("\n");
  }
}
