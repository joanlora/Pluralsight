package Record.Example4;

public record Customer(long id, String name, String email) {

   public boolean equals(Object o){
       return 0 instanceof Customer other && this.id == other.id
   }
}
