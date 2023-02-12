package lesson;

import java.util.Optional;

public class Optional1 {
	
    public static void main(String[] args) {
        String str = null;
        Optional<String> value = Optional.ofNullable(str);
        str = value.orElse("strはnullqです");
        System.out.println(str);
    }

}
