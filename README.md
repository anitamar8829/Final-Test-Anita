**FINAL PROJECT: Automation Test for Web UI and API**
<br>This repository contains the Implementation of Final Project Automation Testing, focusing on Web UI and API testing. It demonstrates how to create automated tests using modern tools and frameworks for robust and reliable software validation.

**Features**
<br>Web UI Tests: Automated test scenarios for user interactions on Demoblaze. Validations for critical workflows like cart management and order placement.

<br>API Tests: Automated API tests for GoRest endpoints. Validations for CRUD operations.

BDD Implementation: Gherkin syntax to define test scenarios. Easy-to-read and maintain test cases for both technical and non-technical stakeholders.

**Getting Started**
**Prerequisites**
Ensure the following software is installed:

Java Development Kit (JDK): Version 8 or higher.
IntelliJ IDEA Community Edition.
Gradle.
Chrome Browser and ChromeDriver.

**HOW TO RUN PROJECT**
Type this command on the terminal
API Tests
./gradlew apirun -Ptags="@api"

WEB UI Tests
./gradlew webrun -Ptags="@web"
