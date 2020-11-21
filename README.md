### GROUP E

- [Logic Data Model](https://github.com/LargeSystemsDevelopment2020/MoonLodge/blob/master/diagrams/LogicDataModel.md)

* * *

- [Use Case Model](https://github.com/LargeSystemsDevelopment2020/MoonLodge/blob/master/diagrams/UseCase.md)

* * *

- [Sequence Diagram](https://github.com/LargeSystemsDevelopment2020/MoonLodge/blob/master/diagrams/SequenceDiagram.md) 

* * *

- [Assignment 3](https://github.com/LargeSystemsDevelopment2020/MoonLodge_Assigment3)

* * *

- [Jenkins Server](http://206.81.29.87:8080/login?from=%2F)

* * *

- [Archiva](http://rasmuslynge.com:8088/)

* * *

To run **unit tests** by using the command `mvn clean test -P dev`

To run **integration test** by using the command `mvn clean verify -P integration-test`

**SonarQube**, a static test suite is also used in this project but only accessible through a token. 

[SonarQube Setup](https://docs.sonarqube.org/latest/setup/get-started-2-minutes/) or just run docker-image 

`docker run -d --name sonarqube -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:latest`

 * got to http://localhost:9000 admin/admin
 
 * click "+" on the right top corner and create a "Project key". Key name has to match groupid:artifactid of the project

* * *

To see the **Java Code Coverage Library JaCoCo** go to the following path `/target/site/jacoco/index.html`

* * *

To see the **Pit mutation test** reports go to `/target/pit-reports/index.html`
 
