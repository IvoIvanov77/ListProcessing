package app.commands;

import java.util.ArrayList;
import java.util.List;

public class PrependCommand extends Command {

    public PrependCommand(List<String> strings) {
        super(strings);
    }

    @Override
    public String execute(String command) {

        String[] input = command.split("\\s+");

        if(input.length != 2){
            throw new UnsupportedOperationException("Error: invalid command parameters");
        }
        String element = input[1];
        List<String> newList = new ArrayList<>();
        newList.add(element);
        for (int i = 0; i < getStrings().size(); i++) {
            newList.add(getStrings().get(i));
        }
        getStrings().clear();
        getStrings().addAll(newList);

        return super.toString();
    }



}
