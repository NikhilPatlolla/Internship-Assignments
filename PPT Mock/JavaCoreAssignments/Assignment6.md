**Q1. What is Collection in Java?**

In Java, the Collection is a framework that provides a set of classes and interfaces to store, manipulate, and process a group of objects. It represents a single unit of objects and is used to perform various operations such as searching, sorting, insertion, deletion, and manipulation of elements.

**Q2. Differentiate between Collection and collections in the context of Java.**

- Collection (with a capital "C") is an interface in the Java Collections Framework that represents a group of objects. It provides a common set of methods to work with collections.
- collections (with a lowercase "c") refers to the general concept of groups or containers that hold multiple objects.

**Q3. What are the advantages of the Collection framework?**

The Collection framework in Java provides several advantages, including:

- Reusability: The Collection framework provides a set of reusable classes and interfaces that can be used to store and manipulate objects in a standardized way.
- Extensibility: It allows developers to create their own collection classes by implementing the provided interfaces.
- Interoperability: The framework allows collections to be easily integrated and used with other APIs and libraries in Java.
- Increased productivity: With built-in data structures and algorithms, the Collection framework simplifies common operations such as searching, sorting, and iteration.
- Type-safety: The framework provides type-safety through generics, allowing compile-time type checking to prevent type-related errors.

**Q4. Explain the various interfaces used in the Collection framework.**

The Collection framework in Java includes several interfaces, such as:

- Collection: It is the root interface that defines the basic methods common to all collection objects, such as adding, removing, and iterating over elements.
- List: It is an ordered collection that allows duplicate elements. It provides methods to access elements by index and perform operations like adding, removing, and searching.
- Set: It is a collection that does not allow duplicate elements. It provides methods to add, remove, and check the presence of elements.
- Queue: It is a collection that represents a waiting line where elements are inserted at one end and removed from another end.
- Map: It is an object that maps keys to values. It does not inherit from the Collection interface but is an important part of the Collection framework.

**Q5. Differentiate between List and Set in Java.**

- List: It is an ordered collection that allows duplicate elements. Elements in a List are stored in a specific order and can be accessed by their index. Examples of List implementations include ArrayList, LinkedList, and Vector.

- Set: It is an unordered collection that does not allow duplicate elements. It guarantees that each element is unique. Examples of Set implementations include HashSet, TreeSet, and LinkedHashSet.

**Q6. What is the Differentiate between Iterator and ListIterator in Java.**

- Iterator: It is an interface that provides a way to iterate over a collection in a forward direction. It allows sequential access to the elements of a collection and provides methods like `hasNext()` to check if there are more elements and `next()` to retrieve the next element.

- ListIterator: It is a sub-interface of Iterator that provides additional functionality specific to List implementations. In addition to the methods provided by Iterator, ListIterator allows bidirectional traversal of a List and enables modification of elements using methods like `previous()` and `set()`.

**Q7. What is the Differentiate between Comparable and Comparator?**

- Comparable: It is an interface that defines a natural ordering for a class. It allows objects of a class to be compared and sorted based on their natural order. The `compareTo()` method is implemented in the class itself to define the comparison logic.

- Comparator: It is an interface that provides a way to compare and sort objects based on custom comparison logic. It allows sorting objects that do not implement the Comparable interface or for situations where multiple sorting orders are required. The comparison logic is defined in a separate class by implementing the `compare()` method.

**Q8. What is a collision in HashMap?**

In HashMap, a collision occurs when two or more keys are mapped to the same index in the underlying array of buckets. It happens because the hash function used to calculate the index may produce the same hash code for different keys. When a collision occurs, the elements with the same hash code are stored in a linked list or a tree structure called a collision chain. During retrieval, the appropriate element is found by iterating through the collision chain.

**Q9. Distinguish between a HashMap and a TreeMap.**

- HashMap: It is an implementation of the Map interface that stores key-value pairs. It uses a hash table data structure to store elements and provides constant-time performance for basic operations like insertion, retrieval, and deletion. HashMap does not maintain any particular order of the keys.

- TreeMap: It is an implementation of the SortedMap interface that stores key-value pairs. It uses a Red-Black tree data structure to store elements and maintains the keys in sorted order. TreeMap provides guaranteed logarithmic-time performance for basic operations and allows iteration over the keys in a sorted order.

**Q10. Define LinkedHashMap in Java.**

LinkedHashMap is an implementation of the Map interface that extends the HashMap class. It maintains the insertion order of the elements based on their order of addition. It is similar to HashMap in terms of constant-time performance for basic operations but provides additional methods to support iteration in the insertion order. LinkedHashMap also allows null keys and values.