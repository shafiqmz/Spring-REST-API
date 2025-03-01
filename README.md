# Spring-REST-API

## Overview
The **Movies CRUD Application** is a RESTful API that allows users to perform Create, Read, Update, and Delete (CRUD) operations on movie records. It is built using **Spring Boot**, **MySQL**, and **Lombok** for simplifying Java code.

## Features
- **Create** a new movie record
- **Retrieve** a single movie or all movies
- **Update** movie details
- **Delete** a movie record
- **MySQL** database integration
- **Lombok** for reducing boilerplate code

## Technologies Used
- **Spring Boot** (REST API development)
- **Spring Data JPA** (Database interaction)
- **MySQL** (Relational database management system)
- **Lombok** (Simplifies getter/setter implementations)

## API Endpoints

### 1. Get Movie by ID
**GET** `/movieslist/{movieId}`

#### Request Example:
```http
GET /movieslist/MV001
```
#### Response Example:
```json
{
    "movieId": "MV001",
    "movieName": "Inception",
    "movieDesc": "A sci-fi thriller about dreams.",
    "movieGenre": "Science Fiction",
    "movieYear": 2010
}
```

---

### 2. Get All Movies
**GET** `/movieslist`

#### Response Example:
```json
[
    {
        "movieId": "MV001",
        "movieName": "Inception",
        "movieDesc": "A sci-fi thriller about dreams.",
        "movieGenre": "Science Fiction",
        "movieYear": 2010
    },
    {
        "movieId": "MV002",
        "movieName": "Titanic",
        "movieDesc": "A historical romance.",
        "movieGenre": "Drama",
        "movieYear": 1997
    }
]
```

---

### 3. Add a New Movie
**POST** `/movieslist`

#### Request Body Example:
```json
{
    "movieId": "MV003",
    "movieName": "The Matrix",
    "movieDesc": "A hacker discovers the truth about his world.",
    "movieGenre": "Action",
    "movieYear": 1999
}
```
#### Response:
```
Movie Added successfully!
```

---

### 4. Update Movie Details
**PUT** `/movieslist/{movieId}`

#### Request Body Example:
```json
{
    "movieId": "MV001",
    "movieName": "Inception (Updated)",
    "movieDesc": "A mind-bending sci-fi thriller.",
    "movieGenre": "Science Fiction",
    "movieYear": 2010
}
```
#### Response:
```
Movie updated successfully!!
```

---

### 5. Delete a Movie
**DELETE** `/movieslist/{movieId}`

#### Request Example:
```http
DELETE /movieslist/MV002
```
#### Response:
```
Movie deleted successfully!
```

## Installation & Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/movies-crud-app.git
   ```
2. Navigate to the project directory:
   ```sh
   cd movies-crud-app
   ```
3. Configure **application.properties** for MySQL connection:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/movies_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
4. Build & Run the application:
   ```sh
   mvn spring-boot:run
   ```
