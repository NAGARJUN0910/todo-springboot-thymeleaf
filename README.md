# 📝 ToDo Web Application (Spring Boot + Thymeleaf + MySQL)

This is a simple **ToDo web application** built using **Spring Boot**, **Thymeleaf**, and **MySQL**.  
It demonstrates the **monolithic application architecture** where backend and frontend are integrated into one Spring Boot project.

---

## 🚀 Features
- Add new tasks
- Edit existing tasks
- Mark tasks as completed
- Delete tasks
- Server-side rendering with **Thymeleaf**
- Persistent storage with **MySQL**

---

## 🛠️ Tech Stack
- **Backend:** Java, Spring Boot (Spring MVC, Spring Data JPA)
- **Frontend:** Thymeleaf, HTML, CSS, Bootstrap
- **Database:** MySQL

---

## 📂 Project Structure
todo-springboot-thymeleaf/
├── src/main/java/... # Java source code (controllers, services, repositories, models)
├── src/main/resources/
│ ├── static/ # CSS, JS, images
│ ├── templates/ # Thymeleaf HTML templates
│ └── application.properties
├── pom.xml # Maven dependencies

---

## ⚙️ Installation & Setup

### 1. Clone the repository
bash
git clone https://github.com/<NAGARJUN0910>/todo-springboot-thymeleaf.git
cd todo-springboot-thymeleaf

**2. Configure MySQL Database**
CREATE DATABASE todo_db;
**Update your application.properties file:**
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

**3. Run the Application**
mvn spring-boot:run

**4. Access the App**
Open your browser and go to:
http://localhost:8080

**🔮 Future Improvements**
Add user authentication (login/signup)
Add task categories & priorities
Responsive UI enhancements

🤝 Contributing
Contributions, issues, and feature requests are welcome!
Feel free to fork this repository and submit a Pull Request.

👨‍💻 Author

Nagarjun B N
📌 https://github.com/NAGARJUN0910
 | https://www.linkedin.com/in/nagarjun-b-n-909b69290/


