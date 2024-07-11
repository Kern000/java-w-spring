

public class StringBuffer1 {
    public static void main(String a[]){

        StringBuffer sb1 = new StringBuffer(); //String buffer is mutable string
        System.out.println(sb1.capacity()); //default give buffer of 16 chrs

        StringBuffer sb2 = new StringBuffer("hello"); //String buffer gives a buffer size (extra memory allocated to handle additions to the string)
        System.out.println(sb2.capacity()); //becomes 21 after adding 5 characters
        System.out.println(sb2.length());
        // everytime change data, if it consumes a continuous memory location inside heap memory, and if there is no contigious memory location next, it will relocate - this reduce the relocate

        StringBuffer sb3 = new StringBuffer("hello");
        System.out.println(sb2 == sb3); //This is false, they have different memory address
                                        //== compare references of 2 objects
                                        //.equals() evaluates comparison of values in objects
        
        sb2.deleteCharAt(4);
        String str = sb2.toString(); // To get String need convert String buffer w toString();
        System.out.println(str);

        sb2.insert(4,"o"); //can insert where there is no index at yet
        sb2.append(" there");
        System.out.println(sb2);

        sb2.setLength(50); //add more buffer chr space behind it
        sb2.ensureCapacity(50); //min buffer

        // String buffer is thread safe, but String builder is not;
        // String buffer is more efficient if need to make alot of changes to the string - maintains an internal array for chars char[] - for immutable string, everytime want change, will create new object, so it can be costly in heap memory
        // string buffer auto expand capacity when exceed capacity, creating new array and discard old
        // methods in string buffer are thread safe, its methods are synchronized - multiple threads can safely modify a StringBuffer instance without data corruption;
        // modifications are made to the char array in String buffer
        // String builder is faster in single thread when thread safety not a concern
    }   
}



//public class Main {
    // public static void main(String[] args) {
    //     createStringBuffer();
    // }

    // public static void createStringBuffer() {
    //     StringBuffer sb = new StringBuffer("Hello, World!");
    //     System.out.println(sb);
    // }
// }

// When createStringBuffer is called, a new stack frame is created for this method call.
// Inside createStringBuffer, the reference variable sb is created on the stack.
// The StringBuffer object itself is created on the heap.
// The reference sb on the stack points to the StringBuffer object on the heap.

// ===== MEMORY AREAS OF JAVA =====

// Heap stores all instances of classes and objects;
// Heap stores instance variables;
// Heap stores arrays;
// Heap is managed by Garbage collector
// The heap is created on virtual machine start-up. 
// The Java Virtual Machine has a heap that is shared among all Java Virtual Machine threads. The heap is the run-time data area from which memory for all class instances and arrays is allocated.
// memory for heap does not need to be contiguous too;

// METHOD AREA: The Java Virtual Machine has a method area that is shared among all Java Virtual Machine threads.
// logically is part of the heap, but need not mandate location of method area
// It stores per-class structures such as the run-time constant pool, field and method data, and the code for methods and constructors, including the special methods (§2.9) used in class and instance initialization and interface initialization.
// This include init and some other forms of init;

// Run time Data Area: The Java Virtual Machine defines various run-time data areas that are used during execution of a program. Some of these data areas are created on Java Virtual Machine start-up and are destroyed only when the Java Virtual Machine exits. Other data areas are per thread. Per-thread data areas are created when a thread is created and destroyed when the thread exits.

// The run-time constant pool serves a function similar to that of a symbol table for a conventional programming language, although it contains a wider range of data than a typical symbol table.
// A run-time constant pool is a per-class or per-interface run-time representation of the constant_pool table in a class file
// Each run-time constant pool is allocated from the Java Virtual Machine's method area (§2.5.4). The run-time constant pool for a class or interface is constructed when the class or interface is created (§5.3) by the Java Virtual Machine.

// The pc Register: 
// The Java Virtual Machine can support many threads of execution at once (JLS §17). Each Java Virtual Machine thread has its own pc (program counter) register. 
// At any point, each Java Virtual Machine thread is executing the code of a single method, namely the current method (§2.6) for that thread. If that method is not native, the pc register contains the address of the Java Virtual Machine instruction currently being executed. If the method currently being executed by the thread is native, the value of the Java Virtual Machine's pc register is undefined.

// Stack: Each Java Virtual Machine thread has a private Java Virtual Machine stack, created at the same time as the thread. A Java Virtual Machine stack stores frames
// - holds local variables and partial results, and plays a part in method invocation and return. 
// Stack memory does not need to be contiguous
// Stack is manged by thread-specific and methods calling and return;
// Stack will add frames based on the methods called
// within frame, has local variable with say value of 5;
// within frame if local variable have reference address, it will refer to the heap memory, like in the case of String and Stringbuffer
// Stack frame will contain the return address to - where to go after method returned;
// One thread has one stack, but there is only one call stack for entire program;
// all threads in a process will share the heap;

// Native Method Stacks
// An implementation of the Java Virtual Machine may use conventional stacks, colloquially called "C stacks," to support native methods (methods written in a language other than the Java programming language). Native method stacks may also be used by the implementation of an interpreter for the Java Virtual Machine's instruction set in a language such as C. 
// If supplied, native method stacks are typically allocated per thread when each thread is created.

// A frame is used to store data and partial results, as well as to perform dynamic linking, return values for methods, and dispatch exceptions.
// A new frame is created each time a method is invoked. A frame is destroyed when its method invocation completes, whether that completion is normal or abrupt (it throws an uncaught exception).
// Each frame has its own array of local variables (§2.6.1), its own operand stack (§2.6.2), and a reference to the run-time constant pool (§2.5.5) of the class of the current method.
// Only one frame, the frame for the executing method, is active at any point in a given thread of control. This frame is referred to as the current frame, and its method is known as the current method. 
// A frame ceases to be current if its method invokes another method or if its method completes. When a method is invoked, a new frame is created and becomes current when control transfers to the new method. 

// A single local variable can hold a value of type boolean, byte, char, short, int, float, reference, or returnAddress.
// Local variables are addressed by indexing. The index of the first local variable is zero. An integer is considered to be an index into the local variable array if and only if that integer is between zero and one less than the size of the local variable array.
// A value of type long or type double occupies two consecutive local variables. 
// a value of type double stored in the local variable array at index n actually occupies the local variables with indices n and n+1; however, the local variable at index n+1 cannot be loaded from
// The Java Virtual Machine uses local variables to pass parameters on method invocation. On class method invocation, any parameters are passed in consecutive local variables starting from local variable 0. 

// Operand Stacks
// Each frame (§2.6) contains a last-in-first-out (LIFO) stack known as its operand stack.
// JVM stack contains frames, and each frame contains its own stack used to do its expression evaluation
// The operand stack is empty when the frame that contains it is created. The Java Virtual Machine supplies instructions to load constants or values from local variables or fields onto the operand stack. Other Java Virtual Machine instructions take operands from the operand stack, operate on them, and push the result back onto the operand stack. 
// The operand stack is also used to prepare parameters to be passed to methods and to receive method results.

// Dynamic Linking
// Each frame (§2.6) contains a reference to the run-time constant pool (§2.5.5) for the type of the current method to support dynamic linking of the method code. The class file code for a method refers to methods to be invoked and variables to be accessed via symbolic references. 
// loading classes as necessary to resolve as-yet-undefined symbols

// 2.11.2. Load and Store Instructions
// This may be good for reading error stack from exceptions;

// Synchronized method
// A synchronized method is distinguished in the run-time constant pool's method_info structure (§4.6) by the ACC_SYNCHRONIZED flag
// When invoking a method for which ACC_SYNCHRONIZED is set, the executing thread enters a monitor, invokes the method itself, and exits the monitor whether the method invocation completes normally or abruptly. During the time the executing thread owns the monitor, no other thread may enter it. 
// Structured locking is the situation when, during a method invocation, every exit on a given monitor matches a preceding entry on that monitor.
// At no point during a method invocation may the number of monitor exits performed by T on M since the method invocation exceed the number of monitor entries performed by T on M since the method invocation.

// Classes that might require special support from the Java Virtual Machine include those that support:
// one of them is Loading and creation of a class or interface. The most obvious example is the class ClassLoader.











