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
# Eg: 
private String itemName;
public String getItemName() {
    return itemName;
}
public void setItemName(String itemName) {
    this.itemName = itemName;
}

### 2. **Inheritance**
# Eg:
public class User {
    protected String name;
    protected String email;
}
public class Customer extends User {
    private String deliveryAddress;
    // Inherits 'name' and 'email' from User
}

### 3. **Abstraction**
# Eg:
public class FoodItem {
    private String name;
    private double price;
    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}

### 4. **Polymorphism**
# Eg:
FoodItem item1 = new DiscountedFoodItem("Burger", 5.99, 1.00); 
public class DiscountedFoodItem extends FoodItem {
    private double discount;
    public DiscountedFoodItem(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }
    @Override
    public double getPrice() {
        return super.getPrice() - discount;
    }
}
