#### 1. Chain Of Responsibility: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/chain-of-responsibility-mini.png "Chain of responsibility Behavioral Design Pattern")  
* Chain of responsibility let allow user-request to be process sequentially with group of objects of same type till destination
* Group of objects is nothing but handler object that decide whether to process(handle) the request or pass to the next chain of object sequentially 
* Ex. in organization, recruitment process for freshers and experience will be different. fresher has less level of interview then experienced and that will be decide based on number of experience like 0 or 2+
* At the end chain of responsibility should be prefer only when sequential process to be follow with series of handler check object to be measure the client request

    | Chain Of Responsibility Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/chain_of_responsibility.png "Chain Diagram") | 
***
#### 2. Command: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/command-mini.png "Command Behavioral Design Pattern")  
* Command is a middle layer to flow the client request from sender to receiver with carrying data with/without parameter like "principle of separation of concerns":
   *`1. Client is requesting from GUI - click button`*
   *`2. Application layer delegate the request and give command for action`*
   *`3. Command object is carry the data and send to service layer`*
   *`4. Service layer perform business logic and send to receiver`*
* Command encapsulate duplicate request in single unit and delegate the same operation from various GUI places. So, it is just an interface with various parameterized method that implement by service layers. application layer have reference of this command object  to serve the request 
* Ex. in organization, an project can be added from various GUI screen with button that open same employee form to delegate add request with data to be serve by command object 
* At the end command object is middle layer between application and service layer to serve the client request like Model-View-Controller architecture

    | Command Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/command.png "Command Diagram") | 
***
#### 3. Iterator: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/iterator-mini.png "Iterator Behavioral Design Pattern")  
* Iterator provide standard way to access element from group of object sequentially with making business logic  representation protected from the client
* In java, Collection framework is the example of iterator design pattern and allowing user to use various types of abstract data type(ArrayList, DeQueue, Hashset..etc) to traverse the element with advance feature(add,remove,equal..etc)
* Purpose of iterator design pattern is to traverse an elements of group of object using various data structure like Stack, Queue, LinkedList, ArrayList, Map...etc
* Basic implementation [defined in java itself with advance feature with so many abstraction level but we will simplify it]:
*   *`=> create an generic interface Iterator<E> with hashNext() and next() method definition`*
*   *`=> create generic interface Collection<E> that have reference of the type of Iterator<E> interface that responsible to create/initialize generic type of iterator in its implementation class`*
*   *`=> create generic container class<E>  implement Collection<E> for Itr initialization and also create nested private Itr class implements Iterator<E> with hasNext() and next() representation`*
*   *`=> in client application we can get the list of the type of iterator and traverse an element based on hasNext() and next() bonding`*
* At the end iterator is used to traversing element from group of object with protecting internal representation from client and create ADT(abstract data type) with various data structure to manage the collections 

    | Iterator Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/iterator.png "Iterator Diagram") | 
***
#### 4. Mediator: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/mediator-mini.png "Mediator Behavioral Design Pattern")  
* Mediator is allow objects to be communicate with each other without direct access for making code loosely coupled and restrict tight dependency of each other
* Objects interaction done via mediator object only. So, that each object is an-aware about sender-receiver and provide re-usability 
* Ex. In organization, 1. employees can not represent their financial concern directly to CA but its manage via HR as mediator || 2. employee can not sent resign/issue mail to CEO but its interaction done with HR as mediator
* At the end mediator preferred only when complex objects interaction is required to be manage independently 

    | Mediator Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/mediator.png "Mediator Diagram") | 
***
#### 5. Memento: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/memento-mini.png "Memento Behavioral Design Pattern")  
* Memento create a copy of original object state in special object to promote redo/undo operation for getting previous state of an object
* It will hold the state of original object without violating encapsulation or implementation of an original object
* The Memento design pattern defines three distinct roles:
*   *`Originator => `* original object that write its state for saving & restoring into memento
*   *`Memento => `* handler class that contain original object's field only without implementation and helper method to get those field as state
*   *`Caretaker => `* container class that store list of memento and restore previously stored memento from original object
* Ex. organization have leaves calendar. sometimes it might contain date mismatch while data entry. So, it can restored to previous state of entry in calendar using memento
* At the end memento is used to hold the previous state of an object from actual object without violating implementation for performing redo operation

    | Memento Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/memento.png "Memento Diagram") | 
***
#### 6. Observer: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/observer-mini.png "Observer Behavioral Design Pattern")  
* Observer provide collaboration and dependency of objects as publisher and subscriber to notify each other about any state change or event
* Publisher is responsible to notify the subscriber while subscriber is responsible to get update from publisher regarding any new event
* It create one to many or many to one relationship between publisher and subscriber via subject -  nothing but channel as mediator between both
* Ex. in YouTube, there are channels running by owner/publisher whose used to publish the content and the subscribers whose subscribed the channel will get notification regarding content from publisher
* At the end observer is pub-sub model where subscriber are observing any new event or state change from publisher to get update and this way they can track the event/objects

    | Observer Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/observer.png "Observer Diagram") | 
***
#### 7. State: 
![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_img/state-mini.png "State Behavioral Design Pattern")  
* State allows object to change its behavior when its internal state is getting changed. internal state is nothing but the different objects as function/event/behavior of actual object
* Context object is a root object that contain helper method to change the state of its concrete objects. these concrete object belongs to the same type of an interface  which referenced in context object to alter behavior 
* Ex. organization website contain different information which changing information based on different click event OR any helpline app which contain 1 to 5 number and each number gives different department information
* At the end state is nothing more then an object with relevant properties/behavior of the actual context object to alter the its state runtime like polymorphic mechanism

    | State Design Pattern Diagram | 
    | ---------------------- |
    | ![alt text](https://github.com/manish24-tech/Java-Object-Oriented-Design-Pattern/blob/master/DP_Diagram/state.png "State Diagram") | 
***
