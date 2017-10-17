package tests;
import maze.Square;

public class SquareTest{
  public static void main(String[] args){
    System.out.println(Square.WALL);
    System.out.println(Square.SPACE);
    System.out.println(Square.fromChar('*'));
    System.out.println(Square.fromChar('o'));
    System.out.println(Square.fromChar('/'));
  }
}