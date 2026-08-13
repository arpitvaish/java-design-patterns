# Java Design Patterns

Clean, runnable implementations of the **17 core Gang-of-Four design patterns** in Java. Each pattern folder contains:

- 💻 **Runnable code** in `src/` — clone it, compile it, run the `Demo`
- 🧩 A **class / ER diagram** (Mermaid) with the relationships explained in plain English

No frameworks, no build tool required — just a JDK (Java 11+).

---

## How to run any example

```bash
# run a single pattern
./run.sh 01-singleton-pattern

# run all of them, one after another
./run.sh
```

Or by hand:

```bash
cd patterns/01-singleton-pattern/src
javac *.java
java Demo
```

---

## The patterns

### Creational — *how objects get made*

| # | Pattern | One-line idea |
|---|---------|---------------|
| 01 | [Singleton](patterns/01-singleton-pattern/) | Exactly one instance, shared everywhere |
| 02 | [Factory Method](patterns/02-factory-pattern/) | Ask a factory for an object instead of `new` |
| 03 | [Abstract Factory](patterns/03-abstract-factory-pattern/) | A factory of matching factories (product families) |
| 04 | [Builder](patterns/04-builder-pattern/) | Build complex objects step by step |
| 05 | [Prototype](patterns/05-prototype-pattern/) | Clone an existing object instead of rebuilding it |

### Structural — *how objects are wired together*

| # | Pattern | One-line idea |
|---|---------|---------------|
| 06 | [Adapter](patterns/06-adapter-pattern/) | Make an incompatible interface fit |
| 07 | [Decorator](patterns/07-decorator-pattern/) | Add behavior by wrapping, not subclassing |
| 08 | [Facade](patterns/08-facade-pattern/) | One simple door in front of a messy subsystem |
| 09 | [Proxy](patterns/09-proxy-pattern/) | A stand-in that controls access to the real object |
| 10 | [Composite](patterns/10-composite-pattern/) | Treat a tree of objects like a single object |

### Behavioral — *how objects talk and share responsibility*

| # | Pattern | One-line idea |
|---|---------|---------------|
| 11 | [Observer](patterns/11-observer-pattern/) | Notify subscribers when something changes |
| 12 | [Strategy](patterns/12-strategy-pattern/) | Swap an algorithm at runtime |
| 13 | [Command](patterns/13-command-pattern/) | Wrap a request as an object (undo, queue, log) |
| 14 | [Iterator](patterns/14-iterator-pattern/) | Walk a collection without exposing its guts |
| 15 | [State](patterns/15-state-pattern/) | Change behavior when internal state changes |
| 16 | [Template Method](patterns/16-template-method-pattern/) | Fix the skeleton, let subclasses fill steps |
| 17 | [Chain of Responsibility](patterns/17-chain-of-responsibility-pattern/) | Pass a request down a chain of handlers |

---

## What's inside each folder

```
patterns/01-singleton-pattern/
├── README.md   # class/ER diagram + relationships explained
└── src/        # runnable Java: the pattern + a Demo.java with main()
```

---

## License

MIT — see [LICENSE](LICENSE).
