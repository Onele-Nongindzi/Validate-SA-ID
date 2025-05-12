# ✅ Validate SA ID

A **Java-based project** to validate **South African ID numbers** using **Test-Driven Development (TDD)**. Built with **Gradle** and **JUnit Jupiter**, targeting **Java 21**.

---

## 📚 Table of Contents

- [Features](#features)  
- [Prerequisites](#prerequisites)  
- [Setup](#setup)  
- [Usage](#usage)  
- [Project Structure](#project-structure)  
- [Running Tests](#running-tests)  
- [Contributing](#contributing)  
- [License](#license)  

---

## ✨ Features

- Validates **South African ID numbers (13 digits)**
- Checks for:
  - ✅ Correct length (13 digits)
  - 🔢 Numeric content
  - 📅 Valid date of birth (YYMMDD)
  - 🚻 Gender (based on sequence number)
  - 🏳️ Citizenship status
  - ✔️ Checksum (Luhn algorithm)
- Built with **TDD** for robust and reliable code
- Uses **Gradle** and **JUnit Jupiter**

---

## 🛠 Prerequisites

Ensure the following tools are installed:

- **Java 21** (e.g., [Adoptium OpenJDK](https://adoptium.net/))
- **Gradle** (comes with the wrapper)
- **Git**
- IDE (e.g., **Visual Studio Code** with [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack), **IntelliJ IDEA**)

### ✅ Verify Installation

```bash
java -version
gradle -v
git --version
