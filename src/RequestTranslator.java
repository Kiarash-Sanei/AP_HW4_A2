import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RequestTranslator {
    private static final Pattern regex = Pattern.compile("(?<mainFood>((Small|Medium|Large) Pizza)|(Sandwich))(?<extra>.*)");
    public static ArrayList<String> translate(String request) {
        ArrayList<String> result = new ArrayList<>();
        Matcher matcher = regex.matcher(request);
        if (matcher.matches()) {
            String mainFood = matcher.group("mainFood");
            String extra = matcher.group("extra");
            result.add(mainFood);
            for (String word : extra.split(" "))
                if (!word.isBlank() &&
                        !word.equals("extra") &&
                        !word.equals("with") &&
                        !word.equals("and") &&
                        !word.equals("also"))
                    result.add(word);
        }
        return result;
    }
}
