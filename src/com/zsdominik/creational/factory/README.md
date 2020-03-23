### Summary
Factory pattern introduces **loose coupling between classes** which is the most important principle one should consider and apply while designing the application architecture. Loose coupling can be introduced in application architecture by programming against abstract entities rather than concrete implementations. This not only makes our architecture more flexible but also less fragile.
### Use this if
**Some complex object creation steps are involved.** To ensure that these steps are centralized and not exposed to composing classes, factory pattern should be used.  
### Benefits and Advantages of Builder Pattern
* The creation of an object precludes its reuse without significant duplication of code.
* The creation of an object requires access to information or resources that should not be contained within the composing class.
* The lifetime management of the generated objects must be centralized to ensure a consistent behavior within the application.
### Costs and Disadvantages of Builder Pattern