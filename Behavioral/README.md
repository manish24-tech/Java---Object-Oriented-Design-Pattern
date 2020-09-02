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
#### 1. Command: 
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
