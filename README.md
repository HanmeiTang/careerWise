# CareerWise
A Job-hunting Recommendation System, which aims to user personalization to improve job search and recommendation.

# Features
* Fetches data from Github Job API
* Implements **content-based** recommendation using keywords extracted from search string using **MonkeyLearn API** (TF-IDF algorithm)
* Backend **MySQL** on **Amazon RDS** to store user data
* Deployed server to **Amazon EC2** to handle 150 queries per second tested by **Apache JMeter**

# Components
* Client (HTML,CSS,JS)
* HTTP Server (Apache Tomcat)
    * GitHub Job API Client <--> GitHub data online
    * Rpc Handlers (Java Servlets)
    * MySQL Client <--> MySQL DB

# Database Management System architecture
* Table History
   * `user_id`
   * `item_id`
   * `time`
* Table `users`: stores user information
   * `user_id`
   * `password`
   * `firstname`
   * `lastname` 
* Table `items`: stores job item information
   * `item_id`
   * `name`
   * `address`
   * `image_url`
   * `url`
* Table `keyword`: item and keyword relationship
    * `item_id`
    * `keyword`

# Before Clone
* Create a hidden config file `.careerwise.yaml` at app root directory
* Add `MONKEY_LEARN_API_KEY` to `.careerwise.yaml`

# List of toolkit
* Apache Tomcat 9.0.35
    * This is a open-source Java Servlet Container developed by Apache Software Foundation
    * Remote Procedure Call (RPC): a function call to a remote server
    * Java Servlet: Java class to handle RPC on server side
    * Tomcat is a environment to run this web page, which is also one of the major Java Framework
    
* Postman [download](https://www.postman.com/downloads/)
* IntelliJ (Ultimate)
    * [Official guide](https://www.jetbrains.com/help/idea/configuring-and-managing-application-server-integration.html#76331)
    * Java Enterprise -> Set Tomcat as `Application Server`
* [GitHub Jobs API](https://jobs.github.com/api)
* [AWS](http://aws.amazon.com)
* MySQL Workbench [download](https://dev.mysql.com/downloads/workbench/)
* [MonkeyLearn](https://app.monkeylearn.com/accounts/register/)
* Core JAVA APIs
   * [Apache Http Client](https://hc.apache.org/httpcomponents-client-ga/)
   * [Java Database Connectivity (JDBC)](https://dev.mysql.com/doc/connector-j/5.1/en/connector-j-usagenotes-connect-drivermanager.html), [connect](https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-usagenotes-connect-drivermanager.html)
* Docker

## Demos
* http://18.216.12.121/careerWise/
* username: 1234
* password: 1234
