public class MethodDemo {
    public static void main(String[] args) {
        // Calling the greet method
        greet();  
        
        // Calling the printMessage method with a string parameter
        printMessage("This is my message!");  
    }
    
    // Method to greet
    public static void greet() {
        System.out.println("Hello from the greet method!"); 
    }

    // Method to print a message passed as a parameter
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
