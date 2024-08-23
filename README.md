# Task Manager API

## Description

This is my first API project, developed as part of my learning journey in backend development. The Basic Task Manager API provides basic functionality for user management and task tracking.

## Features

- User management with basic authentication
- Simple task management
- Basic security configuration using Spring Security

## Getting Started

### Prerequisites

- Java 17 or later
- Maven or Gradle
- Spring Boot

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/vctramador/basic-task-manager-api.git
    ```
2. Navigate to the project directory:
    ```bash
    cd basic-task-manager-api
    ```
3. Install dependencies:
    ```bash
    ./mvnw install
    ```
4. Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```

## API Endpoints

### User Management

- **GET** `/users` - Retrieve a list of users (authentication required)
- **POST** `/users` - Create a new user

### Task Management

- **POST** `/tasks` - Create a new task
- **GET** `/tasks` - Retrieve a list of tasks (authentication required)

## Security

The API uses basic security configuration with Spring Security. The default credentials are:

- Username: `user`
- Password: `password`

## Troubleshooting

- If you encounter issues with running the application, ensure that you have all the prerequisites installed and that you are using the correct Java version.
- For any errors related to dependencies or running the application, check the logs for more information.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

Special thanks to the Spring community for their documentation and support.
