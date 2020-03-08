# DanasawinDWPRestApp
My Rest API client that consumes  https://bpdts-test-app.herokuapp.com 

**Assignment Specification:**

•	Using the language of your choice please build your own API which calls the API at https://bpdts-test-app.herokuapp.com/ 

•	Returns people who are listed as either living in London, 

•	or whose current coordinates are within 50 miles of London. 

•	Push the answer to Github

**About my App:**

This application was built using Spring boot framework and Java programming language (Eclipse IDE).

Junit 4 and Mockito was used for Unit and Behavioural Testing (service and controller testing).

I applied MVC to structure my code design: packages consist of main, model, controller, service.


**URL functions:**

To retrieve all users from api: localhost:8080/myapp/allpeople

To retrieve only users in london: localhost:8080/myapp/londonpeople


**My app progress:**

My application will be able to consume the web api and return all the users with their respective infiormation.

However my application is unable to retrieve users that only live in London; with the error message "out of START_ARRAY token".

This error is due to the application returning an object instead of a list. I have tried different solutions to solve this issue, this includes:

•	Creating a wrapper class which will encapsulate the model object.

•	Converting the List to an Array.


Lastly I was not able to implement a method that could retrieve users that were living in a 50 miles radius of london with the given 
longitude and latitude.

All test cases failed.

*I appreciate your time and consideration :)*
