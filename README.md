# Task-Manager-API 💻✨ : Created by @iamvisshu - Vishal Vishwakarma
This project is a Task Manager REST API developed by @iamvisshu using Java with Spring Boot.
	
---

📃 **Table of Contents**

* About Task-Manager-API 💻✨
* Technical Details
* Installation
* Usage
* API
* Contributing
* License
* Author
	
---

⭐**About Task-Manager-API 💻✨**

  * This is Springboot Project to create, update, view and remove tasks. This ia simple task management app, which is having a simple webpage to hit this REST API to show data, configured H2 DB console and supports MySQL as well.
  * Project Structure - Refer below ⏬ image.
   ![Project Structure](https://github.com/iamvisshu/task-manager-api/assets/53083619/afad89a8-2999-4d83-821c-446f975dcdd4)
 
---

🔨**Technical Details:**
* Java version: 1.8
* Spring Boot version: 2.6.13
* Database used: MySQL Connector and H2 database
* Additional libraries used: Lombok for generating boilerplate code, Spring Boot starters for data JPA, web, security, validation, and testing.

---

🔧**Installation:**

* Clone this repository or download it as zip.
* Make sure your system meets Technical requirements given above.
* If you are using MySQL, please ensure MySQL is running and configured properly.
* To build the project, navigate to the project root directory and :
> Run `mvn clean install` and then
> `mvn spring-boot:run`
* Your Spring Boot application should now be running, and you can access it at `http://localhost:8080.`
* Access H2 console from here - `http://localhost:8080/h2-console` using username and password both as - `sa`
* ⛔ _**NOTE : Check all configurations, ports , pom.xml, application.properties before running application.**_
  
---

☑️ **Usage:**

* Launch index.html in browser.
* Enter the task id and click on `Get Task` button
* If you want to see all tasks click on buton `Get All Tasks`
* Refer below ⏬ image.
  ![Index](https://github.com/iamvisshu/task-manager-api/assets/53083619/948c7440-5518-4abf-a181-db2a9be8e03d)

---

✈️ **API:**

* Login to H2-Console by using url - `http://localhost:8080/h2-console`
* If you are using MySql then you can by using MySQL application.
*  Refer below ⏬ image.
  ![H2 Console](https://github.com/iamvisshu/task-manager-api/assets/53083619/24b54e14-4f04-4f81-8a11-a1f69d1fcf98)

*  You can run query on H2-Console.
![H2 Console SQL](https://github.com/iamvisshu/task-manager-api/assets/53083619/3d286d1c-c896-47ca-932a-6d971e32e21b)

*  Hitting API by using Postman.
*  GET all tasks. `http://localhost:8080/tasks`
![Postaman 01](https://github.com/iamvisshu/task-manager-api/assets/53083619/a9b03612-541d-47b3-b4d9-9a013165fb7f)

*  GET specific tasks by id. For example : `http://localhost:8080/tasks/2`
![Postaman 02](https://github.com/iamvisshu/task-manager-api/assets/53083619/c8d6d04c-0de7-4469-ba37-c999d7ddd223)

*  POST the entry in table by hitting API like below :
![Postaman 03](https://github.com/iamvisshu/task-manager-api/assets/53083619/b1642ac1-efb5-4821-9714-e96f72573958)

*  POST will have below structure in body of Request. SAMPLE REQUEST is below : 
```JSON
{
    "title": "Sample Task",
    "description": "This is a sample task created using Postman",
    "deadline": "2024-05-25T12:00:00",
    "priority": "HIGH",
    "completed": false
}
```
* SAMPLE Response will look like this :
```JSON
{
    "title": "Sample Task",
    "description": "This is a sample task created using Postman",
    "deadline": "2024-05-25T12:00:00",
    "priority": "HIGH",
    "completed": false
}
```
	
---

👫 **Contributing:**

We welcome contributions to this project! If you'd like to contribute, please:

1. Fork the repository on GitHub.
2. Make your changes and create a pull request.
3. Follow any coding style guidelines mentioned in the code (if any).

---

💳 **License:**

 * This project is licensed under the Open-source [**MIT License**].
 
---

✒️ **Author:**
* @iamvisshu - Vishal Vishwakarma 😇
