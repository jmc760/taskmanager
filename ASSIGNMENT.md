# Task Management System (Task Manager)

## Objective

To develop a collaborative task management system that allows users to organize, assign, and track the progress of their projects. The main objective is to build a robust and scalable solution that can serve as a basis for future expansions.

## Functional Requirements

### 1. User and Project Management
- Users must be able to register, log in, and manage their profiles.
- An authenticated user must be able to create and list their own projects.
- It must be possible to assign other users to a project.

### 2. Task Management
- Within a project, users must be able to create, edit, and delete tasks.
- Each task must have a title, a description, a due date, and a status (e.g., "To Do", "In Progress", "Completed").
- It must be possible to assign a task to a specific user who is part of the project.

### 3. RESTful API
- The application must expose a well-defined RESTful API for all the aforementioned functionalities.
- The API must be protected by a secure authentication mechanism, using JSON Web Tokens (JWT) for authorization.

### 4. Minimalist Frontend
- A basic user interface is required to consume the API and demonstrate the system's functionality.
- The interface must allow user authentication, project creation, and the display/management of tasks within a project.

## Technical Requirements

### Backend
- **Language:** Java 21.
- **Framework:** Spring Boot 3.
- **Persistence:** Spring Data JPA with Hibernate.
- **Database:** H2 for local development, with the ability to use PostgreSQL in a production environment.
- **Testing:** JUnit 5, Mockito, and if possible, Testcontainers for integration testing.
- **Build:** Maven.

### Frontend
- **Framework:** React with Vite and TypeScript.
- **Routing:** React Router DOM.
- **State Management:** Context API or Redux Toolkit (optional, if time permits).

### Deployment and CI/CD
- **Containerization:** A Dockerfile must be provided to package the Spring Boot application. It is recommended to use Docker Compose to orchestrate the backend, database, and frontend.
- **Automation:** Configure a CI/CD pipeline in GitHub Actions that compiles the project, runs the tests, and builds the Docker images.

## Deliverables

1.  **Complete Source Code:** A well-structured GitHub repository with the source code for the backend and frontend.

2.  **Documentation (README.md):** A complete README.md file that includes:
    - A detailed description of the project and the technologies used.
    - Clear instructions for local setup and execution (using Docker Compose).
    - A guide to the REST API, including endpoints, HTTP verbs, and request examples.
    - Screenshots or a short video of the frontend in action.

3.  **Demonstration:** The ability to showcase the running application, either locally via Docker or, ideally, deployed on a hosting service.

## Estimated Timeline

2 to 3 business days.