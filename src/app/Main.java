package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        CommandInterpreter interpreter = new CommandInterpreter(line);

        System.out.println(interpreter);

        while (true){
            if("end".equals(line = reader.readLine())){
                System.out.println("Finished");
                break;
            }

            System.out.println(interpreter.interpretCommand(line));
        }

    }
}
