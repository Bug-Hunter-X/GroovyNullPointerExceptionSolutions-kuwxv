```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Or throw an exception, or return a default object
  }
  return a + b
}

println myMethod(null, 5)
println myMethod(5, 10)

//Alternative approach using the elvis operator
println myMethod(null, 5) ?: 0 // Returns 0 if myMethod returns null
```