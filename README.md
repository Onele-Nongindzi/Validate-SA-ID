# South African ID Validator
A Java-based project for validating South African ID numbers using Test-Driven Development (TDD). Built with Gradle and JUnit Jupiter, targeting Java 21.

## Table of Contents

- Features
- Prerequisites
- Setup
- Usage
- Project Structure
- Running Tests
- Contributing
- License

## Features

Validates 13-digit South African ID numbers
Performs the following checks:
- ✅ Correct length (13 digits)
- 🔢 Numeric content
- 📅 Valid date of birth (YYMMDD format)
- 🚻 Gender (derived from sequence number)
- 🏳️ Citizenship status
- ✔️ Checksum (using Luhn algorithm)


Developed using TDD for reliable and maintainable code
Built with Gradle and tested with JUnit Jupiter
Targets Java 21 for modern language features

## Prerequisites
Ensure the following tools are installed:
- Java 21 (e.g., Adoptium OpenJDK)
- Gradle (included via Gradle wrapper)
- Git
- IDE (recommended: Visual Studio Code with Extension Pack for Java, or IntelliJ IDEA)

## Verify Installation
- Confirm your setup with these commands:
  - `java -version`
  - `gradle -v`
  - `git --version`

## Setup

- 'Clone the repository:git clone https://github.com/your-username/sa-id-validator.git'
- cd sa-id-validator
- Verify that Java 21 is your active JDK.
- The Gradle wrapper (gradlew) is included, so no separate Gradle installation is needed.

## Usage
To build and run the application:
./gradlew build
./gradlew run

The application validates South African ID numbers based on the specified criteria.
## Project Structure
sa-id-validator/
├── src/
│   ├── main/
│   │   └── java/                # Application source code
│   └── test/
│       └── java/                # JUnit Jupiter test cases
├── build.gradle                 # Gradle build configuration
├── gradlew                      # Gradle wrapper script (Unix)
├── gradlew.bat                  # Gradle wrapper script (Windows)
└── README.md                    # This file

## Running Tests
Tests are implemented using JUnit Jupiter and follow TDD principles. To execute tests:
./gradlew test

View test results in the build/reports/tests/test directory.
## Contributing
Contributions are encouraged! To contribute:

Fork the repository.
Create a feature branch (git checkout -b feature/your-feature).
Commit your changes (git commit -m "Add your feature").
Push to the branch (git push origin feature/your-feature).
Submit a pull request.

For significant changes, please open an issue first to discuss your ideas.
## License
This project is licensed under the MIT License.
