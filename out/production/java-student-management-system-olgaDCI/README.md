## Exercise: Access Modifiers, Inheritance, and Maps - Package1.Student Management System

#### Objective:

Practice using access modifiers, inheritance, and maps in Java by creating a simple student management system.

#### Description:

You should create a student management system that stores and manages information about students. There should be a base class Package1.Student, and two derived classes: Package2.UndergraduateStudent and Package2.GraduateStudent. The base class Package1.Student should have protected instance variables for the student's name and student ID, and should include public methods to set and get these attributes. The derived classes should inherit these attributes and methods and add their own attributes and methods for specific types of students. Use a HashMap to manage the students, with the student ID as the key.

#### Guidelines:

1.	Create a Package1.Student class with the following protected instance variables:
    -	String name
    -	int studentID
2.	Implement the following public methods in the Package1.Student class:
    -	setName - to set the student's name.
    -	getName - to get the student's name.
    -	setStudentID - to set the student's ID.
    -	getStudentID - to get the student's ID.
3.	Create a derived class Package2.UndergraduateStudent that inherits from Package1.Student and has the following additional attributes:
    -	int year
4.	Implement the following methods in the Package2.UndergraduateStudent class:
    -	setYear - to set the year of study for the undergraduate student.
    -	getYear - to get the year of study for the undergraduate student.
5.	Create another derived class Package2.GraduateStudent that inherits from Package1.Student and has the following additional attributes:
    -	String researchTopic
6.	Implement the following methods in the Package2.GraduateStudent class:
    -	setResearchTopic - to set the research topic for the graduate student.
    -	getResearchTopic - to get the research topic for the graduate student.
7.	In the main method, create a HashMap to manage students, with the student ID as the key. Add instances of Package2.UndergraduateStudent and Package2.GraduateStudent to the map, set their attributes, and display their information.
