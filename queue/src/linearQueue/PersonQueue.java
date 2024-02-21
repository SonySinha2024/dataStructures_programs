//package linearQueue;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//class PersonQueue {
//    private Queue<Person> queue;
//
//    public PersonQueue() {
//        this.queue = new LinkedList<>();
//    }
//
//    public void enqueue(Person person) {
//        queue.offer(person);
//    }
//
//    public Person dequeue() {
//        return queue.poll();
//    }
//
//    public Person peek() {
//        return queue.peek();
//    }
//
//    public boolean isEmpty() {
//        return queue.isEmpty();
//    }
//
//    public int size() {
//        return queue.size();
//    }
//
//    public void sortAgeDescending() {
//        // Sorting the queue by age in descending order
//        queue.stream()
//             .sorted((p1, p2) -> Integer.compare(p2.age, p1.age))
//             .forEachOrdered(queue::add);
//
////        // Removing the original unsorted elements
////        int originalSize = queue.size();
////        for (int i = 0; i < originalSize; i++) {
////            queue.poll();
////        }
//    }
//
//    public Person searchByName(String name) {
//        for (Person person : queue) {
//            if (person.name.equals(name)) {
//                return person;
//            }
//        }
//        return null; // Person not found
//    }
//    
//    public void printPersons() {
//        System.out.println("List of Persons:");
//        for (Person person : queue) {
//            System.out.println("Name: " + person.name + ", Age: " + person.age);
//        }
//        System.out.println();
//    }
//}