package app.commands;

import java.util.ArrayList;
import java.util.List;

public class InsertCommand extends Command {

    public InsertCommand(List<String> strings) {
        super(strings);
    }

    @Override
    public String execute(String command) {

        String[] input = command.split("\\s+");
        List<String> changedList = new ArrayList<>();

        if(input.length != 3){
            throw new UnsupportedOperationException("Error: invalid command parameters");
        }

        int index = Integer.valueOf(input[1]);
        String element = input[2];

        if (index < 0 || index >= getStrings().size()) {
            throw new UnsupportedOperationException("Error: invalid index " + index);
        }

        for (int i = index; i < getStrings().size() ; i++) {
            changedList.add(getStrings().get(i));
        }
        getStrings().removeAll(changedList);
        getStrings().add(element);
        for (int i = 0; i < changedList.size(); i++) {
            getStrings().add(changedList.get(i));
        }

        return super.toString();
    }
}
