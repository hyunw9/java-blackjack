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

    public static void validateWrongNameValue(String name){
        if(name == null){
            throw new NullPointerException("이름은 Null 값이 될 수 없습니다.");
        }
    }

    public static void validateNameLength(String name){
        if(name.length()<1){
            throw new IllegalArgumentException("이름 길이는 1글자 이상이어야 합니다.");
        }
    }
}

