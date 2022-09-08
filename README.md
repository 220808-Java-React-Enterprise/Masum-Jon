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

## Tecnologies
Java 8- Used for creation and logic flow of servlets.
<br/>
<br/>
IntelliJ- Compliler for Java programs.
<br/>
<br/>
Postman- Used for tracking gets, posts and interacting with the database from a backend level.
<br/>
<br/>
Apache Maven- Used to handle dependencies between diffrent tecnologies allowing them to send data to one another.
<br/>
<br/>
JDBC-Java Data Base Connection, used to connect java program to database.
<br/>
<br/>
Postgres SQL- Language used to interact with database.
<br/>
<br/>
Jackson- Dependencies for low-level incremental parsing and management of data via JDP (Jackson Data Processor.)
<br/>
<br/>
Java EE Servlets- Used as stopgap communicators for tomcat.
<br/>
<br/>
JSON Web Tokens- Used to authenticate logins for users.
<br/>
<br/>

![image](https://user-images.githubusercontent.com/102322868/189154212-d808e186-4341-4f95-ac6d-bebd0e016db2.png)
![image](https://user-images.githubusercontent.com/102322868/189154253-b3217b67-90f3-417c-ac5d-436dab4a16c7.png)

## Features
Users may login, send new reimbursement requests and see the status of thier reimbursements and 
   

Admin may create user, ban user and change user details.
   
   
Financial Manager may approve/deny reimbursements, see details and numerage of reimbursements thorugh filters.



### More Features to implement:
Front end user interface.
More options for all users in regards to reimbursement management.
