# Ziro Programming Language

![Work in Progress](https://img.shields.io/badge/status-in%20progress-orange) ![License](https://img.shields.io/badge/license-MIT-blue)

Ziro is a hobby project aimed at exploring the concepts behind programming language development. This is a simple interpreter for learning and experimentation, not intended for production use.

---

## Project Overview
Ziro is designed to prioritize simplicity and flexibility. The current implementation focuses on building a basic interpreter capable of tokenizing, parsing, and evaluating user input or scripts. The project is in its early stages, with a focus on foundational elements such as lexical analysis, token management, and an Abstract Syntax Tree (AST) representation.

---

## Project Structure

### Main Class
The `Main` class serves as the entry point for the Ziro interpreter. It handles file-based script execution and an interactive prompt for real-time user input. Key functionalities include:
- **Run File**: Reads and executes a Ziro script from a file.
- **Run Prompt**: Provides a REPL (Read-Eval-Print Loop) for live testing and development.

### Scanner
The `Scanner` class is responsible for lexical analysis. It processes the source code into a series of tokens, which are categorized using the `Token` class. Tokens represent the smallest meaningful units of the language, such as keywords, literals, and operators.

### Token
The `Token` class defines the structure of a token. It includes:
- **Type**: The category of the token (e.g., identifier, keyword, operator).
- **Lexeme**: The textual representation of the token.
- **Literal**: The literal value (if applicable).
- **Line**: The line number where the token appears.

### Abstract Syntax Tree (AST)
The AST represents the hierarchical structure of parsed expressions. Key components include:
- **Expr**: The base interface for all expressions.
- **AstPrinter**: A visitor implementation for printing ASTs in a human-readable format. It supports binary, grouping, literal, and unary expressions.

---

## Features Implemented
1. **Interactive Prompt**: Users can type expressions or commands directly into the terminal for immediate feedback.
2. **File Execution**: Scripts can be saved in files and executed via command-line arguments.
3. **Tokenization**: Converts source code into tokens for further processing.
4. **AST Representation**: Parses tokens into an AST and provides a printable representation of expressions.

---

## Usage
Run the interpreter using the following commands:

### Interactive Mode
```bash
java Main
```
This launches a REPL where you can type Ziro expressions interactively.

### Script Mode
```bash
java Main <script_file>
```
Replace `<script_file>` with the path to a Ziro script to execute.

---

## Example Input
### Interactive Prompt Example:
```plaintext
> 1 + 2 * (3 - 4)
(Binary (Unary - Literal 4) (Binary Literal 2 Literal 3))
```

### Script File Example:
Contents of `example.zir`:
```plaintext
print 42;
```
Execution:
```bash
java Main example.zir
Output: 42
```

---

## Future Plans
- Implement parsing logic to convert tokens into an AST.
- Add an interpreter to evaluate AST nodes.
- Introduce error handling for syntax and runtime errors.
- Extend language features, including variables, control flow, and functions.

---

## Contributions
This project is intended as a learning experience. Contributions are welcome, but the focus is on understanding and exploring programming language concepts. If you’re interested in collaborating, feel free to submit pull requests or raise issues on the project's repository.

---

*This documentation will evolve as the project progresses.*

