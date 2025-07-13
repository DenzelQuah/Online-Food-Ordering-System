# 🍔 Food Online Ordering System (Object-Oriented Design & Implementation)

This Java-based application is a simple **Food Online Ordering System** that demonstrates the core principles of **Object-Oriented Programming (OOP)**. It allows users to order food items, calculate totals, and view order summaries while emphasizing **encapsulation**, **access control**, and class relationships.

---

## 🧠 Project Objective

This project focuses on:
- Implementing **setter** and **getter** methods for data access and modification.
- Applying **OOP principles**: Encapsulation, Inheritance, Abstraction, and Polymorphism.
- Using proper **access modifiers** (`private`, `public`, `protected`) to control visibility and maintain code modularity and security.

---

## 📦 Features
 
- View available food menu items
- Add items to a customer’s order
- Automatically calculate total price
- View order summary
- Encapsulation using `private` attributes with `getters` and `setters`
- Structured using multiple classes (MenuItem, Order, Customer, etc.)

---

## 🧩 OOP Concepts Used

### 1. **Encapsulation**
All class fields are marked as `private` and accessed/modified via **getter** and **setter** methods.

### 2. **Inheritance**
Inheritance allows one class to reuse the fields and methods of another class. This promotes code reusability and helps build relationships between general and specific classes.

### 3. **Abstraction**
Core details of the food items (like name and price) are hidden using private fields, and accessed through public getter and setter methods. This ensures that only necessary information is exposed to other classes, improving code clarity and safety.

### 4. **Polymorphism**
Polymorphism allows the use of a FoodItem reference to point to different types of food items, such as regular or discounted items. When calling methods like getPrice(), Java dynamically selects the appropriate method based on the actual object type, enabling flexible and scalable design.
