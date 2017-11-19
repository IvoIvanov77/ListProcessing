package app;

import app.commands.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommandInterpreter {


    private List<String> strings;

    protected CommandInterpreter(String line) {
        this.strings = Arrays.stream(line.split("\\s+"))
                .collect(Collectors.toList());
    }

    String interpretCommand(String line)  {
        try {
            Command command = parseCommand(line);
            String result = command.execute(line);
            return result;
        } catch (Throwable t) {
            return t.getMessage();
        }
    }

    private Command parseCommand(String line){
        String command = line.split("\\s+")[0];
        switch (command) {
            case "append":
                return new AppendCommand(this.strings);
            case "prepend":
                return new PrependCommand(this.strings);
            case "insert":
                return new InsertCommand(this.strings);
            case "delete":
                return new DeleteCommand(this.strings);
            case "roll":
                return new RollCommand(this.strings);
            case "reverse":
                return new ReverseCommand(this.strings);
            case "sort":
                return new SortCommand(this.strings);
            case "count":
                return new CountCommand(this.strings);
            default:
                throw new IllegalArgumentException("Error: invalid command");
        }
    }

    @Override
    public String toString() {
        return String.join(" ", this.strings);
    }

}
