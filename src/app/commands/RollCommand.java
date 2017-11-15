package app.commands;

import java.util.List;

public class RollCommand extends Command {

    public RollCommand(List<String> strings) {
        super(strings);
    }

    @Override
    public String execute(String command) {
        String[] input = command.split("\\s+");

        if(input.length != 2){
            throw new UnsupportedOperationException("Error: invalid command parameters");
        }

        switch (input[1]) {
            case "right":
                rollRight();
                break;
            case "left":
                rollLeft();
                break;
            default:
                throw new IllegalArgumentException("Error: invalid command parameters");
        }

        return super.toString();
    }

    private void rollLeft() {
        String item = super.getStrings().remove(0);
        super.getStrings().add(item);
    }

    private void rollRight() {
        int len = super.getStrings().size();
        String item = super.getStrings().remove(len - 1);
        super.getStrings().add(0, item);
    }
}
