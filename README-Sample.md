# Project Title

* **Objective** 
    * To create a basic School Management System where students can register to courses, and view the course assigned to them.
* **Purpose**
    * To demonstrate understanding of the integration of SQL and JDBC
* **Description**
    * Only students with the right credentials can log in. Otherwise, a message is displayed stating: “Wrong Credentials”.
        1. Valid students are able to see the courses they are registered.
        2. Valid students are able to register to any course in the system as long as they are NOT already registered.







## How to Download

#### Part 1 - Forking the Project
* To _fork_ the project, click the `Fork` button located at the top right of the project.


#### Part 2 - Navigating to _forked_ Repository
* Navigate to your github profile to find the _newly forked repository_.
* Copy the URL of the project to the clipboard.

#### Part 3 - Cloning _forked_ repository
* Clone the repository from **your account** into the `~/dev` directory.
  * if you do not have a `~/dev` directory, make one by executing the following command:
    * `mkdir ~/dev`
  * navigate to the `~/dev` directory by executing the following command:
    * `cd ~/dev`
  * clone the project by executing the following command:
    * `git clone https://github.com/MYUSERNAME/NAMEOFPROJECT`

#### Part 4 - Check Build
* Ensure that the tests run upon opening the project.
    * You should see `Tests Failed: 99 of 99 tests`







## How to Submit

#### Part 1 -  _Pushing_ local changes to remote repository
* from a _terminal_ navigate to the root directory of the _cloned_ project.
* from the root directory of the project, execute the following commands:
    * add all changes
      * `git add .`
    * commit changes to be pushed
      * `git commit -m 'I have added changes'`
    * push changes to your repository
      * `git push -u origin master`

#### Part 2 - Submitting assignment
* from the browser, navigate to the _forked_ project from **your** github account.
* click the `Pull Requests` tab.
* select `New Pull Request`





## Objective

#### Part 1 - Tables
* Use your RDBMS to that stores the following tables.
* The tables should contain the columns from the specification below.
* You can generate the required tables (without rows) from your entities by using JPA.



##### Table 1 – Student
* Column1
    * Column Name: `email`
    * Column Data-Type: `varchar(50) not null (PK)`
    * Column Description: Student's current school email, unique student identifier
* Column2
    * Column Name: `name`
    * Column Data-Type: `varchar(50) not null`
    * Column Description: The full name of the student
* Column3
    * Column Name: `password`
    * Column Data-Type: `varchar(50) not null`
    * Column Description: Student's password used to log in
    
    
##### Table 2 – Course
* Column1
    * Column Name: 
    * Column Data-Type:
    * Column Description:
* Column1
    * Column Name: 
    * Column Data-Type:
    * Column Description:
* Column1
    * Column Name: 
    * Column Data-Type:
    * Column Description:
    



 
Datatype
	

Name
	

Description

varchar(50) not null (PK)
	

email
	

Student’s current school email, unique student identifier

varchar(50) not null
	

name
	

The full name of the student

varchar(50) not null
	

password
	

Student’s password in order to log in

 

 

Table 2 – Course table:

Datatype
	

Name
	

Description

int not null (PK)
	

id
	

Unique Course Identifier

varchar(50) not null
	

name
	

Provides the name of the course

varchar(50) not null
	

Instructor
	

Provides the name of the instructor

Now, insert test/dummy rows in Table 1 and Table 2 using SQL statements. Necessary SQL statements will be found here: Student.sqlPreview the document and Course.sqlPreview the document