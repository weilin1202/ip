package duke.parser;

import duke.exception.WrongFormatException;
import duke.task.TaskList;

public class HandleMark {
    public HandleMark() {
    }

    public static String performMark(String input, TaskList tasklist) throws WrongFormatException {
        boolean correctFormat = input.equals("mark\\s\\d+");

        if (!correctFormat) {
            throw new WrongFormatException("mark 'Task Number'");
        }

        try {
            int taskNum = Integer.parseInt(input.substring(5)) - 1;
            tasklist.markTask(taskNum);
            return "Nice! I've marked this task as done: \n  " + tasklist.getTask(taskNum);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            return "Please enter a valid task number!";
        }
    }
}