# 🛠️ Java Annotations Practice

## 📝 Description

This repository includes practical Java exercises designed to strengthen your understanding of Java **annotations**, particularly focusing on **method overriding** and **deprecation handling**. The goal is to explore how annotations like `@Override` and `@Deprecated` can help improve code readability, maintainability, and provide clear API documentation.

## 🚀 Objectives

* Learn to use Java annotations in practical scenarios.
* Implement class hierarchies with method overriding.
* Understand and apply the `@Override` annotation correctly.
* Mark methods as deprecated using `@Deprecated`.
* Suppress deprecation warnings using `@SuppressWarnings`.

## 📚 Exercise Overview

### 🔹 Level 1

#### Exercise 1 – Worker Hierarchy with @Override

* **What it does:**

  * Implements a class hierarchy with three classes: `Treballador`, `TreballadorOnline`, and `TreballadorPresencial`.
  * The `Treballador` class contains the attributes `name`, `surname`, `hourlyRate`, and a method `calcularSou(int hoursWorked)` that returns the salary by multiplying `hoursWorked` by `hourlyRate`.
  * The child classes override the `calcularSou()` method using `@Override`:

    * `TreballadorPresencial` adds a static attribute `benzina` (fuel cost) to the calculated salary.
    * `TreballadorOnline` adds a constant `TARIFA_INTERNET` (flat internet rate) to the calculated salary.
* **Learning focus:**

  * Understanding inheritance and method overriding.
  * Proper application of the `@Override` annotation.
  * Demonstrating polymorphic behavior in a class hierarchy.

#### Exercise 2 – Using @Deprecated and @SuppressWarnings

* **What it does:**

  * Adds deprecated methods to the child classes `TreballadorOnline` and `TreballadorPresencial` using the `@Deprecated` annotation.
  * Invokes these deprecated methods from an external class (such as `Principal`) to demonstrate their usage.
  * Suppresses the compiler warnings for deprecated method usage using `@SuppressWarnings("deprecation")`.
* **Learning focus:**

  * Marking and managing deprecated methods.
  * Understanding how to control and suppress deprecation warnings.
  * Applying good practices for evolving APIs while maintaining backward compatibility.

## ⚙️ Technologies Used

* Java 17
* Eclipse or IntelliJ IDEA
* GitHub

## 📋 Requirements

* Java JDK 17 or higher
* Git for version control
* IDE (Eclipse or IntelliJ)

## 🛠️ Installation

```bash
git clone https://github.com/Apani13/s1-07-annotations.git
```

Open the project in IntelliJ IDEA or Eclipse and make sure Java 17+ is selected as the SDK.

## ▶️ Execution

All exercises are executable via **terminal**. Example structure:

```
/<project-root>
├── src/
│   └── level01/exercise1/...  (Java source files)
└── bin/                      (compiled class files)
```

### Compile

```bash
javac -d bin src/level01/exercise1/*.java
```

### Run

```bash
java -cp bin level01.exercise1.Principal
```

Repeat the commands accordingly for Exercise 2.

## 🤝 Contributions

1. Fork the repository.
2. Create your branch: `git checkout -b feature/MyFeature`
3. Commit changes: `git commit -m "Add MyFeature"`
4. Push your branch: `git push origin feature/MyFeature`
5. Open a pull request.

## ✅ Author Notes

These annotation-focused exercises are essential for writing clear, maintainable Java code. Mastering annotations like `@Override`, `@Deprecated`, and `@SuppressWarnings` will help you build well-structured and future-proof Java applications.

Happy coding! 🚀