package app.commands;

import java.util.Collections;
import java.util.List;

public class SortCommand extends Command {

    public SortCommand(List<String> strings) {
        super(strings);
    }

    @Override
    public String execute(String command) {
        String[] input = command.split("\\s+");

        if(input.length != 1){
            throw new UnsupportedOperationException("Error: invalid command parameters");
        }

        Collections.sort(this.getStrings());

        return super.toString();
    }
}
