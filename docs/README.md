# User Guide

BearyBear serves as your personal task tracker that manages different 
tasks for you! You do not have to keep track of the tasks manually anymore, BearyBear does it all for you! 

You can add or delete different tasks (todo, deadline, events), mark the tasks as done/undone. 
With BearyBear, you can also view the entire list of task and find tasks with certain keywords!

## Features 

### Record tasks

Able to record three types of tasks (todo, deadline, event) and find and list the tasks

### Update tasks 

Able to update completion status of tasks and able to delete tasks from the task list 

### Save tasks

Tasks will be saved in hard disk at [directory where JAR file is]/data/dukeTask.txt even after the application is closed.
Tasks previously saved  can be retrieved the next time you start this application. 

## Usage

**Please take note of the following:**
- Enter date in this format: **YYYY-MM-DD** (eg. 2023-02-10)
- All the command words are to be typed in **lower case**
  (eg. only `list` is recognized, `LIST` is not recognized)

-----------------------------------------------------------

### `todo` - Add a task to be done 

The task will be added to the list of tasks and saved locally 

Format: `todo (task description)`

Example of usage: 

`todo read book`

Expected outcome:

The 'read book' todo task will be added to the list of tasks. 
'T' in the first square bracket means it is a todo task. 
Second square bracket is empty because this task is not completed yet. 

```
Wow! I've added this task:
 [T][ ] read book
Now you have 1 tasks in the list. 
```

--------------------------------------------

### `deadline` - Add a task with deadline

Add a task with a specified deadline to the task list. 

Format: `deadline (task description) /by (deadline date) `

Example of usage:

`deadline return book /by 2023-10-10`

Expected outcome:

The 'return book' deadline task will be added to the task list and deadline will be shown beside the task description.
'D' in the first square bracket means it is a deadline task.
Second square bracket is empty because this task is not completed yet.

```
Wow! I've added this task:
 [D][ ] return book ( by: Oct 10 2023 )
Now you have 2 tasks in the list. 
```

----------------------------------------


### `event` - Add an event task with time period 

Add an event task with the starting date and ending date into the task list. 

Format: `event (task description) /from (start date) /to (end date)`


Example of usage:

`event write book /from 2023-10-10 /to 2024-11-11`

Expected outcome:

The 'write book' event task will be added to the task list and starting date & ending date will be shown beside the task description. 
'E' in the first square bracket means it is an event task.
Second square bracket is empty because this task is not completed yet.

```
Wow! I've added this task:
 [E][ ] write book (Oct 10 2023 to Nov 11 2024)
Now you have 3 tasks in the list. 
```

---------------------------------------------


### `mark` - Mark a task as completed

Reference to a task using task number and mark this task as completed. 

Format:

`mark (task number)`

Example of usage:

`mark 1`

Expected outcome:

The first task will be marked as completed and the second square bracket will contain a 'X'.

```
YAYYYY Good Job!!!
I've marked this task as done:
 [T][X] read book 
```

-------------------------------------------------

### `unmark` - Mark a task as not completed

Reference to a task using task number and mark this task as not completed.

Format:

`unmark (task number)`

Example of usage:

`unmark 1`

Expected outcome:
The first task will be marked as not completed and the second square bracket will be empty.


```
Okay... I've marked this task as not done yet:
 [T][ ] read book
```

----------------------------------------------

### `list` - Print the current list of tasks

Allow users to see  the whole list of tasks that has been recorded so far. 

Example of usage:

`list`

Expected outcome:

All the tasks and their details (type of task, completion status, deadlines and dates) in the list will be printed out.

```
Here are some tasks in your list:
1.[T][ ] read book
2.[D][ ] return book ( by: Oct 10 2023 )
3.[E][ ] write book (Oct 10 2023 to Nov 11 2024)
```

----------------------------------------------

### `find` - Find tasks containing the target word 

Search and list out the matching list of tasks which has the target word that user is trying to find.

Format:

`find (target word)`

Example of usage:

`find return`

Expected outcome:

Search through the list of tasks to find which has 'return' in the task details. 
Then print all the tasks which has 'return' in the task details.  

```
Here are the matching tasks in your list:
1.[D][ ] return book ( by: Oct 10 2023 )
```

---------------------------------------------
### `bye` - Exit the application

Exit and closes the application.

Example of usage:

`bye`

Expected outcome:

The application will be closed and a goodbye message will be printed in console.
