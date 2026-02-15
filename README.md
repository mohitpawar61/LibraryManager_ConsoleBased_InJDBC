📚 Library Manager (Console-Based, JDBC)

A simple console-based Java library management application that uses JDBC for database connectivity.
This project helps manage library operations via the command line and stores data in a relational database.

🧠 Technologies Used
Technology	                                      Purpose
Java (Core)                	                 Main programming language
JDBC (Java Database Connectivity)  	         Connects Java with the database
Relational Database                          Stores books, members, and transactions
(MySQL / SQLite / any JDBC-supported DB)
IDE (Eclipse / IntelliJ / Vscode)	           For development and execution
SQL (DDL & DML)                            	 Used to create and manipulate database tables

📝 Features :
This console program enables basic library operations:

✔ Book Management
1.Add new books
2.List all books
3.Search books by ID or title
4.Delete books
(exact functionality may vary slightly depending on code)

✔ User / Member Management
1.Add a new library member
2.View member details

✔ Issue & Return Books
1.Issue a book to a user
2.Return issued books
3.Track book availability

✔ Console-Menu Driven
1.User interacts through numbered menu options
2.Prompts for input in the terminal

⚙️ All database operations are done via JDBC calls from Java to the connected database.

💾 Database Schema :
You will need a database with at least the following tables:

Books :
Column	                     Type	                         Description
id	                       INT / VARCHAR	                 Primary key
title	                     VARCHAR	                        Book title
author	                   VARCHAR	Book                    Book author
quantity	                     INT	                     Number of copies

Users :
Column	                    Type	                         Description
id	                       INT / VARCHAR 	                 Primary key
name	                        VARCHAR                      	User name

Issued_books :
Column	                   Type	                            Description
issue_id	                 INT	                            Primary key
book_id	                   INT	                            Foreign key
user_id	                   INT	                            Foreign key
issue_date	               DATE	                         When book was issued

Note: Actual table and column names depend on how the author created them in code.

🛠 Installation & Setup :
1.Clone the repository :
git clone https://github.com/mohitpawar61/LibraryManager_ConsoleBased_InJDBC.git

2.Open in a Java IDE :
Import the project into Eclipse / IntelliJ / NetBeans.

3.Set up database :
Create a database (e.g., library_db).
Create the necessary tables using SQL.
Add your database credentials (URL, username, password) in the Java code where the JDBC connection is established.

Add JDBC driver
For MySQL, add mysql-connector-java.jar.
For SQLite, add the relevant JDBC jar.
Place it into your project’s classpath.

Run the application
Execute the Main class from your IDE.
Use the console menus to run operations.

🧑‍💻 How It Works :
The program starts and displays a menu in the console.

User selects options like:
Add book
View books
Add user
Issue / return books

For each action, the app runs JDBC queries to:
Insert, Update, Select, or Delete records
Connect through JDBC driver to the database
Output is printed back to the console.

🧪 Example Use
Welcome to Library Manager!

1. Add Book
2. View Books
3. Add User
4. Issue Book
5. Return Book
6. Exit

Enter choice: 1
Enter Book Name: The Alchemist
Enter Author: Paulo Coelho
Enter Quantity: 5
Book added successfully!

🎯 Benefits

Helps learn JDBC database operations
Good starter project for Java beginners
Understand menu-driven console applications
Teaches basic CRUD (Create/Read/Update/Delete) via JDBC

📦 Contributions
Feel free to:
Add search by title/author
Improve input validation
Add report of issued books
Refactor into OOP design (Book/User classes)

📝 License
No license defined in original repo — consider adding one if you plan to share or reuse.
