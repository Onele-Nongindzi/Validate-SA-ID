✅ Validate SA ID
A Java-based project to validate South African ID numbers using Test-Driven Development (TDD). Built with Gradle and JUnit Jupiter, targeting Java 21.

📚 Table of Contents
Features

Prerequisites

Setup

Usage

Project Structure

Running Tests

Contributing

License

✨ Features
Validates South African ID numbers (13 digits)

Checks for:

✅ Correct length (13 digits)

🔢 Numeric content

📅 Valid date of birth (YYMMDD)

🚻 Gender (based on sequence number)

🏳️ Citizenship status

✔️ Checksum (Luhn algorithm)

Built with TDD for robust and reliable code

Uses Gradle and JUnit Jupiter

🛠 Prerequisites
Ensure the following tools are installed:

Java 21 (e.g., Adoptium OpenJDK)

Gradle (comes with the wrapper)

Git

IDE (e.g., Visual Studio Code with Extension Pack for Java, IntelliJ IDEA)

✅ Verify Installation
bash
Copy
Edit
java -version
gradle -v
git --version
⚙️ Setup
Clone the Repository
bash
Copy
Edit
git clone https://github.com/your-username/validate_sa_id.git
cd validate_sa_id
Build the Project
bash
Copy
Edit
./gradlew build
Open in Your IDE
VS Code:

bash
Copy
Edit
code .
IntelliJ:
Import as a Gradle project

🚀 Usage
Use the ValidateSaId class with the static method isIdNumberValid(String idNumber).

Example
java
Copy
Edit
package com.example;

public class Main {
    public static void main(String[] args) {
        String id = "2001014800086";
        boolean isValid = ValidateSaId.isIdNumberValid(id);
        System.out.println("ID " + id + " is valid: " + isValid);
    }
}
Currently, the project focuses on validation logic. A CLI or API may be added in the future.

🧱 Project Structure
pgsql
Copy
Edit
validate_sa_id/
├── app/
│   ├── build.gradle                # Gradle build configuration
│   └── src/
│       ├── main/java/com/example/ValidateSaId.java     # Validation logic
│       └── test/java/com/example/ValidateSaIdTest.java # JUnit tests
├── gradle/                         # Gradle wrapper files
├── gradlew                         # Unix Gradle wrapper
├── gradlew.bat                     # Windows Gradle wrapper
├── settings.gradle                 # Gradle settings
├── .gitignore                      # Git ignore file
├── README.md                       # Project README
🧪 Running Tests
Written with JUnit Jupiter using TDD principles.

Run All Tests
bash
Copy
Edit
./gradlew test
View Test Reports
Open the following in a browser:

swift
Copy
Edit
app/build/reports/tests/test/index.html
VS Code Test Explorer
Use the Test Explorer (🧪 beaker icon) to run/debug tests interactively.

Current Test Coverage
✅ Valid ID numbers (e.g., 2001014800086, 2909035800085)

❌ Invalid formats (e.g., length, non-numeric characters)

🔧 More test cases are under development

🤝 Contributing
Contributions are welcome!

Fork the repository

Create a new branch:

bash
Copy
Edit
git checkout -b feature/your-feature
Commit your changes:

bash
Copy
Edit
git commit -m "Add your feature"
Push to your fork:

bash
Copy
Edit
git push origin feature/your-feature
Open a pull request

Please follow TDD principles and include unit tests with your code.

📄 License
This project is licensed under the MIT License. See the LICENSE file for details.

