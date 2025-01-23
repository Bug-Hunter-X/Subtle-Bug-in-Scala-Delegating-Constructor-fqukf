```scala
class MyClass(val x: Int) {
  def this() = {
    this(0)  // Delegate to primary constructor
  }
  def useX(): Int = {
    // Now x is always properly initialized
     x * 2 
  }
  // ... other methods ...
}
```
This approach ensures that `x` is always initialized to 0 before any other methods attempt to access it.  Consider refactoring your code to explicitly handle the initialization of any parameters before accessing them within the class.