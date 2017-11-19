package app.commands;

import java.util.Collections;
import java.util.List;

public class DeleteCommand extends Command {

    public DeleteCommand(List<String> strings) {
        super(strings);
    }

    @Override
    public String execute(String command) {

        String[] input = command.split("\\s+");

        if(input.length != 2){
            throw new UnsupportedOperationException("Error: invalid command parameters");
        }

        int size = this.getStrings().size();
        int index = Integer.parseInt(input[1]);

        if(index >= 0 && index < size){

            this.getStrings().remove(index);

        } else {
            throw new IllegalArgumentException("Error: invalid index " + index);
        }

        return super.toString();
    }
}
