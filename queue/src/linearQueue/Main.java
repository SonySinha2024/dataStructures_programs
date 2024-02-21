package linearQueue;



	public class Main {
	    public static void main(String[] args) {
	        PersonQueue personQueue = new PersonQueue();

	        // Enqueue some persons
	        personQueue.enqueue(new Person("Alice", 25));
	        personQueue.enqueue(new Person("Bob", 30));
	        personQueue.enqueue(new Person("Charlie", 22));
	        
	     // Print the list of added persons
	        personQueue.printPersons();

	        // Dequeue and print
	        System.out.println("Dequeue: " + personQueue.dequeue().name);

	        // Peek and print
	        System.out.println("Peek: " + personQueue.peek().name);

	        // Check if empty
	        System.out.println("Is Empty: " + personQueue.isEmpty());

	        // Print size
	        System.out.println("Size: " + personQueue.size());

	        // Sort by age in descending order
	        personQueue.sortAgeDescending();
	        
	     

	        // Print the sorted list of persons
	        personQueue.printPersons();

	        // Search by name
	        Person person = personQueue.searchByName("Bob");
	        if (person != null) {
	            System.out.println("Person found: " + person.name + ", Age: " + person.age);
	        } else {
	            System.out.println("Person not found");
	        }
	    }
	}
