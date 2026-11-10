# Palindrome Checker App

A small Java console application that checks whether a word, number, or phrase reads the same forward and backward.

## Features

- Checks words, numbers, and phrases
- Ignores letter case, spaces, and punctuation
- Supports Unicode letters and digits
- Handles empty and punctuation-only input with a clear message
- Reusable palindrome logic separated from console input/output
- Dependency-free edge-case tests
- GitHub Actions CI using Java 17

## Tech Stack

- Java 17
- String processing and two-pointer algorithm
- Dependency-free Java test runner
- GitHub Actions

## Project Structure

```text
Palindrome_Checker_App/
├── App/
│   ├── src/
│   │   ├── Main.java
│   │   └── PalindromeChecker.java
│   └── test/
│       └── PalindromeCheckerTest.java
└── .github/workflows/java-tests.yml
```

## Run

From the repository root:

```bash
mkdir -p build
javac -d build App/src/*.java
java -cp build Main
```

Enter a word or phrase when prompted. For example, `A man, a plan, a canal: Panama!` is treated as a palindrome.

## Run Tests

```bash
mkdir -p build
javac -d build App/src/*.java App/test/*.java
java -cp build PalindromeCheckerTest
```

GitHub Actions compiles the application and runs the test suite on pushes and pull requests targeting `main`.

## How It Works

`PalindromeChecker.normalize()` removes characters other than Unicode letters and digits and converts the remaining text to lowercase. `isPalindrome()` then compares characters from the two ends, moving toward the centre. This takes linear time and uses linear space for normalization.

## Edge Cases Covered

- Empty and punctuation-only strings
- Single characters
- Mixed uppercase and lowercase
- Spaces and punctuation
- Numeric strings
- Non-palindromic words and numbers
- Null input validation
