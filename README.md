Validate SA ID

A Java-based project to validate South African ID numbers using Test-Driven Development (TDD). The project is built with Gradle and JUnit Jupiter, targeting Java 21. It validates ID numbers based on length, numeric content, and other criteria such as date of birth, gender, citizenship, and checksum.
Table of Contents

Features
Prerequisites
Setup
Usage
Project Structure
Running Tests
Contributing
License

Features

Validates South African ID numbers (13 digits).
Checks for:
Correct length (13 digits)
Numeric content
Valid date of birth (YYMMDD)
Gender (based on sequence number)
Citizenship status
Checksum (Luhn algorithm)


Built with TDD for robust and reliable code.
Uses Gradle for build automation and JUnit Jupiter for testing.

Prerequisites

Java 21 (JDK, e.g., Adoptium OpenJDK)
Gradle (included via gradlew wrapper)
Git (for cloning the repository)
IDE (e.g., Visual Studio Code with Extension Pack for Java, IntelliJ IDEA)

Verify installations:
java -version
gradle -v
git --version

Setup

Clone the Repository:
git clone https: https://github.com/Onele-Nongindzi/Validate-SA-ID.git
cd validate_sa_id


Verify Gradle Wrapper:Ensure gradlew (Unix) or gradlew.bat (Windows) is present.

Build the Project:
./gradlew build


Open in IDE:

For VS Code: code .
For IntelliJ: Import as a Gradle project.



Usage
The project provides a ValidateSaId class with a static method isIdNumberValid(String idNumber) to validate South African ID numbers.
Example usage:
package com.example;

public class Main {
    public static void main(String[] args) {
        String id = "2001014800086";
        boolean isValid = ValidateSaId.isIdNumberValid(id);
        System.out.println("ID " + id + " is valid: " + isValid);
    }
}

Currently, the project focuses on the validation logic and is tested via JUnit. A CLI or API may be added in the future.
Project Structure
validate_sa_id/
├── app/
│   ├── build.gradle           # Gradle build configuration
│   └── src/
│       ├── main/
│       │   └── java/com/example/ValidateSaId.java  # Validation logic
│       └── test/
│           └── java/com/example/ValidateSaIdTest.java  # JUnit tests
├── gradle/                   # Gradle wrapper files
├── settings.gradle           # Gradle settings
├── gradlew                   # Gradle wrapper script (Unix)
├── gradlew.bat               # Gradle wrapper script (Windows)
├── .gitignore                # Git ignore file
├── README

