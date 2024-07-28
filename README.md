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