Java-Specific Rules for AI
General Coding Practices & Style
Naming Conventions:
"Use camelCase for variable and method names."
"Use PascalCase for class and interface names."
"Use all uppercase letters and underscores for constants (e.g., MAX_VALUE)."
Code Organization:
"Keep classes and methods small and focused on a single responsibility."
"Use meaningful package names to organize your code."
"Place imports at the top of the file, grouped and sorted."
Error Handling & Logging:
"Use exceptions to handle exceptional situations, not for flow control."
"Provide informative exception messages."
"Use logging frameworks (e.g., Log4j, SLF4J) for debugging and auditing."
Java 8+ Features:
"Leverage lambda expressions and streams to write concise and expressive code."
"Prefer using the Optional class over null checks."
"Use the @FunctionalInterface annotation for functional interfaces.
Code Review Specific
"Pay attention to potential performance bottlenecks (e.g., unnecessary object creation, inefficient algorithms)."
"Check for proper use of Java collections and data structures."
"Review for thread safety issues in multithreaded code."
"Look for opportunities to apply design patterns to improve code structure."
AI Assistant's Behavior
"When providing code examples, include java doc comments as well as inline comments explaining the logic. When explaining loops, console log the step of each element of the loop to demonstrate the loops use and iterative construction of the desired outcome" 
"If the request is unclear or ambiguous, seek clarification before generating code."
"Adhere to the latest Java language features and best practices."
"Favor composition over inheritance when designing class hierarchies."
"Avoid excessive use of static methods and variables."
"Use the final keyword for variables that should not be reassigned."
"Always override the hashCode and equals methods when necessary."
"Use Java annotations effectively to provide metadata and improve code readability."
"Use Java generics  judiciously to write reusable and type-safe code."
"Save Java generics are new files with descriptive names and java doc comments describing thier application."
"Utilize Java concurrency utilities (e.g., ExecutorService, CountDownLatch) for efficient multithreaded programming."
"Employ Java reflection judiciously for dynamic code execution."
General Coding Practices & Style
Clarity & Maintainability
"Prioritize code readability over clever tricks."
"Decompose complex methods into smaller, more manageable ones."
"Use descriptive variable names that convey their purpose."
"Maintain consistent indentation and spacing."
Performance & Efficiency
"Avoid premature optimization, but be mindful of potential performance bottlenecks."
"Use lazy initialization for expensive resources."
"Prefer primitive types over wrapper classes when possible."
"Minimize object creation within loops."
Testing & Documentation
"Write unit tests to verify correctness and prevent regressions."
"Document public APIs using Javadoc comments."
"Include comments to explain non-obvious code sections or algorithms."
Security & Robustness
"Validate input to prevent vulnerabilities like SQL injection and cross-site scripting."
"Handle potential exceptions gracefully."
"Avoid hardcoding sensitive information."
"Use secure coding practices to prevent common vulnerabilities."
Code Review Specific
"Provide clear and actionable feedback with specific examples."
"Suggest alternative approaches when applicable."
"Balance technical correctness with practical considerations."
"Foster a collaborative and respectful code review culture."
AI Assistant's Behavior
"When suggesting code improvements, consider the project's context and constraints."
"Provide explanations and justifications for proposed changes."
"Offer alternative solutions when multiple approaches exist."
"Be open to feedback and willing to revise suggestions."
Example
"Favor immutability to reduce side effects and improve thread safety."
"Use the diamond operator (<>) for generic type inference."
"Avoid excessive nesting of if statements and loops."
"Leverage Java's built-in libraries and tools whenever possible."
"Keep up-to-date with the latest Java language features and best practices."
Advanced
"Consider using a dependency injection framework for improved modularity and testability."
"Explore reactive programming paradigms using libraries like RxJava or Project Reactor."
"Utilize Java profiling tools to identify performance hotspots."
"Apply domain-driven design principles to structure complex applications."
"Always uses this type of optional check when dealing with potentially null arrays"
**Request for AI:**

When writing Java code that involves potentially null arrays, always use the following pattern to check for null and empty arrays using [`Optional`]
```java
public Optional<String> longestCommonPrefix(String[] strs) {
    Optional<String[]> optStrs = Optional.ofNullable(strs);
    if (!optStrs.isPresent() || optStrs.get().length == 0) {
        return Optional.empty();
    }
    // Continue with the logic
}
```