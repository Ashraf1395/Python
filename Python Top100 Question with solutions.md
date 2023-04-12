
## Assignment Part-1
Q1. Why do we call Python as a general purpose and high-level programming language?

Q2. Why is Python called a dynamically typed language?

Q3. List some pros and cons of Python programming language?

Q4. In what all domains can we use Python?

Q5. What are variable and how can we declare them?

Q6. How can we take an input from the user in Python?

Q7. What is the default datatype of the value that has been taken as an input using input() function?

Q8. What is type casting?

Q9. Can we take more than one input from the user using single input() function? If yes, how? If no, why?

Q10. What are keywords?

Q11. Can we use keywords as a variable? Support your answer with reason.

Q12. What is indentation? What's the use of indentaion in Python?

Q13. How can we throw some output in Python?

Q14. What are operators in Python?

Q15. What is difference between / and // operators?

Q16. Write a code that gives following as an output.
```
iNeuroniNeuroniNeuroniNeuron
```

Q17. Write a code to take a number as an input from the user and check if the number is odd or even.

Q18. What are boolean operator?

Q19. What will the output of the following?
```
1 or 0

0 and 0

True and False and True

1 or 0 or 0
```

Q20. What are conditional statements in Python?

Q21. What is use of 'if', 'elif' and 'else' keywords?

Q22. Write a code to take the age of person as an input and if age >= 18 display "I can vote". If age is < 18 display "I can't vote".

Q23. Write a code that displays the sum of all the even numbers from the given list.
```
numbers = [12, 75, 150, 180, 145, 525, 50]
```


Q24. Write a code to take 3 numbers as an input from the user and display the greatest no as output.

Q25. Write a program to display only those numbers from a list that satisfy the following conditions

- The number must be divisible by five

- If the number is greater than 150, then skip it and move to the next number

- If the number is greater than 500, then stop the loop
```
numbers = [12, 75, 150, 180, 145, 525, 50]
```
**All Question till 25 were done in previous assignment**

Q26. What is a string? How can we declare string in Python?
A string is a sequence of characters in Python. We can declare a string in Python using single quotes, double quotes, or triple quotes.

Q27. How can we access the string using its index?

s='Ashraf'
print(s[1]) # s
print(s[1:4]) # shr

Q28. Write a code to get the desired output of the following
```
string = "Big Data iNeuron"
desired_output = "iNeuron"
```
desired_output=string[9:]
print(desired_output)

Q29. Write a code to get the desired output of the following
```
string = "Big Data iNeuron"
desired_output = "norueNi"
```
desired_output=string[9:]
x=''
for i in range(len(desired_output)-1,0,-1):
  x=x+string[i]
print(x)  # norueNi  


Q30. Resverse the string given in the above question.
string = "Big Data iNeuron"
x=''
for i in range(len(string)-1,0,-1):
  x=x+string[i]
print(x)  # norueNi ataD giB  

Q31. How can you delete entire string at once?
my_string = "hello"
my_string = ""


Q32. What is escape sequence?
An escape sequence is a combination of characters in a string that represent a special character or symbol that cannot be easily typed

Q33. How can you print the below string?
```
'iNeuron's Big Data Course'
```
print('iNeuron\'s Big Data Course')
or
print("iNeuron's Big Data Course ")
Q34. What is a list in Python?
A list in Python is a collection of items that are ordered and mutable.
It can contain elements of different data types and is defined using square brackets []

Q35. How can you create a list in Python?

Simply by declaring values in list 
x=[1,2,3,4]
or 
list comprehension
x= [i range(10)]
Q36. How can we access the elements in a list?

Similar as we access elements in a String with the help of their index
x=[1,2,3,4]
if we want to acces 3   x[2] where 2 is the inde of value 3

Q37. Write a code to access the word "iNeuron" from the given list.
```
lst = [1,2,3,"Hi",[45,54, "iNeuron"], "Big Data"]
``` 
lst[4][2]
Q38. Take a list as an input from the user and find the length of the list.
x=list(input().split(' '))
print(len(x))
Q39. Add the word "Big" in the 3rd index of the given list.
```
lst = ["Welcome", "to", "Data", "course"]
```
temp=lst[3]
lst[3]="Big"
lst.append(temp)

Q40. What is a tuple? How is it different from list?
tuple are immutable 
list are mutable

Q41. How can you create a tuple in Python?

x=(1,2,3)

Q42. Create a tuple and try to add your name in the tuple. Are you able to do it? Support your answer with reason.

we wont be able to because tumples are Immutable  one declared they can't be changed
x=(1,2,3)
x.append('Ashraf")

Q43. Can two tuple be appended. If yes, write a code for it. If not, why?

No, tuples are immutable and cannot be modified.

Q44. Take a tuple as an input and print the count of elements in it.

tup = (1, 2, 3, 4, 5)
print(len(tup)) # Output: 5


Q45. What are sets in Python? and Q46. How can you create a set?

A set can be created by enclosing a sequence of elements in curly braces {} or using the built-in set() function.

Q47. Create a set and add "iNeuron" in your set.

my_set = set()
my_set.add("iNeuron")
print(my_set) # Output: {"iNeuron"}

Q48. Try to add multiple values using add() function.
my_set = set()
my_set.add("iNeuron")
my_set.add("Python")
my_set.add("Data Science")
print(my_set) # Output: {"iNeuron", "Python", "Data Science"}

Q49. How is update() different from add()?

The add() method adds a single element to a set, while the update() method adds multiple elements, such as a list or another set, to the existing set

Q50. What is clear() in sets?

The clear() method removes all elements from a set.

Q51. What is frozen set?

A frozen set is an immutable set, which means its elements cannot be changed once it is created.

Q52. How is frozen set different from set?

A frozen set is immutable, while a set is mutable. The elements of a frozen set cannot be changed after it is created,
while the elements of a set can be added, removed or updated.

Q53. What is union() in sets? Explain via code.

The union() method returns a new set that contains all the elements from the original set(s) and the set(s) passed as an argument.

set1 = {1, 2, 3}
set2 = {3, 4, 5}
set3 = set1.union(set2)
print(set3) # Output: {1, 2, 3, 4, 5}

Q54. What is intersection() in sets? Explain via code.

The intersection() method returns a new set that contains the common elements between two or more sets.
set1 = {1, 2, 3}
set2 = {3, 4, 5}
set3 = set1.intersection(set2)
print(set3) # Output: {3}

Q55. What is dictionary ibn Python?

A dictionary is an unordered collection of key-value pairs, where each key is unique and mapped to a corresponding value.

Q56. How is dictionary different from all other data structures.

A dictionary is the only data structure in Python that uses key-value pairs to store and retrieve data, rather than indexing or sequencing.

Q57. How can we delare a dictionary in Python?

A dictionary can be declared by enclosing key-value pairs in curly braces {}, separated by colons.
my_dict = {"a": "ashraf", "p": "pagal"}

Q58. What will the output of the following?
```
var = {}
print(type(var))
```
#ouput  <class 'dict'>

Q59. How can we add an element in a dictionary?
To add an element in a dictionary, we can simply use the indexing operator to assign a value to a key. For example, my_dict[key] = value

Q60. Create a dictionary and access all the values in that dictionary.
my_dict = {"key1": "value1", "key2": "value2", "key3": "value3"}
for value in my_dict.values():
    print(value)

Q61. Create a nested dictionary and access all the element in the inner dictionary.
my_dict = {"outer_key1": {"inner_key1": "value1", "inner_key2": "value2"}, "outer_key2": {"inner_key3": "value3"}}
for inner_dict in my_dict.values():
    for value in inner_dict.values():
        print(value)

Q62. What is the use of get() function?
 The get() function is used to retrieve the value of a specified key in a dictionary. If the key is not present in the dictionary, it returns a default value instead of throwing an error.

Q63. What is the use of items() function?
The items() function returns a list of key-value pairs in a dictionary, as tuples.

Q64. What is the use of pop() function?
The pop() function removes the element with the specified key from a dictionary and returns its value.

Q65. What is the use of popitems() function?
The popitems() function removes and returns an arbitrary (key, value) pair from a dictionary.

Q66. What is the use of keys() function?
The keys() function returns a list of all the keys in a dictionary.

Q67. What is the use of values() function?
The values() function returns a list of all the values in a dictionary.

Q68. What are loops in Python?
 they are used to repeatedly execute a block of code.

Q69. How many type of loop are there in Python?
Two type of loop in python For and while
Q70. What is the difference between for and while loops?
The main difference between for and while loops is that for loops are used to iterate over a sequence of values, while while loops are used to repeatedly execute a block of code while a condition is true.

Q71. What is the use of continue statement?
The continue statement is used in loops to skip the current iteration and move on to the next iteration.

Q72. What is the use of break statement?
 The break statement is used in loops to immediately exit the loop, regardless of the loop's conditional statement.

Q73. What is the use of pass statement?
The pass statement is used as a placeholder for code that is not yet implemented, to prevent syntax errors.

Q74. What is the use of range() function?
The range() function is used to generate a sequence of numbers mostly used in loops.

Q75. How can you loop over a dictionary?
 We can loop over a dictionary by using a for loop and iterating over the dictionary's keys, values, or items. For example:
for key, value in my_dict.items():
    print(key, value)


### Coding problems
Q76. Write a Python program to find the factorial of a given number.

def fact(n):
  if (n==0 or n==1):
    return 1
  return n* fact(n-1)
fact(5)

Q77. Write a Python program to calculate the simple interest. Formula to calculate simple interest is SI = (P*R*T)/100

p,r,t=int(input('Write values of Principal,Rate and Time with ' ' seperated values respectively.' ).split(' '))  # 5000 5 2
si=(p*r*t)/100
print(si)  #500 

Q78. Write a Python program to calculate the compound interest. Formula of compound interest is A = P(1+ R/100)^t.

p,r,t=int(input('Write values of Principal,Rate and Time with ' ' seperated values respectively.' ).split(' '))  # 5000 5 2
a=p*((1+(r/100))**t)
print(a)

Q79. Write a Python program to check if a number is prime or not.

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, (n//2) + 1):
        if n % i == 0:
            return False
    return True

Q80. Write a Python program to check Armstrong Number.

def is_armstrong(n):
    total = 0
    temp = n
    while temp > 0:
        digit = temp % 10
        total += digit ** 3
        temp //= 10
    return n == total

Q81. Write a Python program to find the n-th Fibonacci Number.
#recursive
def fibonacci(n):
    if n <= 1:
        return n
    else:
        return fibonacci(n-1) + fibonacci(n-2)

Q82. Write a Python program to interchange the first and last element in a list.

def swap_first_last(lst):
    if len(lst) < 2:
        return lst
    else:
        lst[0], lst[-1] = lst[-1], lst[0]
        return lst

Q83. Write a Python program to swap two elements in a list.

def swap_elements(lst, i, j):
     temp=lst[i]
     lst[i]=lst[j]
     lst[j]=temp
    return lst

Q84. Write a Python program to find N largest element from a list.

def find_largest(lst, n):
    lst.sort(reverse=True)
    return lst[:n]
or
def find_largest(lst, n):
    lst.sort()
    return lst[:-n]

Q85. Write a Python program to find cumulative sum of a list.

def cumulative_sum(lst):
    result = []
    total = 0
    for i in lst:
        total += i
        result.append(total)
    return result

Q86. Write a Python program to check if a string is palindrome or not.

def palindrome(string):
    return string == string[::-1]

Q87. Write a Python program to remove i'th element from a string.

s='ashraf'
output=s[1:]
Q88. Write a Python program to check if a substring is present in a given string.

x='shr'
s=input()
for i in s:
  if x in s:
    print(f'{x} Present in {s}')
  else:
    print(f'{x} not present in {s}')  
Q89. Write a Python program to find words which are greater than given length k.

def find_long_words(string, k):
    words = string.split()
    result = []
    for word in words:
        if len(word) > k:
            result.append(word)
    return result


Q90. Write a Python program to extract unquire dictionary values.

def unique_values(dict1):
    result = []
    for value in dict1.values():
        if value not in result:
            result.append(value)
    return result

Q91. Write a Python program to merge two dictionary.

def merge_dicts(dict1, dict2):
    result = dict1.copy()
    result.update(dict2)
    return result

Q92. Write a Python program to convert a list of tuples into dictionary.
```
Input : lst=[('Sachin', 10), ('MSD', 7), ('Kohli', 18), ('Rohit', 45)]
Output : {'Sachin': 10, 'MSD': 7, 'Kohli': 18, 'Rohit': 45}
```

def convert_to_dict(lst):
    result = {}
    for key, value in lst:
        result[key] = value
    return result
print(covert_to_dict(lst))

Q93. Write a Python program to create a list of tuples from given list having number and its cube in each tuple.
```
Input: lis = [9, 5, 6]
Output: [(9, 729), (5, 125), (6, 216)]
```
output=[]
for i in lis:
  output.append((i,i*i*i))
print(output)  
   
   
Q94. Write a Python program to get all combinations of 2 tuples.
```
Input : test_tuple1 = (7, 2), test_tuple2 = (7, 8)
Output : [(7, 7), (7, 8), (2, 7), (2, 8), (7, 7), (7, 2), (8, 7), (8, 2)]
```
def tuple_combinations(tuple1, tuple2):
    result = []
    for i in tuple1:
        for j in tuple2:
            result.append((i, j))
    for i in tuple2:
        for j in tuple1:
            result.append((i, j))
    return result

Q95. Write a Python program to sort a list of tuples by second item.
```
Input : [('for', 24), ('Geeks', 8), ('Geeks', 30)] 
Output : [('Geeks', 8), ('for', 24), ('Geeks', 30)]
```

def sort_tuples_by_second(lst):
    return sorted(lst, key=lambda x: x[1])

Q96. Write a python program to print below pattern.
```
* 
* * 
* * * 
* * * * 
* * * * * 
```

for i in range(5):
  for j in range(5):
     print('*',end='')
  print()   
Q97. Write a python program to print below pattern.
```
    *
   **
  ***
 ****
*****
```
n = 5
for i in range(1, n+1):
    print(" "*(n-i) + "*"*i)


Q98. Write a python program to print below pattern.
```
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
```

n = 5
for i in range(1, n+1):
    print(" "*(n-i), end="")
    for j in range(i):
        print("* ", end="")
    print()

Q99. Write a python program to print below pattern.
```
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
```
for i in range(5):
  for j in range(1,6):
    print(j,end='')
  print()  
Q100. Write a python program to print below pattern.
```
A 
B B 
C C C 
D D D D 
E E E E E 
```
n = 5
for i in range(1, n+1):
    print((chr(64+i)+' ')*i)

