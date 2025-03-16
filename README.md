# Smart Home System

## Description
This project is a smart home system implemented in Java. It includes management of various devices such as lighting, security cameras, door locks, and supports scheduled operations.

## Project Structure

- **AdvancedSmartHomeFactory** – an advanced factory for creating smart devices with scheduling support.
- **BasicSmartHomeFactory** – a basic factory for creating simple smart devices.
- **DeviceDecorator** – an abstract decorator class for extending device functionality.
- **DeviceGroup** – a group of smart devices allowing control over multiple devices at once.
- **DoorLockAdapter** – an adapter for working with legacy door locks.
- **LegacyDoorLock** – a legacy door lock used via an adapter.
- **Light** – a class representing a smart light.
- **ScheduledOperationDecorator** – a decorator for adding scheduled operations.
- **SecurityCamera** – a security camera.
- **SmartDevice** – an interface for all smart devices.
- **SmartHomeController** – a controller class for managing devices.
- **SmartHomeDemo** – a demo class for testing the system.
- **SmartHomeFactory** – an interface for smart device factories.
- **Thermostat** – a thermostat for regulating home temperature.

## Installation and Running

1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/smart-home-system.git
   cd smart-home-system
   ```

2. Compile the project:
   ```sh
   javac src/*.java
   ```

3. Run the application (if there is a `Main` class):
   ```sh
   java src.SmartHomeDemo
   ```

## Technologies Used
- Java
- Design Patterns: Factory, Decorator

## Contact
If you have any questions or suggestions, create an issue or pull request in the repository.
