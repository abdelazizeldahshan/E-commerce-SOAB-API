# E-commerce-SOAB-API

E-commerce Api with 6 resources documented By [postman](https://www.postman.com/")
--------------
* [Admin](https://documenter.getpostman.com/view/20705929/UyxdL9gc)
* [Customer](https://documenter.getpostman.com/view/20705929/UyxdL9cK)
* [Clerk](https://documenter.getpostman.com/view/20705929/UyxdL9cL)
* [Product](https://documenter.getpostman.com/view/20705929/UyxdL9cG)
* [Order](https://documenter.getpostman.com/view/20705929/UyxdL9cJ)
* [Categories](https://documenter.getpostman.com/view/20705929/UyxdL9gb)

----------------------------------------------------------------------------
Development Tools
------------------
* `JAX-WS` Specification and `Metro` implementation .
* `JPA` Specification and `Hibernate` implementation for Database . 
* `MySql` Database
* `Maven` for Project Configration `Pom.xml`.
* `Tomcat` WebServer.
-----------------------------------------------
Run With Maven
----------------
You can Deploy `Api` to `tomcat` With `tomcat7-maven-plugin` ```mvn clean package tomcat7:deploy```

     ``` <plugin>
          <groupId>org.apache.tomcat.maven</groupId>
          <artifactId>tomcat7-maven-plugin</artifactId>
          <version>2.2</version>
          <configuration>
            <username>admin</username>
            <password>admin</password>
            <url>http://localhost:9595/manager/text</url>
            <path>/SOAB-E-Commerce-API</path>
          </configuration>
        </plugin>```
