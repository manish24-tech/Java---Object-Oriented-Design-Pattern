#### 1. Adapter: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/adapter-mini.png "Adapter Structural Design Pattern")  
* Provide a class for collaboration between different object which implements different interfaces - means collaboration between incompatible interfaces and its implementation classes
* Mainly used to converts interface of one object to another interface of object by creating Adapter class that act as middle layer
* ex. 1st time window system has been assigned to employee. after sometime in another project linux system is required. so, linux system can also assigned to employee.
Thus, Employees assignment object can collaborate with equipment object 
* Adapter is responsible for wrap incompatible interfaces into single unit class:
  1. implement one interface and initialize another interface in constructor for collaboration 
  2. override unimplemented method of one interface and define the implementation of another interface 
  
* At the end Adapter is middle layer class that wrap incompatible objects of an interfaces and implementation in single unit with missing feature for providing collaboration/composition of different object

    | Adapter Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/adapters.png "Adapter Diagram") | 
***
#### 2. Bridge: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/bridge-mini.png "Bridge Structural Design Pattern")  
* Provide a hierarchy of two different (abstraction and implementation) classes implementation which can be developed independently for each other
  
  *`Abstraction:`*  an appearance of the core logic as a handle and delegate implementation 
  
  *`Implementation:`* an app logic as a  body that decoupled abstraction
  
* It required new sub-classes to be developed at run-time binding or switch to new implementation from old one like inheritance mechanism
* Adapter vs Bridge
    1. Adapter is provide object composition between incompatible interfaces and classes with help of adapter class while bridge provide composition between independent implementation in form of hierarchy with decouple abstraction from implementation as bridge
    2. Both use constructor injection for composition 

* At the end bridge is divide and organize classes in form of hierarchy with different implementation. ex. cross-platform domain
 
    | Bridge Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/bridge.png "Bridge Diagram") | 
***
#### 3. Composite: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/composite-mini.png "Composite Design Pattern")  
* Compose the group of objects of same type(component) to create hierarchy
*  *`Component(I):`* common interface with transnational method which are common in both Leaf(C) and Composite(C) element
*  *`Leaf Element(C):`* it is root element that implement component which create summation of composite elements. it does not have sub elements  
*  *`Composite Element(C):`* group of classes that implement component(C) which add different leaf elements category and display consolidate result of sub elements also
* ex. one organization categorize with different region and region categorize with  different sub branches. Component =  organization, Leaf Element = OrganizationLeaf and composite Elements = [India , USA ... etc]
* At the end composite is to compose group of object of same type single hierarchically with basic and composite element


    | Composte Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/composite.png "Composite Diagram") | 
***
#### 4. Decorator: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/decorator-mini.png "Decorator Design Pattern")  
* Decorator is same as aggregation or composition in which we can generalize one entity  reference into another entity
* Purpose of decorator is used to create a wrapper of core module which having common interface for customization
* Ex. Organization running with web and Mobile Application development. after sometime it also want to run with CMS framework. so, in this case core module will be same of Technologies stack but it will create a wrapper for CMS technology stack and implement customize core module functionality
* Wrapper class implements common interface and also generalize decorator type of same interface for customize implementation 
* At the end decorator is used to attach additional behavior of an object at run time by creating  wrapper implementation of common interface type


    | Decorator Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/decorator.png "Decorator Diagram") | 
***
