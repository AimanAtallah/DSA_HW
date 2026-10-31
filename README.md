# Data Structures & Algorithms — Homework

Java exercises that put stacks, queues, generics, and iteration into practice.

**Java · Generics · Iterators · Data structures**

---

## Exercises

| Class | Focus |
| --- | --- |
| `stack.GenericStack<E>` | Linked stack with push, pop, iteration, and membership lookup |
| `queue.GenericQueue<E>` | Linked queue with enqueue, dequeue, iteration, and membership lookup |
| `stack.ReverseStrings` | Reverses a string using a stack of characters |
| `queue.QueuesUsingStacks` | Explores queue operations using two stacks |
| `client.Homework2Client` | Console driver for the homework examples |

## Compile and run

Requires a JDK with `javac` and `java` available.

```sh
git clone https://github.com/AimanAtallah/DSA_HW.git
cd DSA_HW
mkdir -p out
javac -d out src/stack/*.java src/queue/*.java src/client/*.java
java -cp out stack.ReverseStrings
java -cp out client.Homework2Client
```

The string-reversal demo uses `hello` and prints:

```text
olleh
```

## Project layout

```text
src/
├── client/  # Homework driver
├── queue/   # Queue implementations
└── stack/   # Generic stack and string reversal
```

## Status

These are coursework implementations with areas still being refined. `QueuesUsingStacks` currently initializes its internal stacks with values, while `peek()` and `printStack()` refer to a separate node field. Those methods do not yet consistently represent the two-stack queue. `GenericQueue.dequeue()` also returns a node rather than its stored value.

The repository preserves the exercises as written; the console drivers are not a full test suite.
