# Build a Maze
This assignment is based on
[Don Blaheta's nifty assignment](http://nifty.stanford.edu/2008/blaheta-maze/cs2/index.html).

Consider a basic maze. It has walls and pathways, and it has one (or more)
starting point(s) and one (or more) finish point(s). Furthermore, one wall is
just like another, and any open spaces (not including start and finish) are also
identical. That sounds like a job for enumerated types:
* [Java tutorial on enum types](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)
* [more examples](https://www.mkyong.com/java/java-enum-example)

The ```Square.java``` defines an enumerated type Square that can represent those four values.
Each one has an associated one-character representation:
* walls ```#``` (hash mark)
* open spaces ```.``` (period)
* start ```o``` (lowercase 'O')
* finish ```*``` (asterisk)

The ```toString``` method that returns a one-character long string containing
only the character corresponding to this ```Square```. The static method
```fromChar``` returns the ```Square``` associated with the given ```char```.
When provided with one of the four legal characters, ```fromChar``` returns one
of the ```Square``` values and any other input will generate an
```IllegalArgumentException```.)

Create a Maze class that can store the logical layout of a maze. It should
contain a 2D array of ```Square``` (Remember, a 2D array is just like a 1D
array, except that you always provide two indices.)
Maze should have a constructor that can read from a ```Scanner```. The format will
be that the first line contains the dimensions of the maze (width and height),
and subsequent lines each contain one row of the maze, with each character
representing one square of the maze.

Also, write a ```toString``` method that makes a ```String``` representation of
this Maze in the same format as the input. (This will be handy in testing your
code...)

A simple example of the input/output format:

```
7 4
#######
#...#o#
#*#...#
#######
```

A more complex example:
```
12 10
############
#.#........#
#.#.######.#
#.#....#...#
#.###.*#.#.#
#...####.#.#
#.#.#..#.#.#
#.#.#.##.#.#
#o#......#.#
############
```

We will use a five-operation agenda ADT for navigating the maze. This is an
important idea but not quite present in the Java libraries. In this
problem, you’ll adapt existing library code into a more abstract framework.
First, write the ```Agenda<T>``` interface. It should require five methods:
```isEmpty```, ```size```, ```add```, ```remove```, and ```peek```.

Then, write two classes ```MyStack<T>``` and ```MyQueue<T>``` that implement
that interface using, respectively, a LIFO policy and a FIFO policy. Code re-use
is key here; all the real algorithm work is already done, and your only job for this
problem is to adapt it for use in this framework. Remember, you’re using the
Java libraries in this problem.

Use [java.util.Stack](https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html)
to implement ```MyStack<T>``` and use
[java.util.LinkedList](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html)
to implement ```MyQueue<T>```.

You need to test your ```MyStack``` and ```MyQueue``` implementation by writing
test code in ```tests.MyQueueTest.java``` and ```tests.MyStackTest.java```.
To run the tests you need to do the following in your project directory:
```
javac maze/MyQueue.java
javac -cp . tests/MyQueueTest.java
java tests.MyQueueTest
```