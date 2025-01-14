import java.util.concurrent.locks.Lock;
 import java.util.concurrent.locks.ReentrantLock;

// This class simulates a situation where only one ATM machine is available and
 // and five people are waiting to access the machine. Since only one person can
 // access an ATM machine at a given time, others wait for their turn

public class ATMMachineSimulationWithReentrantLock
	{

    public static void main(String[] args) {
         // Here the ATM machine is shared resource
         // among multiple persons so we'll
         // represent "atm machine" using "reentrant lock"
         Lock atmMachine = new ReentrantLock();

        // list of people waiting to access the machine
         new Person(atmMachine, "John");
         new Person(atmMachine, "Mike");
         new Person(atmMachine, "Thomas");
         new Person(atmMachine, "Merry");
         new Person(atmMachine, "Natasha");
     }
 }

// Each Person is an independent thread,
 // their access to the common resource (the ATM machine in this case)
 // needs to be synchronized using a lock
 class Person extends Thread {
     private Lock atmMachine;

    public Person(Lock machine, String name) {
         this.atmMachine = machine;
         this.setName(name);
         this.start();
     }

    public void run() {
         try {
             System.out.println(getName() + " waiting to access an ATM machine");
             atmMachine.lock();

            // Critical region : start
             System.out.println(getName() + " is accessing an ATM machine");
             // simulate the time required for withdrawing amount
             Thread.sleep(1000);
             // Critical region : end

        } catch (InterruptedException ie) {
             System.err.println(ie);
         } finally {
             atmMachine.unlock();
         }
     }
 }
 // Output:
 // John waiting to access an ATM machine
 // Natasha waiting to access an ATM machine
 // Merry waiting to access an ATM machine
 // Thomas waiting to access an ATM machine
 // Mike waiting to access an ATM machine
 // John is accessing an ATM machine
 // Natasha is accessing an ATM machine
 // Merry is accessing an ATM machine
 // Thomas is accessing an ATM machine
 // Mike is accessing an ATM machine
