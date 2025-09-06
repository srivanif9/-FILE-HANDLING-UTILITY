# -FILE-HANDLING-UTILITY

*COMPANY* : CODTECH IT SOLUTIONS

*NAME* : KOPPU SRIVANI

*INTERN ID* : CT04DY1050

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTOR* : NEELA SANTHOSH

*DESCRIPTION* :

INTRODUCTION :
The project FILE HANDLING UTILITY is a Java-based program designed to demonstrate the fundamental operations of handling, including writing data into a file, reading data from a file, and modifying (appending) data to an existing file. File handling plays a crucial role in software development because almost every appliation needs to store, retrieve, and update infromation in persistent storage. This project addresses the problem of interacting with text files through a simple utility that is easy to understand, user-friendly, and practical for beginners.

The program accepts user input through the console and provides three major options:

*Write to file* : Create a new text file or overwrites existing content.

*Read from file* : Reads and displays file content line by line.
 
*Modify file* : Appends new content to an already existing file without erasing its previous data.

TOOLS USED:

The primary tool used for this project is the Java programming language,specially Java I/O classes from the java.io package. These classes are standard in Java and provide robust methods to interact with files. Some important tools and libraries include:

*FileWriter* - Used to create and write text to a file.

*FileReader* - Used for reading character data from files.

*BufferedReader* - Reading texteffeciently, line by line, from a file.

*Scanner* - Used to take user input from the console.

*Exception Handling(try-catch)* - Ensure the program handles unexpected issues like missing files or permission errors gracefully.

ENVIRONMENT AND PLATFORM :

The environment for running this program is:

Programming language: Java(JDK version 8 or higher recommended)

IDE : Visual Studion Code
Operating System: Platform independent, as Java can run on Windows, Linux, and macOS.

Dependencies: No external dependencies are required because the code relies only on core Java libraries.

This makes the project highly portable and lightweight. A developer can simply copy the .java file to any machine with Java installed, compile it using javac FileHandlingUtility,java, and run it with java FileHandlingUtility.

WORKING OF THE CODE :

The execution begins with a menu-driven interface that prompts the user to select an operation: write, read, or modify. Based on the user's choice, the corresponding method(Writefile, readfile, or modifyfile) is invoked.Each method encapsulates its functionality inside a try-with-resources block to ensure file streams are properly closed after use. This not only improves code readability but also prevents resource leaks.

Write Operation: The program asks the user for input and write it into sample.txt, overwriting any previous content.

Read Operation:The program opens sample.txt, reads content line using BufferedReader, and displays it on the console.

Modify Operation:The program appends new text to sample.txt, preserving existing content and adding new data on a new line.

APPLICATIONS :

This project can be applied in several areas of real-world scenarios, including:

1.Text Editors-A simplified version of how text editors(like Notepad) store and retrieve content.

2.Log Management- Maintaining system logs or error logs by appending new entries without deleting previous ones.

3.Student or Employee Records-Basic file-based storage of details when databases are not required.

4.Configuration Files - Reading and writing configuration data in plain text files for applications.

5.Learning Resources - A perfect example for students and beginners to understand file handling in Java before moving to more advanced database systems.

CONCLUSION

The File Handling Utility demonstrates the practical implementation of file operations in Java using simple yet powerful tools from the java.io package. By combing reading,writing, and modification capabilities, the project hightlights the essential skills required to work with persistent data storage in real -world applications. Developed and executed in VS Code, the program runs on any platform that supports Java, making it versatile and portable. Its application range from basic file editing tools to log management system, showcasing the importance of file handling in software development.

Through this project, one gains a strong understanding of how to handle files effectively, preparing the ground for tackling more complex progamming challenges in future development tasks.

*OUTPUT* :

<img width="387" height="196" alt="Image" src="https://github.com/user-attachments/assets/c2560d2f-92ec-4959-981c-7ad157eb425f" />

<img width="387" height="178" alt="Image" src="https://github.com/user-attachments/assets/54268767-011a-4fd8-95c5-d7ed8dcab2a0" />
