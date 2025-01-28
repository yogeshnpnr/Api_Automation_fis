# Coin Desk API Test Framework

This project tests the CoinDesk API for Bitcoin price indices using RestAssured and JUnit 5.

## Prerequisites

- Java 8 or higher
- Maven

## Setup

1. Clone the repository:
   ```bash
   git clone <repository_url>
   cd coin-desk-api-test
   ```

2. Install dependencies:
   ```bash
   mvn clean install
   ```

## Run Tests

Execute the tests using Maven:
```bash
mvn test
```

## Project Structure

- `config/RestAssuredConfig.java`: Configures RestAssured settings.
- `tests/CoinDeskAPITest.java`: Contains the test cases for the API.
- `pom.xml`: Maven configuration file with dependencies.

## Features

- Validates HTTP status codes.
- Checks for the presence of USD, GBP, and EUR.
- Validates GBP description.

## Future Enhancements

- Add support for more endpoints.
- Introduce parameterized tests.
