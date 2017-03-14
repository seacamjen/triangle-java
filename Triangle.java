class Triangle {
  public int mSideOne;
  public int mSideTwo;
  public int mSideThree;

  public Triangle(int sideOne, int sideTwo, int sideThree) {
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
  }

  public String triangleShape(int sideOne, int sideTwo, int sideThree) {
    if (sideOne == sideTwo && sideTwo == sideThree) {
      return ("This is a Equilateral!");
    } else if (sideOne > (sideTwo + sideThree) || sideTwo > (sideOne + sideThree) || sideThree > (sideOne + sideTwo)) {
      return ("This does not make a Triangle");
    } else if (sideOne == sideTwo || sideTwo == sideThree || sideThree == sideOne)  {
      return ("This is a Isosceles!");
    } else if (sideOne != sideTwo && sideTwo != sideThree && sideThree != sideOne) {
      return ("This is a Scalene!");
    } else {
      return ("Unexpected input");
    }
  }
}
