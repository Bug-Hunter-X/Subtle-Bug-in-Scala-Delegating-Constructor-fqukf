# Subtle Bug in Scala Delegating Constructor

This repository demonstrates a subtle bug that can occur in Scala when using delegating constructors.  The bug arises from accessing constructor parameters within methods before they are fully initialized by the delegating constructor.

## The Bug
The `BuggyDelegatingConstructor.scala` file contains a class with a delegating constructor.  Methods within the class access the constructor parameter `x` before the delegating constructor has completed its execution, leading to unexpected behavior.

## The Solution
The `FixedDelegatingConstructor.scala` file shows the corrected code. The solution involves ensuring all accesses to `x` happen after the delegating constructor has fully initialized the parameter.