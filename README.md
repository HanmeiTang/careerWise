# CareerWise
A Job-hunting Recommendation System

# Features
* Fetches data from Github Job API
* Implements content-based recommendation using keywords extracted from search string
* Keyword extraction by MonkeyLearn API through TF-IDF algorithm
* 

# Components
* Client (HTML,CSS,JS)
* HTTP Server (Apache Tomcat)
    * GitHub Job API Client <--> GitHub online
    * Rpc Handlers (Java Servlets)
    * MySQL Client <--> MySQL DB

# Before Clone
* Create a hidden config file `.careerwise.yaml` at app root directory
* Add `MONKEY_LEARN_API_KEY` to `.careerwise.yaml`

# List of toolkits
* Apache Tomcat 9.0.35
    * This is a open-source Java Servlet Container developed by Apache Software Foundation
    * Remote Procedure Call (RPC): a function call to a remote server
    * Java Servlet: Java class to handle RPC on server side
    * Tomcat is a environment to run this web page, which is also one of the major Java Framework
    
* Postman [download](https://www.postman.com/downloads/)
* IntelliJ (Ultimate)
    * [Official guide](https://www.jetbrains.com/help/idea/configuring-and-managing-application-server-integration.html#76331)
    * Java Enterprise -> Set Tomcat as `Application Server`
* Git Hub Jobs API [Link](https://jobs.github.com/api)
* Cloud: [AWS](http://aws.amazon.com)
* MySQL [download](https://dev.mysql.com/downloads/workbench/)
* MonkeyLearn [link](https://app.monkeylearn.com/accounts/register/)

## Demos

