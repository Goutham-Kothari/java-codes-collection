# Java — Data Types & Variables (Detailed README)

> A complete, line-by-line explanation of the `DataTypesExample.java` demo (one-class example showing all primitive types, `String`, comments, `System.out.print` / `System.out.println`, and user input via `Scanner`).
> This file is intended to live in `01-data-types-and-variables/README.md`.

---

## Table of contents

1. Overview
2. Files in this folder
3. What this program demonstrates
4. How to compile & run
5. Full explanation (section-by-section)
6. Important tips & common pitfalls
7. Java primitive data types (sizes & ranges overview)
8. Example run (sample input → expected output)
9. Suggested next steps / exercises

---

## 1) Overview

This demo puts a collection of basic Java concepts into a single, readable class so you can see how they work together:

* variable declarations and initialization
* all primitive types + `String`
* three types of comments (`//`, `/* ... */`, `/** ... */`)
* `System.out.print` (sop) and `System.out.println` (sopln) usage
* reading user input using `Scanner`
* closing resources (`Scanner.close()`)

It is a great single-file reference when learning or teaching Java basics.

---

## 2) Files in this folder

* `DataTypesExample.java` — the runnable Java example (single class).
* `README.md` — this file (detailed explanation and notes).

---

## 3) What this program demonstrates (short)

* How to prompt and read user input: `nextLine()`, `nextInt()`, `nextDouble()`, `next()`, `nextBoolean()`
* How to extract a `char` from a `String` using `sc.next().charAt(0)`
* How to print using `System.out.print` (no newline) vs `System.out.println` (with newline)
* Examples of `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`, `String`
* Use of single-line, multi-line, and javadoc-style comments

---

## 4) How to compile & run

Save the class in `DataTypesExample.java` and run:

```bash
# compile
javac DataTypesExample.java

# run
java DataTypesExample
```

If you see compilation errors, read the message in the terminal — it usually tells you the file/line and a hint.

---

## 5) Full explanation (section-by-section)

Below is an annotated explanation of the typical structure of `DataTypesExample.java`. The actual code lines may vary slightly but the structure is the same.

### Header / JavaDoc

```java
/**
 * This program demonstrates:
 * 1. All basic Java data types
 * 2. Variable declaration and initialization
 * 3. System.out.print (sop) and System.out.println (sopln)
 * 4. Single-line, multi-line, and documentation comments
 * 5. Taking user input using Scanner class
 */
```

* `/** ... */` is a documentation comment (JavaDoc). It’s commonly used above classes and methods to document their purpose. Tools like `javadoc` can generate docs from these.

### Import

```java
import java.util.Scanner;
```

* We import `Scanner` so we can read user input from `System.in`.

### Class and main method

```java
public class DataTypesExample {
    public static void main(String[] args) {
        // ...
    }
}
```

* `public class DataTypesExample` — defines the class (file name must match class name if public).
* `public static void main(String[] args)` — program entry point.

### Create Scanner

```java
Scanner sc = new Scanner(System.in);
```

* Creates a `Scanner` that reads from standard input (keyboard).
* Remember to `sc.close()` at the end to free the resource.

### Prompting and reading `String` (full line)

```java
System.out.print("Enter your name: "); // sop
String name = sc.nextLine();
```

* `System.out.print(...)` prints without a newline (often called `sop` in shorthand).
* `sc.nextLine()` reads the entire line up to the newline (space allowed).

### Prompting and reading `int`

```java
System.out.print("Enter your age: ");
int age = sc.nextInt();
```

* `sc.nextInt()` reads the next token and converts it to `int`. It does not consume the newline that follows the token — keep that in mind for subsequent `nextLine()` calls (see tips below).

### Prompting and reading `double`

```java
System.out.print("Enter your height (in meters): ");
double height = sc.nextDouble();
```

* `sc.nextDouble()` reads the next token as a double. Same newline behavior as `nextInt()`.

### Reading a `char` (first character of next token)

```java
System.out.print("Enter your gender (M/F): ");
char gender = sc.next().charAt(0);

// short comment form:
 // Takes the first character of the next user input word (since Scanner has no nextChar() method)
```

* `sc.next()` reads the next token as a `String` (token = sequence up to whitespace).
* `.charAt(0)` extracts the first character of that token. This is a common pattern because `Scanner` has no `nextChar()`.

### Reading a `boolean`

```java
System.out.print("Are you a student? (true/false): ");
boolean isStudent = sc.nextBoolean();
```

* If the user types `true` or `false` (case-insensitive), `nextBoolean()` returns the corresponding boolean. Invalid text throws `InputMismatchException`.

### Declaring other primitive variables inside code

```java
byte byteVal = 100;
short shortVal = 20000;
long longVal = 12345678900L; // note L suffix
float weight = 68.5f;        // note f suffix
double someDouble = 5.9;
```

* `long` literals require `L` or `l` suffix when value exceeds `int` range. Use `L` (preferred) to avoid confusion with `1`.
* `float` literals need `f` suffix (otherwise decimal literals default to `double`).

### Printing output

```java
System.out.println("\n--- USER DETAILS ---"); // sopln
System.out.println("Name: " + name);
System.out.print("Thank you ");
System.out.print(name);
System.out.println(" for using this program!");
```

* `System.out.println(...)` prints the text and moves to a new line (`sopln`).
* `System.out.print(...)` prints but stays on the same line.

### Closing Scanner

```java
sc.close();
```

* Good practice to close streams. Avoid using `Scanner` on `System.in` after closing in larger apps unless you manage streams carefully.

---

## 6) Important tips & common pitfalls

### `nextLine()` vs `nextInt()` / `nextDouble()` newline interaction

* `nextInt()` and `nextDouble()` read tokens but do not consume the newline. If you call `nextLine()` immediately after `nextInt()` you might get an empty string (the leftover newline).
* **Fix:** after `nextInt()` call `sc.nextLine()` once to consume the remainder before calling `nextLine()`:

  ```java
  int age = sc.nextInt();
  sc.nextLine(); // consume leftover newline
  String comment = sc.nextLine();
  ```

### Input type mismatch

* If user types `"abc"` when `nextInt()` is expected, `InputMismatchException` will be thrown and program will crash. For robust programs, use `sc.hasNextInt()` or try-catch to validate.

### `sc.next().charAt(0)` safe usage

* `sc.next()` throws `NoSuchElementException` only when no more tokens exist; normal console input provides tokens. Extracting `charAt(0)` assumes the token is non-empty — which it normally is for `next()`. If you expect empty input or spaces, use `nextLine()` and validate length.

### Prefer trimming and normalization

* To make `char` input robust:

  ```java
  char gender = sc.next().trim().toUpperCase().charAt(0);
  // this ensures whitespace trimmed and letter converted to uppercase
  ```

---

## 7) Java primitive data types — sizes & notes

> The exact sizes for primitives in Java are fixed by the language spec.

* `byte` — 8-bit signed integer — **range:** -128 to 127
* `short` — 16-bit signed integer — **range:** -32,768 to 32,767
* `int` — 32-bit signed integer — **range:** -2,147,483,648 to 2,147,483,647
* `long` — 64-bit signed integer — **range:** -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (use `L` suffix for literals beyond `int`)
* `float` — 32-bit IEEE 754 floating point — approx range: 1.4e-45 to 3.4e38 (single precision), about 7 decimal digits precision (use `f` suffix)
* `double` — 64-bit IEEE 754 floating point — approx range: 4.9e-324 to 1.8e308 (double precision), about 15–16 decimal digits precision
* `char` — 16-bit Unicode character — stores a single character like `'A'`
* `boolean` — `true` or `false` — logical value (size not precisely defined and is JVM-dependent)
* `String` — not a primitive, reference type representing sequence of chars (immutable)

---

## 8) Example run

**User types (stdin):**

```
Abc
22
1.75
M
true
```

**Program prints (stdout):**

```
Enter your name: Enter your age: Enter your height (in meters): Enter your gender (M/F): Enter Are you a student? (true/false): 

--- USER DETAILS ---
Name: Abc
Age: 22
Height: 1.75 meters
Gender: M
Is Student: true

--- OTHER DATA TYPES ---
Byte Value: 100
Short Value: 20000
Long Value: 12345678900
Float Value: 68.5

Thank you Goutham for using this program!
```

> Note: exact ordering/spacing depends on where `print` vs `println` were used in the code.

---
