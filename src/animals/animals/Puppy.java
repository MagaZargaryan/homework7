package animals.animals;

public class Puppy {
    private String name;
    public Puppy(String name){
    this.name=name;  // this is for discriminating between two variables called name
    } 
public String getName(){
return ( "Name of Puppy is " +this.name); // this will print   - "Name of Puppy is "and the given name" "
}


// this main method is for checking whether the code works or not
public static void main(String[] args){
 Puppy a = new Puppy("Joe");
System.out.println(a.getName()); // this will print   - "Name of Puppy is Joe "

}
}
