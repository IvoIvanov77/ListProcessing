package app.commands;

import java.util.List;

public class AppendCommand extends Command {


    public AppendCommand(List<String> strings) {
        super(strings);
    }

    @Override
    public String execute(String command) {

        return super.toString();
    }


}
