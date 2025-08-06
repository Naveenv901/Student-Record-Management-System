# Student Record Management System (CLI-Based CRUD)

## 📌 Task Overview

This project is part of a Java Developer Internship assignment. The objective was to build a **Command-Line Interface (CLI)** based **CRUD** (Create, Read, Update, Delete) system to manage student records using core Java concepts.

---

## 🛠 Tools & Technologies Used

- **Language**: Java
- **IDE**: VS Code / IntelliJ Community Edition
- **Data Structure**: ArrayList
- **Java Features**: Classes, Objects, Encapsulation, Constructors, Getters/Setters

---

## 📚 Project Structure

### 🔹 `Student.java`
- Contains the `Student` class with fields: `id`, `name`, and `marks`.
- Includes constructor, getter/setter methods, and a custom `toString()` for display.

### 🔹 `Main.java`
- CLI menu-driven application using a `Scanner` for input.
- Stores student records in an `ArrayList<Student>`.
- Features implemented:
  - Add Student (with duplicate ID check)
  - View Students
  - Update Student (by ID)
  - Delete Student (by ID)
  - Exit Program

---

## ✅ Features

- Prevents duplicate student entries (based on ID).
- Clean and interactive menu interface.
- Fully functional CRUD operations.
- Uses best practices like encapsulation and modular design.

---

## 📸 Sample Output (CLI)

--- Student Record Management System ---
1. Add Student     
2. View Students   
3. Update Student  
4. Delete Student  
5. Exit
Enter your choice: 1
Enter ID: 1
Enter Name: naveen
Enter Marks: 500
Student added successfully!

--- Student Record Management System ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1
Enter ID: 1
Student with ID 1 already exists. Cannot add duplicate.
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1
Enter ID: 1
Enter Name: naveen
Enter Marks: 500
Student added successfully!

--- Student Record Management System ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1
Enter ID: 1
Student with ID 1 already exists. Cannot add duplicate.
Enter Name: naveen
Enter Marks: 500
Student added successfully!

--- Student Record Management System ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1
Enter ID: 1
Student with ID 1 already exists. Cannot add duplicate.
4. Delete Student
5. Exit
Enter your choice: 1
Enter ID: 1
Student with ID 1 already exists. Cannot add duplicate.

--- Student Record Management System ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
