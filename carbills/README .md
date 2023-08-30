# Car Service Station Software

This Java software application is designed to manage service requests and generate detailed bills for a car service station using Object-Oriented Programming.

## Features

- The car service station caters to different types of cars: Hatchback, Sedan, SUV.
- It provides different types of services: Basic Service, Engine Fixing, Clutch Fixing, Gear Fixing, and Brake Fixing.
- Each service has a service code associated with it and different prices for different types of cars.
- The software generates a detailed bill with the total amount for each service request based on the type of car specified and the requested service codes.
- If the total service bill is more than ₹ 10000, a complimentary cleaning is provided and specified in the bill.

## Usage

1. Compile and run the `CarServiceApp.java` file using a Java compiler (e.g., `javac CarServiceApp.java` and `java CarServiceApp`).

2. Follow the on-screen instructions to enter the car type (HATCHBACK/SEDAN/SUV) and the service codes (comma-separated) for the requested services.

3. The program will calculate the total bill and display the breakdown of charges for each service code.

4. If the total bill is more than ₹ 10000, the program will indicate that a complimentary cleaning is provided.

## Screenshots

Here are some screenshots of the software in action:

![Screenshot 1](carbills/Screenshots/Screenshot 2023-08-30 142654.png)
*Entering car type and service codes.*

![Screenshot 2](carbills/Screenshots/Screenshot 2023-08-30 142703.png)
*Viewing the breakdown of charges and the total bill.*

## Enums

- `CarType` enum defines the types of cars supported: HATCHBACK, SEDAN, SUV.
- `ServiceCode` enum defines the service codes for different services: BS01, EF01, CF01, BF01, GF01.

## Notes

- Make sure you have Java installed on your system.
- Service codes and car types are case-insensitive.
- If you enter an invalid service code, it will be marked as such in the output.
- This application demonstrates basic functionality and can be extended further based on your requirements.

## Author

[Omkar Pawar]

