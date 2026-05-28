# 1st Semester Exam Assignment – Datamatiker (Computer Science)

## Overview

This repository contains one of five programming assignments that formed the basis of the 1st semester examination in the Datamatiker (Computer Science) program.

All five assignments were handed out in advance and prepared independently. On the day of the exam, a single assignment was drawn at random and formed the basis of the oral examination.

The examination consisted of:
- Code walkthrough and explanation
- Technical questions
- Minor code adjustments and problem solving during the examination

This repository represents the solution as it existed at the time of the exam.

---

## Educational Context

- **Program:** Datamatiker (Computer Science, Academy Profession Degree)
- **Semester:** 1st semester
- **Institution:** Cphbusiness (EK – Erhvervsakademi København, as of mid-2025)
- **Exam Type:** Individual practical programming exam with oral presentation
- **Language:** Java (object-oriented)

- **Completed:** Summer 2025, without the use of AI tools

---

## Experience Level at the Time

At the time this assignment was developed:
- I had been programming for under six months
- I had no prior programming experience before starting the Datamatiker program

The focus of the work was on:
- Fundamental programming concepts
- Problem solving
- Code structure and readability
- Demonstrating understanding under examination conditions

The code has been left unchanged to reflect the level and approach at that point in time.

---

## Assignment Description

### Dansk (original)

**Brugere**

I dette program skal du lave en klasse `User`, som repræsenterer en bruger i et system. Vi kan have flere eller færre oplysninger om brugeren, og derfor skal du overloade konstruktøren, dvs. have flere versioner af den, med forskellige parameterlister.

1. Lav en klasse `User`
   - Giv klassen attributterne `name`, `password`, `email` og `phoneNumber` med passende datatyper
   - Giv klassen en konstruktør, der tager `name` og `password` som parameter
   - Giv klassen en konstruktør, der tager `name`, `password` og `email` som parameter
   - Giv klassen en konstruktør, der tager `name`, `password`, `email` og `phoneNumber` som parameter
2. Giv klassen getter- og setter-metoder for alle attributter
3. Giv klassen en `toString`-metode, som printer de attributter, der har fået værdi (det vil sige, at metoden fx ikke skal printe "email: null" hvis email ikke har fået en værdi).
4. Lav en klasse `Main` med en main-metode, hvor du opretter et antal User-objekter ved at bruge de forskellige konstruktører. Lav nogle udprint med `System.out.println()` som viser, at `toString()`-metoden fungerer efter hensigten.
5. Lav noget validering på det navn som et User-objekt bliver oprettet med: Navnet skal starte med stort bogstav og være maks 12 karakterer langt.
6. Lav validering af email: skal indeholde '@'.
7. Lav en liste hvor brugerne er sorteret alfabetisk. Udskriv den sorterede liste.

---

### English (translation)

**Users**

In this program you must create a class `User` that represents a user in a system. We may have more or less information about a user, so you must overload the constructor — that is, have multiple versions of it with different parameter lists.

1. Create a class `User`
   - Give the class the attributes `name`, `password`, `email`, and `phoneNumber` with appropriate data types
   - Give the class a constructor that takes `name` and `password` as parameters
   - Give the class a constructor that takes `name`, `password`, and `email` as parameters
   - Give the class a constructor that takes `name`, `password`, `email`, and `phoneNumber` as parameters
2. Give the class getter and setter methods for all attributes
3. Give the class a `toString` method that prints only the attributes that have been assigned a value (i.e. the method should not print "email: null" if email has not been set)
4. Create a `Main` class with a main method in which you create a number of `User` objects using the different constructors. Add some print statements using `System.out.println()` to demonstrate that the `toString()` method works as intended.
5. Add validation for the name that a `User` object is created with: the name must start with an uppercase letter and be at most 12 characters long.
6. Add validation for email: it must contain '@'.
7. Create a list where the users are sorted alphabetically. Print the sorted list.

---

## License

This project is licensed under the MIT License – see the [LICENSE](./LICENSE) file for details.
