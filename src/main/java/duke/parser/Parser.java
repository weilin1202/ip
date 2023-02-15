package duke.parser;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;


import duke.exception.WrongFormatException;
import duke.exception.EmptyDescriptionException;
import duke.exception.WrongCommandException;
import duke.task.TaskList;



/**
 * A parser to understand and perform user command
 */
public class Parser {
    private TaskList taskList;
    private ArrayList<String> listOfCommands;

    /**
     * Constructor for Parser
     * @param taskList
     */
    public Parser(TaskList taskList) {
        this.taskList = taskList;
        this.listOfCommands = new ArrayList<>() {
            {
                add("mark");
                add("unmark");
                add("todo");
                add("deadline");
                add("event");
                add("delete");
                add("find");
            }
        };
    }

    /**
     * Perform the user command and create the tasks
     * @throws EmptyDescriptionException If no description of task after the command word
     * @throws WrongCommandException If wrong command word is being entered
     */
    public String performCommand(String input) {
        String[] arrOfString = input.trim().split(" ");
        String command = arrOfString[0];
        try {
            this.checkCommand(input, command);
            switch (command) {
            case "bye":
                return HandleBye.performBye(input);

            case "list":
                return HandleList.performList(input, taskList);

            case "mark":
                return HandleMark.performMark(input, taskList);

            case "unmark":
                return HandleUnmark.performUnmark(input, taskList);

            case "todo":
                return HandleToDo.performToDo(input, taskList);

            case "deadline":
                return HandleDeadline.performDeadline(input, taskList);

            case "event":
                return HandleEvent.performEvent(input, taskList);

            case "delete":
                return HandleDelete.performDelete(input, taskList);

            case "find":
                return HandleFind.performFind(input, taskList);

            default:
                assert false: "Unable to process command";
                return "Please enter a valid command and/or task!";
            }
        } catch (EmptyDescriptionException | WrongCommandException | WrongFormatException e){
            return e.getMessage();
        } catch (DateTimeParseException e) {
            return "Please enter date in the correct format! YYYY-MM-DD, example: 2023-10-10";
        }

    }

    /**
     * Check whether the command and input is valid or invalid
     * @param input Input String by user
     * @return Perform command to return string by Duke
     */
    public void checkCommand(String input, String command) throws EmptyDescriptionException, WrongCommandException {
        if (listOfCommands.contains(input)) {
            throw new EmptyDescriptionException();
        } else if (!listOfCommands.contains(command) && !command.equals("list") && !command.equals("bye")) {
            throw new WrongCommandException();
        }
    }

}




