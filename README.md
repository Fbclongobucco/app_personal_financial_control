# Personal Financial Control Application

This project is a **Personal Financial Control** application developed using **Spring Boot** and based on the principles of **Clean Architecture**. The main goal is to provide users with a simple and efficient way to manage their personal finances, with features for recording expenses, income, and categorizing financial transactions.

## Technologies Used

- **Spring Boot** - Framework for building Java applications.
- **Spring Data JPA** - For interacting with the database.
- **H2 Database** - Embedded database for testing and development.
- **PostgreSQL** - Relational database for production use.
- **Spring Security** - For securing and authenticating users.
- **JUnit** - Unit testing framework.
- **Clean Architecture** - Structure to organize the code in a scalable and maintainable way.

## Project Structure

The project is organized based on **Clean Architecture** principles, with the following layers:

1. **Entities**: Contains domain entities (e.g., `Transaction`, `User`).
2. **Use Cases**: Defines the application use cases such as "Record Transaction", "Generate Financial Report".
3. **Interface Adapters**: The layer responsible for adapting interfaces with the outside world (e.g., repositories, controllers).
4. **Frameworks and Drivers**: Includes external dependencies like Spring Boot and libraries.

## Features

- **User Registration**: Users can register and log into their financial accounts.
- **Transaction Management**: Ability to record expenses and income with categories and tags.
- **Financial Reports**: Generate financial reports based on recorded transactions.
- **Authentication and Security**: Protects sensitive endpoints with JWT-based authentication.

## How to Run the Application Locally

### Prerequisites

Before running the application, ensure you have the following tools installed:

- [Java 21 or later](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/)
- [IDE like IntelliJ or Eclipse](https://www.jetbrains.com/idea/)
- (Optional) [H2 Database](https://www.h2database.com/) (H2 is configured by default for development)

### Steps to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/YOUR_USERNAME/app_personal_financial_control.git
   cd app_personal_financial_control
