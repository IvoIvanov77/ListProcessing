package app.commands;

import java.util.Collections;
import java.util.List;

public class SortCommand extends Command {

    public SortCommand(List<String> strings) {
        super(strings);
    }

    @Override
    public String execute(String command) {

        Collections.sort(this.getStrings());

        return super.toString();
    }
}
