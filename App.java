import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Let's make a Triangle! Please enter the first side of your triangle.");
    int userSideOne = Integer.parseInt(console.readLine());
    System.out.println("What is the second side of your triangle?");
    int userSideTwo = Integer.parseInt(console.readLine());
    System.out.println("What is the third side of your triangle?");
    int userSideThree = Integer.parseInt(console.readLine());

    Triangle userTriangle = new Triangle(userSideOne, userSideTwo, userSideThree);

    System.out.println(userTriangle.triangleShape(userSideOne, userSideTwo, userSideThree));

  }
}
