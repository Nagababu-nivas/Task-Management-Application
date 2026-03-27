# 🚀 Task Management API

A simple REST API built using Spring Boot to manage tasks. This project demonstrates CRUD operations, enum handling, and integration with a relational database.

---

## 📌 Features

* Create a task
* Get all tasks
* Get task by ID
* Update task status
* Delete a task

---

## 🧱 Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Postman
* PostgreSQL
* Maven
* GitHub
* Intellij IDEA

---

## 📊 Entity Structure

### Task

| Field       | Type      |
| ----------- | --------- |
| id          | Long      |
| title       | String    |
| description | String    |
| status      | Enum      |
| priority    | Enum      |
| dueDate     | LocalDate |

---

## 🔢 Enums

### Status

* TODO
* IN_PROGRESS
* DONE

### Priority

* LOW
* MEDIUM
* HIGH

---

## 🌐 API Endpoints

### ➕ Create Task

**POST** `/tasks/CreateTasks`

#### Request Body:

```json
{
  "title": "Fix Bug",
  "description": "Login issue",
  "status": "TODO",
  "priority": "HIGH",
  "dueDate": "2026-03-30"
}
```

---

### 📄 Get All Tasks

**GET** `/tasks/GetTasks`

---

### 🔍 Get Task by ID

**GET** `/tasks/GetTaskById/{id}`

---

### ✏️ Update Task Status

**PUT** `/tasks/UpdateTaskStatus/{id}/status?status=IN_PROGRESS`

---

### ❌ Delete Task

**DELETE** `/tasks/DeleteTaskById/{id}`

---

## ⚙️ Configuration

Update your `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
spring.datasource.username=postgres
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

---

## 🧪 Testing

Use Postman to test the APIs.

Make sure to set header:

```
Content-Type: application/json
```

---

## 💡 Notes

* Enum values must be in uppercase
* Date format should be `YYYY-MM-DD`
* Ensure PostgreSQL is running before starting the app

---

## 👨‍💻 Author

Developed by you 🚀

---

## ⭐ Future Improvements

* Add validation
* Add exception handling
* Add filtering APIs
* Introduce relationships (User → Tasks)

---

## 📬 License

This project is for learning purposes.
