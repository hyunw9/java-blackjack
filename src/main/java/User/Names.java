package User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Names {

    private final List<Name> names;

    public Names(final List<Name> names) {
        this.names = names;
    }

    public static Names createNames(String nameLine){
        List<Name> nameList = Arrays
                .stream(nameLine.split(","))
                .map(String::trim)
                .map(Name::createName).collect(Collectors.toList());
        validateDuplication(nameList);
        return new Names(nameList);
    }

    public static void validateDuplication(List<Name> nameList){
        long distinct = nameList.stream()
                .map(Name::getName)
                .distinct()
                .count();
        if(distinct < nameList.size()){
            throw new IllegalArgumentException("이름이 중복됩니다.");
        }
    }
