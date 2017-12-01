package animals.animals;

public class Puppy {
    private String name;
    public Puppy(String name){
    this.name=name;
    } 
public String getName(){
return ( "Name of Puppy is " +this.name);
}



public static void main(String[] args){
 Puppy a = new Puppy("Joe");
System.out.println(a.getName());

}
}
