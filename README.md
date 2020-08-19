
#Forum - E-Commerce Website


#Provide a description of the application use case scenario that you have selected for your final
project.
This application is a limited selection e-commerce website stocking a variety of essential products i.e Household, Grocery and Apparel. It employs the Builder Pattern which allows us to build a complex object step by step. Through which the selected product is generated with product details, added to a cart, could be removed from the cart and cart is checked out. 

#Use Case Scenario
A customer needs to pick up some essentials where she logs on to this e-commerce website. The customer would be the primary actor using this system. The system contains an inventory of products: Grocery, Household and Apparel, 
a shopping cart and quantity selection. The goal is it to easily browse the product list, add it to the shopping cart, remove it and checkout their cart when they are ready.  


#Describe what are your main software design concepts regarding this application.
Using the Builder Design Pattern for this project helped craft the functionality of this e-commerce website. The Director class containing the Construct() refers to the Builder interface to initiate building the parts of a complex object. This interface is then implemented by ProductBuilder (ConcreteBuilder) which generates an abstract Product class that is extended by the ConcreteProduct classes (Household, Grocery and Apparel) which return the User selected product i.e Windex from Household, Handbag from Apparel. 

#What are the design goals in your project?
The design goal was to encapsulate code for construction and representation 
as needed to accomodate a variety of products without having to hard-code and avoid duplicate code. It allows for more control over constructing more complex objects. This pattern entails referencing and delegating responsibility
down to the generation of a specific Product. 

#How is the flexibility, of your implementation, e.g., how you add or remove in future new types?
It is a flexible system as it allows us to vary internal representation yet going forward in the future a separate ConcreteBuilder  would be necessary if new type of products have to be added/

#How is the simplicity and understandability of your implementation?
It's a simple implementation where the ProductBuilder class implements the Builder interface to generate a Product object with common attributes for all products which is then extended by class of the user selected product e.g. Household. 

#How you avoided duplicated code? 
Use of this design pattern allowed encapsulation of code for construction of the final product which helped us avoid repetition of the same code. 

Github Repo Link: https://github.com/alina-akram/metcs-met-cs665-assignment-project-alina-akram


# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project. 

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies. 

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Main
```


# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see 

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see 
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin 

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

You can find more info about coveralls 

https://coveralls.io/

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```


