Operators in Java

## 📖 Introduction
In Java, **operators** are special symbols that perform operations on variables and values.  
An **expression** combines operators and operands to produce a result.

Example:
```java
int c = a + b;
````

Here:

* `+` → Operator
* `a`, `b` → Operands
* `a + b` → Expression
* `c` → Stores the result

---

## 🧩 About Operator, Operand & Expression

| Term           | Description                           | Example                 |
| -------------- | ------------------------------------- | ----------------------- |
| **Operator**   | Symbol that performs an operation     | `+`, `-`, `*`, `/`, `%` |
| **Operand**    | Variable/value on which operator acts | `a`, `b`                |
| **Expression** | Combination of operands and operators | `a + b`, `x > y`        |

---

## ⚙️ Types of Operators in Java

| Type                     | Description                      | Common Symbols                    |   |        |
| ------------------------ | -------------------------------- | --------------------------------- | - | ------ |
| **Arithmetic Operators** | Perform mathematical operations  | `+`, `-`, `*`, `/`, `%`           |   |        |
| **Unary Operators**      | Operate on a single operand      | `++`, `--`, `-`                   |   |        |
| **Relational Operators** | Compare two values               | `==`, `!=`, `>`, `<`, `>=`, `<=`  |   |        |
| **Logical Operators**    | Combine multiple conditions      | `&&`, `                           |   | `, `!` |
| **Assignment Operators** | Assign or modify variable values | `=`, `+=`, `-=`, `*=`, `/=`, `%=` |   |        |

---

## ➕ 1. Arithmetic Operators

Used for **basic mathematical calculations**.

| Operator | Meaning             | Example | Result (a=10, b=5) |
| -------- | ------------------- | ------- | ------------------ |
| `+`      | Addition            | `a + b` | 15                 |
| `-`      | Subtraction         | `a - b` | 5                  |
| `*`      | Multiplication      | `a * b` | 50                 |
| `/`      | Division            | `a / b` | 2                  |
| `%`      | Modulus (Remainder) | `a % b` | 0                  |

**Example:**

```java
System.out.println(a + b); // 15
System.out.println(a - b); // 5
System.out.println(a * b); // 50
System.out.println(a / b); // 2
System.out.println(a % b); // 0
```

---

## 🔁 2. Unary Operators

Unary operators act on a **single operand**.

| Operator | Meaning        | Example               | Description       |
| -------- | -------------- | --------------------- | ----------------- |
| `++a`    | Pre-increment  | Increments before use | `a = 5 → ++a = 6` |
| `a++`    | Post-increment | Increments after use  | `a = 5 → a++ = 5` |
| `--a`    | Pre-decrement  | Decrements before use | `a = 5 → --a = 4` |
| `a--`    | Post-decrement | Decrements after use  | `a = 5 → a-- = 5` |
| `-a`     | Unary minus    | Negates the value     | `a = 5 → -a = -5` |

**Example:**

```java
int a = 5;
System.out.println(++a); // 6
System.out.println(a--); // prints 6, then a = 5
System.out.println(-a);  // -5
```

---

## 🔍 3. Relational Operators

Used to **compare** two values.
Result: **true** or **false**

| Operator | Meaning                  | Example  | Result (a=10, b=20) |
| -------- | ------------------------ | -------- | ------------------- |
| `==`     | Equal to                 | `a == b` | false               |
| `!=`     | Not equal to             | `a != b` | true                |
| `>`      | Greater than             | `a > b`  | false               |
| `<`      | Less than                | `a < b`  | true                |
| `>=`     | Greater than or equal to | `a >= b` | false               |
| `<=`     | Less than or equal to    | `a <= b` | true                |

**Example:**

```java
System.out.println(a > b);   // false
System.out.println(a < b);   // true
System.out.println(a == b);  // false
```

---

## ⚖️ 4. Logical Operators

Used to combine **multiple boolean conditions**.

| Operator | Meaning     | Example  | Result                 |    |   |    |                         |
| -------- | ----------- | -------- | ---------------------- | -- | - | -- | ----------------------- |
| `&&`     | Logical AND | `x && y` | true only if both true |    |   |    |                         |
| `        |             | `        | Logical OR             | `x |   | y` | true if any one is true |
| `!`      | Logical NOT | `!x`     | reverses boolean value |    |   |    |                         |

**Example:**

```java
boolean x = true, y = false;
System.out.println(x && y); // false
System.out.println(x || y); // true
System.out.println(!x);     // false
```

**Truth Table:**

| x | y | x && y | x || y | !x |
| - | - | ------ | ------ | -- |
| T | T | T      | T      | F  |
| T | F | F      | T      | F  |
| F | T | F      | T      | T  |
| F | F | F      | F      | T  |

---

## 🧾 5. Assignment Operators

Used to assign or update variable values.

| Operator | Example  | Meaning                     | Result (if c=10) |
| -------- | -------- | --------------------------- | ---------------- |
| `=`      | `c = a`  | Assigns value of `a` to `c` | `c = 10`         |
| `+=`     | `c += 5` | `c = c + 5`                 | 15               |
| `-=`     | `c -= 3` | `c = c - 3`                 | 12               |
| `*=`     | `c *= 2` | `c = c * 2`                 | 20               |
| `/=`     | `c /= 4` | `c = c / 4`                 | 2                |
| `%=`     | `c %= 3` | `c = c % 3`                 | 1                |

**Example:**

```java
int c = 10;
c += 5; // 15
c -= 3; // 12
c *= 2; // 24
c /= 4; // 6
c %= 3; // 0
```

---

## 🧮 Example Expression

```java
int result = (a + b) * 2 - (a / b);
```

Here:

* Operators → `+`, `*`, `-`, `/`
* Operands → `a`, `b`
* Expression value depends on input of `a` and `b`

---

## 🧠 Key Points to Remember

✅ Operators perform **actions** on operands
✅ Expressions combine multiple operators to form logic
✅ **Precedence** decides which operator executes first
✅ **Parentheses ()** can override normal order
✅ Logical & relational operators are used in **conditions and loops**

---

## 💻 Full Example Program

```java
import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n--- Unary Operators ---");
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
        System.out.println("a++ = " + (a++));
        System.out.println("b-- = " + (b--));
        System.out.println("After post operations: a = " + a + ", b = " + b);
        System.out.println("Unary minus (-a) = " + (-a));

        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        System.out.println("\n--- Logical Operators ---");
        boolean x = true, y = false;
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        System.out.println("\n--- Assignment Operators ---");
        int c = a;
        System.out.println("c = " + c);
        c += 5;
        System.out.println("c += 5 → " + c);
        c -= 3;
        System.out.println("c -= 3 → " + c);
        c *= 2;
        System.out.println("c *= 2 → " + c);
        c /= 4;
        System.out.println("c /= 4 → " + c);
        c %= 3;
        System.out.println("c %= 3 → " + c);

        sc.close();
    }
}
```

---

## 🧾 **FULL OUTPUT**

```
Enter first number: 10
Enter second number: 5

--- Arithmetic Operators ---
a + b = 15
a - b = 5
a * b = 50
a / b = 2
a % b = 0

--- Unary Operators ---
++a = 11
--b = 4
a++ = 11
b-- = 4
After post operations: a = 12, b = 3
Unary minus (-a) = -12

--- Relational Operators ---
a == b : false
a != b : true
a > b  : true
a < b  : false
a >= b : true
a <= b : false

--- Logical Operators ---
x && y : false
x || y : true
!x     : false

--- Assignment Operators ---
c = 12
c += 5 → 17
c -= 3 → 14
c *= 2 → 28
c /= 4 → 7
c %= 3 → 1
```

---

### 🧠 **Explanation Summary**

| Section        | Description                                                                                    |
| -------------- | ---------------------------------------------------------------------------------------------- |
| **Arithmetic** | Shows results of addition, subtraction, multiplication, division, and modulus between 10 and 5 |
| **Unary**      | Demonstrates pre/post increment and decrement; changes in `a` and `b` are shown                |
| **Relational** | Compares `a` and `b` and returns true/false accordingly                                        |
| **Logical**    | Works with boolean values `x=true` and `y=false`                                               |
| **Assignment** | Shows use of compound assignments like `+=`, `-=`, etc. with final results                     |

---
