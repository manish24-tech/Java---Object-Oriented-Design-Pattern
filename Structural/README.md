#### 1. Adapter: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/adapter-mini.png "Adapter Structural Design Pattern")  
* Provide a class for collaboration between different object which implements different interfaces - means collaboration between incompatible interfaces and its implementation classes
* Mainly used to converts interface of one object to another interface of object by creating Adapter class that act as middle layer
* ex. 1st time window system has been assigned to employee. after sometime in another project linux system is required. so, linux system can also assigned to employee.
Thus, Employees assignment object can collaborate with equipment object 
* Adapter is responsible for wrap incompatible interfaces into single unit class:
  1. implement one interface and initialize another interface in constructor for collaboration 
  2. override unimplemented method of one interface and define the implementation of another interface 
  
* At the end Adapter is middle layer class that wrap incompatible objects of an interfaces and implementation in single unit with missing feature for providing collaboration/compensation of different object

    | Adapter Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/adapter.png "Adapter Diagram") |
***
