# Anagram Finder

## Instructions

In order to run this programme you need to have JDK/OpenJDK installed.
The *Main.java* file is located inside *./src* .

As an IDE I primarily use IntelliJ IDEA. To compile and run you
can simply press the *RUN* button or *shift + F10*.

For the IntelliJ IDEA, the setup is JDK 17, but I also use VSCode
which I set up with OpenJDK 11, but also in order to run it in VSCode
there might need to be some changes such as.

In Main.java at line 10 change this:
```java
FileReader("./src/input.txt");
```

To this:
```java
FileReader("input.txt");
```
The same should be done for *output.txt* 

All depending on from which directory the project is run. For VSCode
you need to open the terminal, use *cd* to move into the *src* folder
and run:
```
javac Main.java
java Main
```

The answers for the points 3.Document Design Decisions
and 4. Scalability Consideration are in the *DOC.md* 