# Spring Core Concepts Project 🌱

This project is a pure Spring Framework (Spring Core) learning project designed to demonstrate the fundamental concepts behind Spring's Inversion of Control (IoC) container, Dependency Injection (DI), bean management, autowiring, and component scanning.

Unlike Spring Boot, this project uses the core Spring Framework directly, helping build a deeper understanding of how Spring manages objects, dependencies, and application configuration internally.

This project serves as a foundational step toward mastering Spring Boot and enterprise backend development.

---

## 🎯 Purpose of the Project

The primary goal of this project is to learn and demonstrate:

* Inversion of Control (IoC)
* Dependency Injection (DI)
* Tight vs Loose Coupling
* Bean configuration using XML
* Constructor Injection
* Setter Injection
* Autowiring (byName, byType, constructor)
* Annotation-based configuration
* Component Scanning
* Spring IoC Container behavior
* ApplicationContext usage

---

## 🛠️ Tech Stack

* Java 23 (or compatible version)
* Spring Core
* Spring Context
* Maven

Dependencies used:

* spring-core
* spring-context

---

## 📁 Project Structure

```
Spring_Project
│
├── src
│   ├── main
│   │   ├── java
│   │   │
│   │   │── car.example
│   │   │   ├── bean
│   │   │   │   ├── App.java
│   │   │   │   └── MyBean.java
│   │   │   │
│   │   │   ├── constructor.injection
│   │   │   │   ├── App.java
│   │   │   │   ├── Car.java
│   │   │   │   └── Specification.java
│   │   │   │
│   │   │   └── setter.injection
│   │   │       ├── App.java
│   │   │       ├── Car.java
│   │   │       └── Specification.java
│   │   │
│   │   │── com.example
│   │   │   └── autowire
│   │   │       ├── constructor
│   │   │       │   ├── App.java
│   │   │       │   ├── Car.java
│   │   │       │   └── Specification.java
│   │   │       │
│   │   │       ├── name
│   │   │       │   ├── App.java
│   │   │       │   ├── Car.java
│   │   │       │   └── Specification.java
│   │   │       │
│   │   │       └── type
│   │   │           ├── App.java
│   │   │           ├── Car.java
│   │   │           └── Specification.java
│   │   │
│   │   │── autowired.annotations
│   │   │   ├── App.java
│   │   │   ├── AppConfig.java
│   │   │   ├── Employee.java
│   │   │   └── Manager.java
│   │   │
│   │   │── componentscan.annotation
│   │   │   ├── App.java
│   │   │   └── Employee.java
│   │   │
│   │   │── ioc.coupling
│   │   │   ├── IOCExample.java
│   │   │   ├── NewDatabaseProvider.java
│   │   │   ├── UserDatabaseProvider.java
│   │   │   ├── UserDataProvider.java
│   │   │   ├── UserManager.java
│   │   │   └── WebServiceDataProvider.java
│   │   │
│   │   │── loose.coupling
│   │   │   ├── LooseCouplingExample.java
│   │   │   ├── NewDatabaseProvider.java
│   │   │   ├── UserDatabaseProvider.java
│   │   │   ├── UserDataProvider.java
│   │   │   └── UserManager.java
│   │   │
│   │   │── tight.coupling
│   │   │   ├── TightCouplingExample.java
│   │   │   ├── UserDatabase.java
│   │   │   └── UserManager.java
│   │   │
│   │   └── resources
│   │       ├── applicationBeanContext.xml
│   │       ├── applicationConstructorInjection.xml
│   │       ├── applicationIoCLooseCouplingExample.xml
│   │       ├── applicationSetterInjection.xml
│   │       ├── autowireByConstructor.xml
│   │       ├── autowireByName.xml
│   │       ├── autowireByType.xml
│   │       └── componentScanDemo.xml
│   │
│   └── test
│
├── pom.xml
├── .gitattributes
└── README.md
```

---

## 🧠 Core Concepts Demonstrated

---

### 1. Inversion of Control (IoC)

In traditional programming, objects create their dependencies.

In Spring, the container creates and manages objects.

Example (Without IoC):

```
UserManager manager = new UserManager();
```

Example (With IoC):

Spring creates the UserManager object and injects dependencies automatically.

Benefits:

* Reduces coupling
* Improves flexibility
* Improves maintainability

---

### 2. Dependency Injection (DI)

Dependency Injection means providing dependencies to objects instead of letting them create dependencies themselves.

Spring supports multiple types:

---

### 3. Constructor Injection

Dependencies are injected through the constructor.

Example:

```
public Car(Specification spec) {
    this.spec = spec;
}
```

Configured in XML:

```
<constructor-arg ref="specificationBean"/>
```

Benefits:

* Ensures required dependencies are available
* Makes objects immutable

---

### 4. Setter Injection

Dependencies are injected using setter methods.

Example:

```
public void setSpecification(Specification spec) {
    this.spec = spec;
}
```

Configured in XML:

```
<property name="specification" ref="specificationBean"/>
```

Benefits:

* Allows optional dependencies
* More flexible

---

### 5. Autowiring

Spring automatically injects dependencies.

Types demonstrated:

---

#### Autowire by Name

Matches bean name with property name.

```
autowire="byName"
```

---

#### Autowire by Type

Matches bean type with property type.

```
autowire="byType"
```

---

#### Autowire by Constructor

Matches constructor parameter type.

```
autowire="constructor"
```

---

### 6. Annotation-based Autowiring

Uses annotations like:

```
@Autowired
@Component
@Configuration
```

Spring automatically resolves dependencies.

Benefits:

* Cleaner code
* Less XML configuration

---

### 7. Component Scanning

Spring automatically detects classes annotated with:

```
@Component
@Service
@Repository
```

Configured using:

```
<context:component-scan base-package="com.example"/>
```

---

### 8. Tight Coupling

Classes depend directly on specific implementations.

Example:

```
UserDatabase db = new UserDatabase();
```

Problems:

* Hard to change implementation
* Not flexible

---

### 9. Loose Coupling

Classes depend on interfaces instead of implementations.

Example:

```
UserDataProvider provider;
```

Spring injects appropriate implementation.

Benefits:

* Flexible
* Easy to extend
* Easier testing

---

### 10. Spring IoC Container

The container:

* Creates objects (beans)
* Injects dependencies
* Manages lifecycle

Example:

```
ApplicationContext context =
    new ClassPathXmlApplicationContext("applicationContext.xml");
```

---

## ▶️ How to Run the Project

### Prerequisites

* Java installed
* Maven installed
* IDE (IntelliJ recommended)

---

### Build project

```
mvn clean install
```

---

### Run example

Run any App.java file from IDE.

Example:

```
car.example.constructor.injection.App
```

or

```
ioc.coupling.IOCExample
```

---

## 🎓 Learning Outcome

After completing this project, you will understand:

* How Spring IoC container works
* How Spring manages objects
* How Dependency Injection works internally
* Difference between tight coupling and loose coupling
* XML vs Annotation configuration
* Foundation required for Spring Boot

---

## 🔮 Future Improvements

* Add Spring Boot version of project
* Add Spring MVC
* Add database integration
* Add REST APIs

---

## 👨‍💻 Author

Aaryaman Jhatakia

GitHub: [https://github.com/Aaryamanjhatakia](https://github.com/Aaryamanjhatakia)

---


