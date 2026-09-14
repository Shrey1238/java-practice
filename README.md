# java-practice

Self-checking Java exercises for weeks 1–3 of the study plan. Every exercise is a
method stub that throws `UnsupportedOperationException("TODO")`; a JUnit test tells
you when you've got it right.

## Setup (once)

1. Install a JDK 17 or newer — [Adoptium Temurin](https://adoptium.net/) is the easy choice.
   Check with `java -version`.
2. Install [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/) (free).
3. Clone this repo and open the folder in IntelliJ. It will detect `pom.xml` and download
   JUnit automatically (this needs internet the first time).

You do **not** need to install Maven — `./mvnw` (Mac/Linux) or `mvnw.cmd` (Windows) downloads it for you.

## Running the tests

From the terminal, in the repo folder:

```bash
./mvnw test                          # run everything
./mvnw test -Dtest=BasicsTest        # run one file
./mvnw test -Dtest=BasicsTest#sum    # run one test method
```

On Windows use `mvnw.cmd` instead of `./mvnw`.

In IntelliJ: open a test file, click the green ▶ next to the class or a single method.
**Use the debugger** (the bug icon) when a test fails and you don't know why — set a
breakpoint in your method and step through it line by line.

## The exercises

| Week | File | Topic | Tests |
|------|------|-------|-------|
| 1 | `week1/Basics.java` | primitives, `if`, loops, methods, arrays | `BasicsTest` |
| 1 | `week1/Strings.java` | `String` methods, `StringBuilder`, `char` | `StringsTest` |
| 2 | `week2/Collections.java` | `ArrayList`, `HashMap`, `HashSet`, two pointers | `CollectionsTest` |
| 3 | `week3/BankAccount.java` | writing a class, encapsulation, checked exceptions | `BankAccountTest` |
| 3 | `week3/Student.java` | `equals`/`hashCode`/`compareTo`/`toString` | `StudentTest` |
| 3 | `week3/Gradebook.java` | a class that manages a list of objects | `GradebookTest` |

Source is in `src/main/java/practice/`, tests are in `src/test/java/practice/`.

Do them in order. Each file's Javadoc explains the rules and gives hints. Read the test
file too — it's the exact spec of what your code has to do, and reading tests is a real
professional skill.

## How to work

1. Pick the next method. Read its Javadoc and the matching test.
2. Write it. **Type it yourself** — no copy/paste, no AI autocomplete for these.
3. Run just that test. Red? Debug it. Green? Move on.
4. When a whole file is green, `git add`, `git commit -m "week1: Basics done"`, `git push`.
   Committing your progress is part of the exercise.
5. Got stuck for 25+ minutes? Look at the `solutions` branch on GitHub
   (`git diff main solutions -- src/main/java/practice/week1/Basics.java`), understand it,
   close it, and rewrite from memory the next day.

## Progress

Tick these off as you go:

- [ ] Week 1 — `Basics` all green
- [ ] Week 1 — `Strings` all green
- [ ] Week 2 — `Collections` all green (then rewrite `hasPairWithSum` the O(n) way if you didn't)
- [ ] Week 3 — `BankAccount` all green
- [ ] Week 3 — `Student` all green
- [ ] Week 3 — `Gradebook` all green
- [ ] Bonus: write **one new test** of your own in each test file that you think the existing tests miss

## Bugs log

Keep a running list here of every bug that cost you more than 20 minutes and what the
real cause was. After a few weeks you'll notice patterns — that's the highest-value
studying you can do.

| Date | What I saw | Actual cause |
|------|------------|--------------|
| | | |
