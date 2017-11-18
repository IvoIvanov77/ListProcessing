package app.commands;

import java.util.List;

public class AppendCommand extends Command {


    public AppendCommand(List<String> strings) {
        super(strings);
    }

    @Override
    public String execute(String command) {

        String[] input = command.split("\\s+");

        if(input.length != 2){
            throw new UnsupportedOperationException("Error: invalid command parameters");
        }

        getStrings().add(input[1]);

        return super.toString();
    }


}
