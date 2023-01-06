package Record.Example3;

public record Customer(long id, String name, String email) {

    @Override
    public String name(){
        return name != null && !name.isBlank() ? name : "anonymous";
    }

    // Rules for overriding accessors' method:
    // - return type needs to be the same as the type of component
    // - Accessor methods cannot have a 'throws' clause
}
