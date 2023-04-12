## Assignment Part-1
Q1. Why do we call Python as a general purpose and high-level programming language?

Python is called a general-purpose and high-level programming language because it can be used for various applications and has an easy-to-read syntax

Q2. Why is Python called a dynamically typed language?

Python is called a dynamically typed language because variable types are determined at runtime rather than during compilation
Q3. List some pros and cons of Python programming language?

Pros: easy to read syntax
      large standard library
      cross-platform compatibility

Cons: slower execution speed than some other languages
      not ideal for mobile app development.

Q4. In what all domains can we use Python?

 Python can be used in various domains such as web development, data analysis, artificial intelligence, machine learning, scientific computing, and more.

Q5. What are variable and how can we declare them?

 Variables are containers that store data values. In Python, we can declare them by assigning a value to a variable name, e.g., x = 'Ashraf'

Q6. How can we take an input from the user in Python?

usnig input() function
x=input()

Q7. What is the default datatype of the value that has been taken as an input using input() function?

String is default datatype of value inside input() function

Q8. What is type casting?

Type casting is the process of converting a variable of one data type to another data type 
In Python, type casting can be done using built-in functions such as int(), float(), str(), etc

Q9. Can we take more than one input from the user using single input() function? If yes, how? If no, why?

Yes, we can user can write multiple inputs with any sepereators like 4,5,6 or 4 5 6 and we can use these seperators to split the input string and store all values in diff variables or in an array as required
x,y,z= int(input().split(','))

Q10. What are keywords?

Special keywords which convey some special meaning to the compiler
eg if,else,print etc

Q11. Can we use keywords as a variable? Support your answer with reason.

 No, we cannot use keywords as variable names in Python since they have predefined meanings and cannot be reassigned to another value.

Q12. What is indentation? What's the use of indentaion in Python?

Indentation is the spacing at the beginning of a line of code to indicate a block of code. In Python, it's used to indicate the beginning and end of control structures

Q13. How can we throw some output in Python?
 using print statements

Q14. What are operators in Python?

 Operators in Python are symbols that perform arithmetic, logical, or comparison operations on operands, such as +, -, *, /, %, ==, and, or, etc.

Q15. What is difference between / and // operators?
/ RETURNS QUOTIENT WITH REUTRN TYPE FLOAT
// RETURNS QUOTIENT WITH RETURN TYPE INT
3/2=1.5
3//2=1

Q16. Write a code that gives following as an output.
```
iNeuroniNeuroniNeuroniNeuron
```
print('iNeuron'*4)

Q17. Write a code to take a number as an input from the user and check if the number is odd or even.

num=int(input())
x='Even' if num%2=0 else 'Odd'
print(x)  

Q18. What are boolean operator?

 Boolean operators in Python are and, or, and not. They are used to perform logical operations on boolean values (True and False).

Q19. What will the output of the following?
```
1 or 0= 1

0 and 0 =0

True and False and True=False

1 or 0 or 0 = 1
```

Q20. What are conditional statements in Python?

 Conditional statements in Python are used to execute a block of code if a particular condition is true. The if, elif, and else keywords are used for this purpose

Q21. What is use of 'if', 'elif' and 'else' keywords?

if is used to check a single condition, elif is used to check multiple conditions, and else is used to execute code when no conditions are true


Q22. Write a code to take the age of person as an input and if age >= 18 display "I can vote". If age is < 18 display "I can't vote".
age=int(input())
out='I can vote' if age>=18 else 'I can't vote'
print(out)

Q23. Write a code that displays the sum of all the even numbers from the given list.
```
numbers = [12, 75, 150, 180, 145, 525, 50]
```
sum=0
for i in numbers:
  if i%2==0:
    sum+=i
print(sum)    
  
Q24. Write a code to take 3 numbers as an input from the user and display the greatest no as output.
#4 6 7 as input
x,y,z=int(input().split(' '))
if x>y:
   if x>z:
     print(x)
   else:
     print(z)
else:
   if y>z:
     print(y)
   else:
     print(z)         

Q25. Write a program to display only those numbers from a list that satisfy the following conditions

- The number must be divisible by five

- If the number is greater than 150, then skip it and move to the next number

- If the number is greater than 500, then stop the loop
```
numbers = [12, 75, 150, 180, 145, 525, 50]
```
for i in numbers:
  if i%5==0:
    if i>150:
      continue
    elif i>500:
      break
    else:
      print(i)  
