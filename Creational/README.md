#### 1. Factory Method: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/factory-method-mini.png "Factory Method Creational Design Pattern")  
* Provide an interface for individual object creation/initialization of different family
* Used to encapsulate object creation from client and wrap all object initialization into single unit(Factory) means let factory to decide which object should initialize as per given type and Client application is an aware about initialization and internal structure
* Provide re-usability for object construction like welcome new object after a while easily without touching business logic 
* At the end creating a factory that responsible to build core logic/abstraction layer for object construction to use as per need by factory 

    | Factory Method Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/factory_method.png "Factory Method Diagram") |
***
#### 2. Abstract Factory Method: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/abstract-factory-mini.png "Abstract Creational Factory Design Pattern")  
* Provide an interface for group of independent object creation/initialization of same family
* Used to encapsulate related objects creation and wrap platform(consist of related object) into single abstract unit(Abstract Factory) means let abstract factory to decide which platform's object should initialized as per family type and client application is an aware about initialization of platform and internal structure
* Provide re-usability for platform creation (consist of object construction) like welcome new object of particular platform after a while easily without touching business logic
* Abstract Factories Design Pattern Stores `Singleton Design Pattern` and `Prototype Design Pattern`
* At the end creating an abstract factory that responsible to build core logic/abstraction layer for group of related object construction to use as per need by factory 

    | Abstract Factory Method Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/abstract_factory.png "Abstract Factory Method Diagram") |
***
#### 3. Singleton: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/singleton-mini.png "Sigleton Creational Design Pattern")  
* Provide a class that create a shared global instance for all other object whose try to operate the same like Database, File, Configuration..etc
* It create an instance only once in main memory(volatile) and then accessing from cache every time
* It's not a thread-safe because multiple thread may have different instance to break singleton purpose and its create an issue while accessing from cache. So, perform costly operation via volatile class instance to grant the same access for all the object in multi-threading environment(make thread-safe)
* Singleton design pattern for single object instance creation used in `Abstract factories`, `builder` and `prototype` design pattern also
* At the end Its easy but much costly so used when must provide visibility of variable by making volatile instance and private constructor to share global instance

    | Singleton Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/singleton.png "Singleton Diagram") |
***
#### 4. Prototype: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/prototype-mini.png "Prototype Creational Design Pattern")  
* Provide method to clone/copy existing object with data members and function to new object of same type
* It does not make code dependent means not need to re-initialize the existing object instance with new keyword and also not required sub-classes means not applicable for inheritance and providing global instance
* It's not a thread-safe because multiple thread may have different instance to break singleton purpose and its create an issue while accessing from cache. So, perform costly operation via volatile class instance to grant the same access for all the object in multi-threading environment(make thread-safe)
* It is better to maintain hash-code() and equal() contract at the time of cloning object because of using it in collections as generic<T> key or value<R> 
    1. initialization object stored in collection like Map<k,object>
    2. clone object from collection by key like Map.get(k)
    3. in java used copy constructor instead of Cloneable interface to avoid general type and get guarantee for proper type 
* Prototype design pattern for copying object instance used in Abstract factories design pattern also
* At the end Its cloning existing object for providing caching, memory efficiency and avoiding re-initialization

    | Prototype Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/prototype.png "Prototype Diagram") |
***
#### 5. Builder: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/builder-mini.png "Builder Creational Design Pattern")  
* Provide a aggregation of different types of object into master object to build/construct complex object step by step
* It is nothing more then setter-getter and allow collaboration between objects

    *`Object Builder:`* having * entity reference into 1 entity
    
    *`Object Director:`* constructing object which have repetitive/fixed task 
    
  ex. building product in factory by machine(Builder Design Pattern)

* It's not a thread-safe because multiple thread may have different instance to break singleton purpose and its create an issue while accessing from cache. So, perform costly operation via volatile class instance to grant the same access for all the object in multi-threading environment(make thread-safe)
* Provide re-usability and molecularity for object construction by director class 
* At the end it is most easy and preferable design pattern used in real time complex project to perform fixed object creation step by step and build master object
***
