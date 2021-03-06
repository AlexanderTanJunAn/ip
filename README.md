# Duke project template

This is a project template for a greenfield Java project. It's named after the Java mascot _Duke_. Given below are instructions on how to use it.

## Setting up in Intellij

Prerequisites: JDK 11, update IntelliJ to the most recent version.

### On IntelliJ version 2020.3.1 (latest) and beyond

1. Open IntelliJ (if you are not in the welcome screen, click `File` > `Close Project` to close the existing project first)
1. Import the project into IntelliJ as follows:
   1. Click `Open`
   1. Select the project directory, and click `OK`
   1. If there are any further prompts, accept the defaults.
1. Configure the project to use **JDK 11** (not other versions) as explained in [here](https://www.jetbrains.com/help/idea/sdk.html#set-up-jdk).
1. After that, locate the `src/main/java/Duke.java` file, right-click it, and choose `Run Duke.main()`. If the setup is correct, you should see something like the output below.

   ```
   Hello from
    ____        _        
   |  _ \ _   _| | _____ 
   | | | | | | | |/ / _ \
   | |_| | |_| |   <  __/
   |____/ \__,_|_|\_\___|
   ```

# User Guide

Duke is a desktop app for managing your todos, events and deadlines, optimised for use via a Command Line Interface(CLI).
* [Features](#features)
  * [Adding todos, deadlines and events](#1-adding-todos-deadlines-and-events)
    * [Adding a todo](#adding-a-todo-todo)
    * [Adding a deadline](#adding-a-deadline-deadline)
    * [Adding an event](#adding-an-event-event)
  * [Deleting a task](#2-deleting-todos-deadlines-and-events-delete)
  * [Listing all tasks](#3-listing-all-tasks-list)
  * [Marking task as done](#4-marking-task-as-done-done)
  * [Seaching for specified keyword](#5-searching-for-specified-keyword-find)
  * [Exiting the program](#6-exiting-the-program-bye)
* [Saving the data](#saving-the-data)
* [Editing the data](#editing-the-data)
* [FAQ](#faq)

## Features 

### 1. Adding todos, deadlines and events
Adding tasks.

### Usage

### Adding a todo: `todo`

Adds a todo into the task list

Format: `todo [task name]`

Example of usage: 

`todo read book`

Expected outcome:

```
Got it. I've added this task:
	[T][✘] read book
Now you have 8 tasks in the list.
```

### Adding a deadline: `deadline`

Adds a task with a deadline into the task list

Format: `deadline [task name] /by [date/time]`

Example of usage:

`deadline return book /by Sunday 7pm`

Expected outcome:

```
Got it. I've added this task:
	[D][✘] return book (by: Sunday 7pm)
Now you have 9 tasks in the list.
```

### Adding an event: `event`

Adds an event into the task list

Format: `event [event name] /at [date/time]`

Example of usage:

`event project meeting /at Monday 7-8pm`

Expected outcome:

```
Got it. I've added this task:
	[E][✘] project meeting (at: Monday 7-8pm)
Now you have 10 tasks in the list.
```


### 2. Deleting todos, deadlines and events: `delete`

Deletes a task at the given index

### Usage

Format: `delete [index]`

Example of usage:

`delete 4`

Expected outcome:

`Done! One less worry for you :)`


### 3. Listing all tasks: `list`
For a quick overview on all added tasks, printed in chronological order.

### Usage

Example of usage:

`list`

Expected outcome:

```
Here are the tasks in your list:
	1. [T][✘] 1
	2. [T][✘] 3
	3. [E][✘] 4 (at: Wednesday)
	4. [D][✘] return book (by: June 6th)
	5. [E][✘] project meeting (at: Sunday)
	6. [T][✘] run
	7. [T][✘] study book
	8. [T][✘] read book
```


### 4. Marking task as done: `done`
To signal that task is completed

### Usage

Format: `done [index]`

Example of usage:

`done 4`

Expected outcome:

```
Here are the tasks in your list:
	1. [T][✘] 1
	2. [T][✘] 3
	3. [E][✘] 4 (at: Wednesday)
	4. [D][✓] return book (by: June 6th)
	5. [E][✘] project meeting (at: Sunday)
	6. [T][✘] run
	7. [T][✘] study book
	8. [T][✘] read book`
```


### 5. Searching for specified keyword: `find`
Will search through task list for all tasks with specified keyword

### Usage

Format: `find [keyword]`

Example of usage:

`find book`

Expected outcome:

```
Here are the matching tasks in your list:
	1. [D][✓] return book (by: June 6th)
	2. [T][✘] study book
	3. [T][✓] read book`
```


### 6. Exiting the program: `bye`
Exits the program

Format: `bye`


## Saving the data
Duke automatically saves the data after each and every command, ensuring that data is always up to date. There is no need to save manually.

## Editing the data
Duke data is automatically saved as a textfile, `Duke.txt` at the location of `Duke.jar`. Advanced users are welcome to directly edit the textfile.

## FAQ
**Q:** How do I transfer data between computers?

**A:** To transfer data between computers, move the `Duke.txt` file from one computer to the other. Ensure the file is in the same folder as `Duke.jar`.
