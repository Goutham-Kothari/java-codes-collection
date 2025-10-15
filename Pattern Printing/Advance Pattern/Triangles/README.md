# Invert Rotated Half Star Pattern

This Java program prints an inverted rotated half star pattern based on the number of rows entered by the user.

## Pattern Description

Given an input `r` (number of rows), the program prints a pattern that looks like an inverted right triangle of stars (`*`). Each row starts with spaces to rotate the triangle, followed by the appropriate number of stars.

### Example Output

If you enter 5 as the number of rows, the output will be:

```
          * 
        * * 
      * * * 
    * * * * 
  * * * * * 
```

## How It Works

1. The program prompts the user to enter the number of rows.
2. For each row, it prints spaces to rotate the triangle, then prints stars.
3. The number of spaces decreases and the number of stars increases with each row.

## Usage

1. Compile the program:
    ```bash
    javac Invert_Rotaterd_Half.java
    ```
2. Run the program:
    ```bash
    java Invert_Rotaterd_Half
    ```
3. Enter the desired number of rows when prompted.

## Code Explanation

- `Scanner sc = new Scanner(System.in);`  
  Reads user input.
- `int r = sc.nextInt();`  
  Stores the number of rows.
- Two nested loops:
    - First loop prints spaces to rotate the triangle.
    - Second loop prints stars (`*`).

## License

This code is provided for educational purposes.
