# 🎲 Java Word Guess Game (OOP Basics)

A simple console-based word guessing game (like Hangman) built in Java to demonstrate fundamental Object-Oriented Programming (OOP) concepts, along with basic data structures like Strings and Arrays.

---

## ✨ Features

* **OOP Implementation:** Uses a dedicated `WordGuessGame` **class** to manage game state and logic (demonstrating **Encapsulation**).
* **Strings & Arrays:** Leverages a `String` for the secret word and `char[]` **arrays** to track the display word and all guessed letters.
* **Basic Game Loop:** Runs until a win or loss condition is met.
* **Pre-defined Words:** Words are selected randomly from a starter array.

---

## 🛠️ Technologies Used

* **Language:** Java (JDK 8 or newer is recommended)
* **Concepts:** Class, Object, Constructor, Methods, Private/Public Access Modifiers (Encapsulation), String, Array, Scanner.

---

## 🚀 Getting Started

These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

You need to have the **Java Development Kit (JDK)** installed on your machine.

* [Download JDK](https://www.oracle.com/java/technologies/downloads/)

### Installation and Execution

1.  **Clone the repository (or download the source code):**
    ```bash
    git clone [YOUR_REPOSITORY_URL_HERE]
    cd java-word-guess-game
    ```

2.  **Compile the Java files:**
    If your files are named `WordGuessGame.java` and `Main.java`:
    ```bash
    javac Main.java WordGuessGame.java
    ```
    *(Note: If you are using an IDE like IntelliJ or Eclipse, this step is handled automatically.)*

3.  **Run the application:**
    ```bash
    java Main
    ```

---

## 🎮 How to Play

1.  The game will start and display the length of the secret word as underscores (e.g., `____`).
2.  You have **6 lives** (incorrect guesses).
3.  Enter a **single letter** when prompted.
4.  If the letter is correct, it will be revealed in the word display.
5.  If the letter is incorrect, you lose a life.
6.  The game ends when you guess the full word or run out of lives.

### Example Run
