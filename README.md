# Groovy NullPointerException Example

This repository demonstrates a common issue in Groovy related to null pointer exceptions. The problem arises from the dynamic typing of the language and the potential for methods returning null without explicit null checks in the calling code.  The example shows how to avoid this pitfall and ensure robust code.

## Bug Report

The `bug.groovy` file contains a Groovy method that returns `null` when one of the input parameters is `null`. This behavior is fine, but the caller needs to account for the possibility of a null return value. Failure to do so leads to a `NullPointerException` when the caller tries to call methods on the returned value.

## Solution

The `bugSolution.groovy` file shows a corrected version of the method and demonstrates how to handle the null return value gracefully.  It emphasizes the importance of explicit null checks to prevent unexpected exceptions.
