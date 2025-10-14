# 🟦 Hollow Rectangle Pattern in Java

This Java program prints a **hollow rectangle pattern** using asterisks (`*`).  
It takes the number of **rows** and **columns** as input from the user and prints the corresponding hollow rectangle on the console.

---

## 📜 Program Explanation

The program demonstrates **nested loops**, **conditional statements**, and **user input handling** using the `Scanner` class.

### 💡 Logic Breakdown
1. Take two inputs from the user:
   - Number of rows (`r`)
   - Number of columns (`c`)
2. Use two `for` loops:
   - Outer loop → controls the number of rows.
   - Inner loop → controls the number of columns.
3. For each position `(i, j)`:
   - Print `*` if it's on the **border** (first/last row or first/last column).
   - Print a **space** otherwise.

---

## 🧩 Code

```java
import java.util.Scanner;

class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for row :");
        int r = sc.nextInt();
        System.out.print("Enter the value for column :");
        int c = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

```

## 🧠 Example Output

```
Enter the value for row :4
Enter the value for column :5
* * * * * 
*       * 
*       * 
* * * * * 
```

---

## 🧰 Concepts Used

* **Loops (for loop)**
* **Conditional Statements (if-else)**
* **User Input (Scanner class)**
* **Pattern Printing Logic**

---

## 📘 How to Run

1. Save the file as `Hollow_Rectangle.java`
2. Open a terminal or command prompt.
3. Compile the program:

   ```bash
   javac Hollow_Rectangle.java
   ```
4. Run the program:

   ```bash
   java Hollow_Rectangle
   ```

---

## 🏁 Output Visualization

For input:

```
Rows = 3
Columns = 6
```

Output:

```
* * * * * * 
*         * 
* * * * * * 
```
