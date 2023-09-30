package User;

public class Name {

    String name;

    public Name(String name) {
        this.name = name;
    }

    public static Name createName(String name){
        validateWrongNameValue(name);
        return new Name(name);
    }

    public String getName() {
        return name;
    }

}
