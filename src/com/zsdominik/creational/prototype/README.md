### Summary
A prototype is a template of any object before the actual object is constructed. In java also, it holds the same meaning. Prototype design pattern is used in scenarios where application needs to create a number of instances of a class, which has almost same state or differs very little.
* **Prototype:** This is the prototype of actual object as discussed above.
* **Prototype registry:** This is used as registry service to have all prototypes accessible using simple string parameters.
* **Client:** Client will be responsible for using registry service to access prototype instances.
### Use this if
You want to create duplicate objects frequently while keeping performance in mind. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
### Benefits and Advantages of Builder Pattern
* Minimal instance creation process which is much costly than cloning process
### Costs and Disadvantages of Builder Pattern