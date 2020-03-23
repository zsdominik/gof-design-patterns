### Summary
Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.”
### Use this if
The construction of the object takes too much parameters, the object is too complex.
### Benefits and Advantages of Builder Pattern
Undoubtedly, the **number of lines of code increase** at least to double in builder pattern, but the effort pays off in terms of **design flexibility** and much more **readable code**. The parameters to the constructor are reduced and are provided in **highly readable method calls.**

Builder pattern also helps minimizing the number of parameters in constructor and thus there is no need to pass in null for optional parameters to the constructor. It’s really attracts me.

Another advantage is that Object is always instantiated in a complete state rather than sitting in an incomplete state until the developer calls (if ever calls) the appropriate “setter” method to set additional fields.

And I finally I can build **immutable objects** without much complex logic in object building process.

### Costs and Disadvantages of Builder Pattern
Though Builder pattern reduce some line of code buy eliminating the need of setter methods, still in **double up total lines** by introducing the Builder object. Furthermore, although client code is more readable, the client code is also more verbose. Though for me, readability weighs more than lines of code.