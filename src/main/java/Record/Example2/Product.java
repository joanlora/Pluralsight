package Record.Example2;

public record Product(long id, String name, String description) {
    /*
    The compiler translates this to a final class
    with private final fields for the components

    The compiler generates a constructor that initalizes the fields

    The compiler generates accessor methods automatically for you
     */

    // Instance fields are not allowed
    // Static fields are allowed
    private static int VALUE = 23;
    public boolean hasDescription(){
        return description != null && !description.isBlank();
    }
}
