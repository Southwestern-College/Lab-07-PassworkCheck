# Lab 07: Password Check

## Program Description
Write a Java method to check whether a string is a valid password.

### Password Rules:
- A password must have **at least 8 characters** and **at most 32 characters**.
- A password consists of **only letters, digits**, and the following **special characters**:
  - `! " # $ % & ' ( ) * + , - . /`
  - *(Note: These characters have consecutive ASCII values.)*
- A valid password must contain:
  - At least one lowercase letter
  - At least one uppercase letter
  - At least one digit
  - At least one special character
  - *No characters other than those mentioned above*
  - If a password does not meet these conditions, it is **not valid**.

## Program Specifications
Given the [PasswordCheck](PasswordCheck.java) class, complete the following methods:
- `isUpperCase(char ch)`: Returns true if the argument is an uppercase character, otherwise returns false.
- `isLowerCase(char ch)`: Returns true if the argument is a lowercase character, otherwise returns false.
- `isDigit(char ch)`: Returns true if the argument is a digit, otherwise returns false.
- `isSpecialCharacter(char ch)`: Returns true if the argument is a valid special character, otherwise returns false.
- `isValidPassword(String password)`: Returns true if the argument is a valid password, otherwise returns false.
  - `isValidPassword` must print an error message for each password rule that has been violated.
  - In Java, `System.err` is used for outputting error messages and diagnostic information.
 
Adhere to all coding standards and test your code before submitting.

## CODING STANDARDS
- Use meaningful identifiers and follow Java naming conventions.
- Remove all auto-generated comments and unused code.
- Document code using [JavaDoc](https://www.baeldung.com/javadoc), including:
   - Program/class description
   - Attribution using the `@author` tag.
- Comment only when necessary.
- Format code cleanly and consistently
   - Proper indentation
   - Brace alignment
   - Whitespace for readability
- Ensure prompts and output are clear and properly formatted.
