# Tutorial 13: Abstract Class & Interfaces in Java

This repository contains Java implementations for **Tutorial 13** of the Object-Oriented Programming (OOP) course. The tutorial focuses on core OOP principles, specifically **Abstract Classes**, **Abstract Methods**, and **Interfaces**.

---

## 📌 Project Overview

| Details | Description |
| :--- | :--- |
| **Course Name** | Object Oriented Programming |
| **Course Code** | 24SJPBCST304 |
| **Academic Year** | 2026-2027 |
| **Topic** | Abstract Class & Interface Implementation |
| **IDE** | Eclipse Java IDE |

---

## 📝 Questions & Program Descriptions

### Question 1: Geometrical Shape Analyzer
* **Goal:** Create an abstract class `Shape` with abstract methods to calculate properties of various geometrical structures.
* **Key Components:**
  * **Abstract Class `Shape`**: Defines `numberOfSides()` and `sumOfAngles()`.
  * **Subclasses**:
    * `Rectangle`: 4 sides, interior angle sum = $360^\circ$.
    * `Triangle`: 3 sides, interior angle sum = $180^\circ$.
    * `Hexagon`: 6 sides, interior angle sum = $720^\circ$.
* **Formula Used:** $\text{Sum of Interior Angles} = (n - 2) \times 180^\circ$

---

### Question 2: Vehicle Rental System
* **Goal:** Implement a vehicle rental calculation system using abstract classes and interfaces.
* **Key Components:**
  * **Interface `Displayable`**: Declares `showDetails(int days)`.
  * **Abstract Class `Vehicle`**:
    * Attributes: `vehicleId`, `vehicleName`, `rentalPricePerDay`.
    * Abstract method: `calculateRentalAmount(int days)`.
    * Concrete method: `displayVehicleDetails()`.
  * **Concrete Classes**:
    * `Car`: Applies a **10% discount** if rented for more than **5 days**.
    * `Bike`: Applies a **5% discount** if rented for more than **3 days**.

---

## 🚀 How to Run in Eclipse

1. **Open Eclipse** and select your workspace.
2. Create a new project:
   * **File** ➔ **New** ➔ **Java Project**
   * Project Name: `Tutorial13`
3. Add source files:
   * Right-click `src` ➔ **New** ➔ **Class**.
   * Create `Question1.java` and paste the code for Question 1.
   * Create `Question2.java` and paste the code for Question 2.
4. **Run the Programs**:
   * Open either file and press `Ctrl + F11` (or click the green **Run** button).
   * Provide the required input in the **Console window** at the bottom.

---

## 🖥 Sample Execution Output

### Question 2 Output Example:
```text
Enter rental days for Car: 6

--- Car Rental Details ---
Vehicle ID: 101
Vehicle Name: Sedan
Price per Day: 2000.0
Rented Days: 6
Total Rental Amount: 10800.0
--------------------------
Enter rental days for Bike: 4

--- Bike Rental Details ---
Vehicle ID: 201
Vehicle Name: Sports Bike
Price per Day: 500.0
Rented Days: 4
Total Rental Amount: 1900.0
