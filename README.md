# JAVA_ASSIGNMENT
C1230728_ABDULLAHI IBRAHIM MOHAMED 


Assignment ` questions

1. Superclass and Subclasses: The superclass is the parent class, and subclasses are the child classes that inherit its properties and methods. The specific class names depend on the given code.

2. How inheritance reduces code duplication: Inheritance allows subclasses to reuse fields and methods from the superclass instead of writing the same code again.

3. Method that demonstrates polymorphism: It is the method that is overridden in a subclass to provide a different implementation of a method inherited from the superclass.

4. Why @Override is used: It tells the compiler that a method is intended to override a superclass method. It helps detect errors if the method does not correctly override an existing method.




assihnment 2 questions 

1. Why is MedicalService declared abstract?
MedicalService is declared abstract because it serves as a base class for different medical services and may contain abstract methods that subclasses must implement.

2. Can an object be created directly from MedicalService? Explain.
No. An object cannot be created directly from an abstract class using new MedicalService(). Instead, objects must be created from its concrete subclasses.

3. What is the difference between an abstract method and a concrete method?

Abstract method: Has no implementation (method body) and must be implemented by a concrete subclass.

Concrete method: Has a method body and provides actual functionality that can be used or inherited by subclasses.

4. Why must each concrete subclass implement calculateTotalCost()?
Each concrete subclass must implement calculateTotalCost() because different medical services may have different costs. This ensures that every service calculates its total cost according to its specific requirements.


