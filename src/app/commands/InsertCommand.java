package app.commands;

import java.util.List;

public class InsertCommand extends Command {

    public InsertCommand(List<String> strings) {
        super(strings);
    }

    @Override
    public String execute(String command) {

        return super.toString();
    }
}
