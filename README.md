# Assignment Crossian


## Features

- **Add Subjects**: Teachers can specify the list of subjects for the semester.
- **Enter Student Information**: Input students' names and their scores for each subject.
- **Generate Scoreboard**:
    - Displays student scores for each subject.
    - Calculates and displays each student's average score.
- **Highlight Top Students**:
    - Identifies the student with the highest average score.
    - Finds the student with the highest individual subject score.

---

## Require
- Java 8 or older

---

## How to Run the Program

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/annguyen2805/assignment-crossian.git
    ```
2. **Compile Code:**:
   ```bash
   javac src/Main.java
    ```
3. **Execute Program**:
   ```bash
   java src/Main.java
    ```


## Example Workflow
Input:
```chatinput
Enter the list of subjects: Math, Science, English
Enter the number of students: 2
Enter the student's name: An
Enter the score for Math: 9.5
Enter the score for Science: 8.7
Enter the score for English: 8.9
Enter the student's name: Thinh
Enter the score for Math: 8.0
Enter the score for Science: 9.2
Enter the score for English: 8.5
```



Output:
```chatinput
=== Scoreboard ===
No.     Name    Math    Science    English    Average Score
1       An      9.5     8.7        8.9        9.03
2       Thinh   8.0     9.2        8.5        8.57

Student with the highest average score: Alice with 9.03
Student with the highest individual subject score: Alice with 9.5

```
