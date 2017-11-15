package app.commands;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Command {

    private List<String> strings;


    public Command(List<String> strings) {
        this.strings = strings;
    }

    protected List<String> getStrings() {
        return this.strings;
    }

    public abstract String execute(String command);

    @Override
    public String toString() {
        return String.join(" ", this.strings);
    }


}
