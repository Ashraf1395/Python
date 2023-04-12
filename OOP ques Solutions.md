Q1. What is the purpose of Python's OOP?
OOP's are used to provide a way to organize and structure code by grouping related data and functions into objects and classes.

Q2. Where does an inheritance search look for an attribute?
In the current instance, then in the class, then in any superclasses, in order.

Q3. How do you distinguish between a class object and an instance object?
 A class object defines the attributes and methods shared by all instances of the class,
 
while an instance object is a specific occurrence of the class that has its own unique attributes and methods.

Q4. What makes the first argument in a class’s method function special?
 "self" is the first argument in class method function and it refers to the instance of the class that the method is called on.

Q5. What is the purpose of the init method?
It is used to initialize the attributes of a newly created instance of a class.

Q6. What is the process for creating a class instance?
The process for creating a class instance involves calling the class name as a function with any necessary arguments, which returns a new instance of the class.

Q7. What is the process for creating a class?
Using the "class" keyword, followed by the class name and any superclass names in parentheses, and then defining the class attributes and methods.

Q8. How would you define the superclasses of a class?
They are defined by including their names in parentheses after the class name, separated by commas.

Q9. What is the relationship between classes and modules?
Classes can be defined in modules, and modules can be imported to use the classes defined within them.

Q10. How do you make instances and classes?
Instances are made by calling the class name as a function with any necessary arguments, while classes are made by using the "class" keyword and defining the class attributes and methods.

Q11. Where and how should class attributes be created?
Attributes can be created anywhere within the class body and outside of any method definitions by simply assigning values to them.

Q12. Where and how are instance attributes created?
Instance attributes are created within the init method of a class, by assigning values to the "self" object using dot notation.

Q13. What does the term "self" in a Python class mean?
The term "self" in a Python class refers to the instance of the class that the method is being called on.

Q14. How does a Python class handle operator overloading?
A Python class can handle operator overloading by defining special methods with names that correspond to specific operators, such as "add" for "+".

Q15. When do you consider allowing operator overloading of your classes?
Operator overloading should be considered when it would make sense for instances of the class to be used with standard operators in a natural way.

Q16. What is the most popular form of operator overloading?
The most popular form of operator overloading is probably adding two instances of a class with the "+" operator.

Q17. What are the two most important concepts to grasp in order to comprehend Python OOP code?
The two most important concepts to grasp in order to comprehend Python OOP code are classes and objects.

Q18. Describe three applications for exception processing.
Error handling, program flow control, and resource management.

Q19. What happens if you don't do something extra to treat an exception?
The program will terminate abruptly and display an error message.

Q20. What are your options for recovering from an exception in your script?
Options for recovering from an exception in our script include using try/except blocks to catch and handle exceptions, raising a new exception, or logging the error and continuing execution.

Q21. Describe two methods for triggering exceptions in your script.
Two methods for triggering exceptions in our script include using the raise statement to manually raise an exception and invoking methods that are known to raise exceptions, such as attempting to open a non-existent file.

Q22. Identify two methods for specifying actions to be executed at termination time, regardless of whether or not an exception exists.
Two methods for specifying actions to be executed at termination time, regardless of whether or not an exception exists, include using the finally clause of a try/except block and registering a function with the atexit module.

Q23. What is the purpose of the try statement?
The purpose of the try statement is to handle exceptions that may be raised during the execution of a block of code.

Q24. What are the two most popular try statement variations?
 try/except block and the try/finally block.

Q25. What is the purpose of the raise statement?
To raise a new exception and specify its type and message.

Q26. What does the assert statement do, and what other statement is it like?The assert statement checks whether a condition is true, and raises an AssertionError with an optional message if it is false. It is similar to an if statement.

Q27. What is the purpose of the with/as argument, and what other statement is it like?
It is used to automatically set up and tear down resources, such as files or network connections. It is similar to a try/finally block.

Q28. What are *args, **kwargs?
*args and **kwargs are special syntax in Python that allow a function to accept a variable number of positional and keyword arguments, respectively.

Q29. How can I pass optional or keyword parameters from one function to another?
Optional or keyword parameters can be passed from one function to another by including them in the function call and then unpacking them using *args or **kwargs.

Q30. What are Lambda Functions?
Lambda functions are anonymous functions that can be defined and used inline in Python code.
Rhey are very usefull

Q31. Explain Inheritance in Python with an example?
Inheritance in Python allows a class to inherit attributes and methods from a parent class. For example, if class B inherits from class A, B can use A's methods and attributes as if they were its own.

Q32. Suppose class C inherits from classes A and B as class C(A,B).Classes A and B both have their own versions of method func(). If we call func() from an object of class C, which version gets invoked?

If class C inherits from classes A and B as class C(A,B) and both A and B have their own versions of method func(), the version of func() that gets invoked when called from an object of class C depends on the method resolution order (MRO) of the classes.

Q33. Which methods/functions do we use to determine the type of instance and inheritance?
The type() function is used to determine the type of an instance, and the isinstance() function is used to determine

Q34. Explain the use of the 'nonlocal' keyword in Python.
The 'nonlocal' keyword is used to indicate that a variable is not local to a function, but is instead in the scope of an enclosing function. This allows the variable to be accessed and modified from within the inner function.

Q35. What is the global keyword?
The global keyword is used to indicate that a variable is in the global scope, rather than the local scope of a function