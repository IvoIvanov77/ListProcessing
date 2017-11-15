package app.commands;

import java.util.List;

public class DeleteCommand extends Command {

    public DeleteCommand(List<String> strings) {
        super(strings);
    }

    @Override
    public String execute(String command) {

        return super.toString();
    }
}
