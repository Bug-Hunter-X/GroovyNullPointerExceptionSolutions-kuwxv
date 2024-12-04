```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null //This will cause issues when calling methods on the result
  }
  // ... rest of the method
}

println myMethod(null, 5).toString()
```