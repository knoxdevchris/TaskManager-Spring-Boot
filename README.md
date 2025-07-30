# TaskManager-Spring-Boot

A simple Task Manager application built with Spring Boot. This project provides a backend RESTful API for creating, viewing, updating, and deleting tasks, intended for educational purposes and as a foundation for further development.

## Features

- CRUD operations for tasks (Create, Read, Update, Delete)
- RESTful API endpoints
- Spring Boot-based architecture
- In-memory or persistent database support (e.g., H2, MySQL)
- Error handling and validation
- Easily extensible for new features

## Getting Started

### Prerequisites

- Java 17 or newer
- Maven or Gradle
- (Optional) Docker

### Running Locally

1. **Clone the repository:**
   ```bash
   git clone https://github.com/knoxdevchris/TaskManager-Spring-Boot.git
   cd TaskManager-Spring-Boot
   ```

2. **Build the project:**
   ```bash
   ./mvnw clean install
   ```

3. **Run the application:**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Access the API:**
   - The server will start at `http://localhost:8080`
   - API endpoints are available under `/api/tasks`

### Example API Endpoints

| Method | Endpoint             | Description                 |
|--------|----------------------|-----------------------------|
| GET    | `/api/tasks`         | List all tasks              |
| GET    | `/api/tasks/{id}`    | Get a specific task         |
| POST   | `/api/tasks`         | Create a new task           |
| PUT    | `/api/tasks/{id}`    | Update a task               |
| DELETE | `/api/tasks/{id}`    | Delete a task               |

#### Sample Task JSON

```json
{
  "title": "Write documentation",
  "description": "Prepare a README for the project",
  "completed": false
}
```

### Database Configuration

By default, the application uses H2 in-memory database. To use another database, update the `application.properties` or `application.yml` file as needed.

## Testing

Run all tests using:

```bash
./mvnw test
```

## Docker

To build and run with Docker:

```bash
docker build -t taskmanager-spring-boot .
docker run -p 8080:8080 taskmanager-spring-boot
```

## Contributing

Pull requests are welcome! Please open an issue to discuss enhancements or bugs before submitting a PR.

## License

This project is licensed under the MIT License.

## Contact

For questions or feedback, open an issue or contact [knoxdevchris](https://github.com/knoxdevchris).
