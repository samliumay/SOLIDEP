# SOLIDEP - SOLID Explanation Project
## Introduction
* I am newly graduated computer Engineer. I was working on SOLID princibles. One day. I decided to create lessons and study materials. This is my SOLID princibles lesson. I want to teach you the SOLID princlbes with projects and codes. But still in my superpeer, you will able to found the detailed lessons about SOLID princibles. 

* Hopefully these projects and if you buy the lessons will asist you while you are learning the SOLID princibles. 

## Single Responsibility Principle
* "Every Software component should have one and only one responsibility." 
* At the explanation above, you can see 'component' part. this part is critical for us. It can mean class,method or a module at this context.
* Basically you can not write a component like a swiss army knife. In the software world, the part that you use to cut the apple have higher chance to cut your hand than an apple. 
* "Always aim for higher cohesion. Helps attain better adherence to the single responsibility princible." So we are basically trying to lower coupling. Increasing the independency betwen the components and increasing the durability.
* "Ecery software component should have one and only one reason to change."

Robert_C Martin - Founder of SOLID
![Robert_C _Martin_surrounded_by_computers](https://github.com/user-attachments/assets/12dd5011-0ec6-47b8-ab38-946635971cb0)

### Example - Single Responsibility Principle
* Look to the example we give. We have Square class. At the violation example, we are doing the drawing rotation and area calculation directly inside the square class. But for drawing and rotating, we can use a different class. They are independent different operations than sqaure itself. So thats why we created a shapeUI class.

## Open Closed Princible 
* "Sofware component should be closed for modification, but open for extension."
* Think about wii. You can use different type of accesories to increase your gaming experience. But you can not change the wii itself to do some changes.
* "Close for modification" -> New features getting added to the sofware component should not have odify existing code.
* "Open for Extention" -> A software component should be extendable to add a new feature or to add a new behaviour to it.

### Example - Open Closed Princible 
* Take a look to our example.  We are creating an insurance calculation system. At the begining we just have health insurance. But at the feature we decided to add vechile insurance either.
* As you see we needed to change the insureanceCalculationClass to add new feature. So we violated open-close princible. 
* At our solution, by using the polymorphism trait of OOP, we created a customer profile interface and created two different classes inherits this interface. So with this strategy, we were able to apply open closed princible. 

Bertrand Meyer - Founder Of Open Closed Princible
![Bertrand_Meyer_recent](https://github.com/user-attachments/assets/f8a61095-f9dc-4579-a1dd-1420fcd03f90)

## Liskov Substitution Princible
* "Object should be replaceable with their subtypes without affecting the correctness of the program. "
* We can try to think in a 'IS-A' way:
  * Hatchback IS A car
  * Ostrich IS A bird
  * Gasoline IS A Fuel
* There is a problem. an Ostrich can not fly. So when you create a bird class, it will probably have a fly method, but Ostrich will not able to use it. So you basically affected the correctness of the subtype.
* So we need to change the 'IS-A' way of thinking.
* "If it looks like a duck and quacks lie a duck but it needs baterries, you probably have the wrong abstraction!"
* "Object should be replacable woth their subtypes without affecting the correctness of the program."

### Example - Liskov Substitution Princible
* We have a car class with cabin width. But racing cars do not hhave cabin but cockpit. So we do not use the cabinWidth but cockputWidth.
* As a solution, ew can create a class called Vehicle. And this will get the interior width. You can extend this class to normal car and racing car. So we are able to solve the problem. 


Barbara_Liskov - Founder Of Liskov Substitution Princible
![Barbara_Liskov_MIT_computer_scientist_2010](https://github.com/user-attachments/assets/bf1844e7-96bb-4089-adb2-1986f2f076e0)