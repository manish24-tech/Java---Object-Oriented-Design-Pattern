# Java-Object-Oriented-Design-Pattern
This Repository contain short note on java object oriented design pattern along with sample diagram. it is for getting just idea of design pattern and push to leverage more to create good architecture of any project. For that there are mainly **_2 online book_** and **_1 gituhub repository_** as reference used to explain as per observation.


##### Note:
``` 
This content/short note is for begineer only while professional can refere links. Everyone have a different perception and implementation. so just try to explore the perception about java object oriented design pattern with help of references.
```

| `Reference Link:` | <https://sourcemaking.com/design_patterns/> | <https://refactoring.guru/design-patterns/> | <https://github.com/iluwatar/java-design-patterns> |
| ---------------- | ------------------------------------------- | ------------------------------------------- | -------------------------------------------------- |

## Table Of Content
1. Creational Design Pattern
2. Structural Design Pattern
3. Behavioral Design Pattern
***

## 1. Creational Design Pattern

creational design pattern is provide designs for class and object creation and provide collaboration between each other. It contain mainly 6 design pattern such as:
1. Factory Method
2. Abstract Factory
3. Singleton
4. Prototype
5. Builder


#### 1. Factory Method: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/factory-method-mini.png "Factory Method")  
* Provide an interface for individual object creation/initialization of different family
* Used to encapsulate object creation from client and wrap all object initialization into single unit(Factory) means let factory to decide which object should initialize as per given type and Client application is an aware about initialization and internal structure
* Provide re-usability for object construction like welcome new object after a while easily without touching business logic 
* At the end creating a factory that responsible to build core logic/abstraction layer for object construction to use as per need by factory 

#### 2. Abstract Factory Method: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/abstract-factory-mini.png "Abstract Factory")  
* Provide an interface for group of independent object creation/initialization of same family
* Used to encapsulate related objects creation and wrap platform(consist of related object) into single abstract unit(Abstract Factory) means let abstract factory to decide which platform's object should initialized as per family type and client application is an aware about initialization of platform and internal structure
* Provide re-usability for platform creation (consist of object construction) like welcome new object of particular platform after a while easily without touching business logic
* Abstract Factories Design Pattern Stores also:
1. Singleton Design Pattern
2. Prototype Design Pattern
* At the end creating an abstract factory that responsible to build core logic/abstraction layer for group of related object construction to use as per need by factory 
