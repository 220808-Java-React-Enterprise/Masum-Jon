# WebServer

## Description
The WebServer should be able to authenticate valid employees who will submit a reimbursment request on an expense they encountered. Requests are then forwarded to a database to await decision. Low Level Api servlets to communicate with a local host, utilizing tokens to authurize people. On the Richardson maturity model, this would be ranked as level 1 due to servlets being able to communicte with multiple enities using both get and post requests.
### Usage

### Brief
This webapp attempts to offer highly afforable and very reliable service that allows users, administrations and financial managers to track and interact with reimbursement requests with ease. This is achieved by using relevant tecnologies that secure both the users and managers to have thier information encrypted and stored in  stateless manner so that it is not directly saved. 

## Roles
*Admin
*User
*Manager

## Specifics
Currently  reimbursements for food, travel, lodging are allowed.
Roles defined to Admin, User and Financial Manager.

##Tecnologies
Java 8- Used for creation and logic flow of servlets.
IntelliJ- Compliler for Java programs.
Postman- Used for tracking gets, posts and interacting with the database from a backend level.
Apache Maven- Used to handle dependencies between diffrent tecnologies allowing them to send data to one another.
JDBC-Java Data Base Connection, used to connect java program to database.
Postgres SQL- Language used to interact with database.
Jackson- Dependencies for low-level incremental parsing and management of data via JDP (Jackson Data Processor.)
Java EE Servlets- Used as stopgap communicators for tomcat.
JSON Web Tokens- Used to authenticate logins for users.
JUnit- Testing dynamic to result in high code coverage.
Mockito- Mocking of database object entries to increase code coverage via spy(s) and mock(s).

## Features
Users may login, send new reimbursement requests and see the status of thier reimbursements and 
   

Admin may create user, ban user and change user details.
   
   
Financial Manager may approve/deny reimbursements, see details and numerage of reimbursements thorugh filters.



### More Features to implement:
Front end user interface.
More options for all users in regards to reimbursement management.
