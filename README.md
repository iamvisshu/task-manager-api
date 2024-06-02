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
