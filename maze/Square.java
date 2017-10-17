package maze;

public enum Square{
  WALL('#'),
  SPACE('.'),
  START('*'),
  FINISH('o');

  private char mark;

  Square(char c){
    mark = c;
  }

  public String toString(){
    return ""+mark;
  }

  public static Square fromChar(char c){
    switch(c){
      case '#':
        return WALL;
      case '.':
        return SPACE;
      case '*':
        return START;
      case 'o':
        return FINISH;
      default:
        throw new IllegalArgumentException();
    }
  }
}

