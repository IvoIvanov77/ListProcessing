package app.commands;

import java.util.List;

public class CountCommand extends Command {

    public CountCommand(List<String> strings) {
        super(strings);
    }

    @Override
    public String execute(String command) {

        String[] input = command.split("\\s+");

        if(input.length != 2){
            throw new UnsupportedOperationException("Error: invalid command parameters");
        }

        String targetString=input[1];
        int counter=0;

        for (String s :getStrings()) {
            if (s.compareTo(targetString)==0){
                counter++;
            }
        }

        return String.valueOf(counter);
    }
}
