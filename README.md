[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)

# PCCCS495 – Term II Project

## Project Title
Multiplayer Turn-Based Game Engine using Java

---

## Problem Statement (max 150 words)
Many simple games such as Tic-Tac-Toe and board games follow a turn-based structure, but their implementations often tightly couple game logic with specific rules. This makes it difficult to reuse the code for other games. This project aims to develop a reusable Turn-Based Game Engine in Java that separates game flow (players, turns, and state management) from game-specific rules. By using object-oriented principles and design patterns, the system allows new games to be easily implemented by extending base classes. The project focuses on modular design, clean architecture, and proper handling of game states, ensuring maintainability and extensibility.

---

## Target User
Students and beginner developers who want to understand how object-oriented programming can be applied to build modular and reusable game systems.

---

## Core Features

- Player management system
- Turn-based execution using TurnManager
- Move validation and exception handling
- Game state management (ONGOING, WIN, DRAW)
- Strategy Pattern for winner detection
- Console-based user interaction

---

## OOP Concepts Used

- Abstraction: Implemented using abstract Game class
- Inheritance: TicTacToeGame extends Game
- Polymorphism: Method overriding for game-specific logic
- Exception Handling: Custom exceptions for invalid moves
- Collections / Threads: ArrayList used for managing players

---

## Proposed Architecture Description

The system follows a layered architecture consisting of UI, Engine, Game, Strategy, and Model layers. The ConsoleUI handles user interaction, while the GameEngine manages the game flow. The abstract Game class defines the structure of any turn-based game, and specific games like TicTacToeGame extend it to implement their own rules. The Strategy Pattern is used to separate winner detection logic, allowing flexibility and extensibility. This modular design ensures separation of concerns and makes the system easy to maintain and extend.

---

## How to Run

1. Open the project in IntelliJ IDEA
2. Navigate to `Main.java` inside the app package
3. Run the program
4. Enter row and column values (0–2) when prompted

---

## Git Discipline Notes
Minimum 10 meaningful commits have been maintained, showing incremental development including structure setup, core logic implementation, design pattern integration, bug fixes, and final UI improvements.