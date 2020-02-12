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

#### Part 1 - Creating Tables
* Use your RDBMS to store the following tables.
* The tables should contain the columns from the specifications below.
* You can generate the required tables (without data populated) from your entities by using JPA.
* Place each of the `CREATE` statements in their respective `*.sql` file locations.
    * Each `*.sql` file can be found in the [resources directory](./src/main/resources) of this project.



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


* **NOTE**: Place the `CREATE` statement in the respective [sql file location](./src/main/resources/students.create-table.sql).
    
    
##### Table 2 – Course
* Column1
    * Column Name: `id`
    * Column Data-Type: `int not null (PK)`
    * Column Description: Unique course identifier
* Column2
    * Column Name: `name` 
    * Column Data-Type: `varchar(50) not null`
    * Column Description: provides the name of the course
* Column3
    * Column Name: `instructor` 
    * Column Data-Type: `varchar(50) not null`
    * Column Description: provides the name of the instructor

* **NOTE**: Place the `CREATE` statement in the respective [sql file location](./src/main/resources/courses.create-table.sql).


#### Part 1B - Populating tables
* insert test/dummy rows in Table 1 and Table 2 using SQL statements.
* Necessary SQL statements for populating the table can be in the [resources directory](./src/main/resources) of this project.
    * [courses.populate-table.sql](./src/main/resources/courses.populate-table.sql)
    * [students.populate-table.sql](./src/main/resources/students.populate-table.sql)
    
    


#### Part 2 - Create Model Classes
* Using each of the interfaces provided in the `model` package as a guide, create a model for each of the aforementioned tables.
* Use the appropriate annotation to indicate
    * the models are to be used as an `Entity`
    * the name of the table each entity is based on
    * the variable that is used as a primary key
    * the relationships
    * the name of the column each variable is based on each entity.
* Every Model class must contain the following general two requirements:
    * A nullary constructor
    * A non-nullary constructor which initializes every private member with a parameter provided to the constructor.
    * entirely private fields
    * public getters and setters



#### Part 3 - Create DAO Classes
* Using each of the interfaces provided in the `service` package as a guide, create a service for each of the aforementioned tables.



#### Part 4 - Create Service Classes
* Using each of the interfaces provided in `model`, `service`, and `dao` packages as a guide, create a model for each of the aforementioned tables.
* You can **NOT** add more methods in the interfaces than the definition below.
* In `dao` package, under the package names: jpa.dao, create an interface and call it StudentDAO. This interface is going to be have the following method declarations. Please include the proper method signature based on the Service table: