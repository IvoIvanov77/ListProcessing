package app.commands;

import java.util.Collections;
import java.util.List;

public class ReverseCommand extends Command {


    public ReverseCommand(List<String> strings) {
        super(strings);
    }

    @Override
    public String execute(String command) {

        Collections.reverse(this.getStrings());

        return super.toString();
    }


}
