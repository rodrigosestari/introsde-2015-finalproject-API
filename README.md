Final Project

**Introduction to Service Design and Engineering | University of Trento |** 

**Name:** Rodrigo Sestari

**Description:**

In this assignment is implemented a server calling this server. 
The server was deployed on Heroku *https://rodrigo-sestari-final-api.herokuapp.com/adapter/**.
Instead the client was implemented to call Heroku server. 

This project contains an Adapter




**Tasks Server:**



* **Request #2:** GET /BloodPressure/{personId}/{token} should give all the personal information plus current measures of person identified by {id} (e.g., current measures means current health profile)
* **Request #3**: GET /Weight/{personId}/{token} should update the personal information of the person identified by {id} (e.g., only the person's information, not the measures of the health profile)

 ```
<measureTypes>
    <measureType>weight</measureType>
    <measureType>height</measureType>
    <measureType>steps</measureType>
    <measureType>bloodpressure</measureType>
</measureTypes>
```



**How to run:**

Running the project requires java and ant.

Ant source file build.xml is annotated. 
* Main targets are:
* **execute.client:** Evaluation Client.The server is: **https://rodrigo-sestari.herokuapp.com/assignment2**. 
* **start:** To start the local server.






**References:**

https://docs.google.com/document/d/1kcRTSzxkvRPT5Lp3A1eqqR51NNqHHHbmHFrjZKqs4Kc/edit#

