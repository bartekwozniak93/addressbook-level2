# User Guide

This product is not meant for end-users and therefore there is no user-friendly installer. 
Please refer to the [Setting up](DeveloperGuide.md#setting-up) section to learn how to set up the project.

#### Starting the program

**Using Eclipse**

1. Find the project in the `Project Explorer` or `Package Explorer` (usually located at the left side)
2. Right click on the project
3. Click `Run As` > `Java Application`
4. The program now should run on the `Console` (usually located at the bottom side)
5. Now you can interact with the program through the `Console`

**Using Command Line**

1. 'Build' the project using Eclipse
2. Open the `Terminal`/`Command Prompt`
3. `cd` into the project's `bin` directory
4. Type `java seedu.TaskManager.Main`, then <kbd>Enter</kbd> to execute
5. Now you can interact with the program through the CLI

#### Changes from level 1
What's different from TaskManager-Level1:
* Support for storing task (`a/`) and tags (`t/`)
* Support for marking a contact detail as 'private' (`pa/`) (`pe/`) (`pp/`) 
* View details of a task (`view` : shows non-private details), (`viewall` : shows all details)

### Viewing help : `help`
Format: `help`

> Help is also shown if you enter an incorrect command e.g. `abcd`
 
### Adding a task: `add`
Adds a task to the task book<br>
Format: `add NAME [p]p/PHONE_NUMBER [p]e/EMAIL [p]a/ADDRESS [t/TAG]...` 
 
> Words in `UPPER_CASE` are the parameters, items in `SQUARE_BRACKETS` are optional, 
> items with `...` after them can have multiple instances. Order of parameters are fixed. 
> 
> Put a `p` before the phone / email / task prefixes to mark it as `private`. `private` details can only
> be seen using the `viewall` command.
> 
> Tasks can have any number of tags (including 0)

Examples: 
* `add John Doe p/98765432 e/johnd@gmail.com a/John street, block 123, #01-01`
* `add Betsy Crowe pp/1234567 e/betsycrowe@gmail.com pa/Newgate Prison t/criminal t/friend`

### Listing all tasks : `list`
Shows a list of all tasks in the task book.<br>
Format: `list`

### Finding all tasks containing any keyword in their name: `find`
Finds tasks whose names contain any of the given keywords.<br>
Format: `find KEYWORD [MORE_KEYWORDS]`

> The search is case sensitive, the order of the keywords does not matter, only the name is searched, 
and tasks matching at least one keyword will be returned (i.e. `OR` search).

Examples: 
* `find John`<br>
  Returns `John Doe` but not `john`
* `find Betsy Tim John`<br>
  Returns Any task having names `Betsy`, `Tim`, or `John`

### Deleting a task : `delete`
Deletes the specified task from the task book. Irreversible.<br>
Format: `delete INDEX`

> Deletes the task at the specified `INDEX`. 
  The index refers to the index number shown in the most recent listing.

Examples: 
* `list`<br>
  `delete 2`<br>
  Deletes the 2nd task in the task book.
* `find Betsy`<br> 
  `delete 1`<br>
  Deletes the 1st task in the results of the `find` command.

### View non-private details of a task : `view`
Displays the non-private details of the specified task.<br>
Format: `view INDEX`

> Views the task at the specified `INDEX`. 
  The index refers to the index number shown in the most recent listing.

Examples: 
* `list`<br>
  `view 2`<br>
  Views the 2nd task in the task book.
* `find Betsy` <br> 
  `view 1`<br>
  Views the 1st task in the results of the `find` command.

### View all details of a task : `viewall`
Displays all details (including private details) of the specified task.<br>
Format: `viewall INDEX`

> Views all details of the task at the specified `INDEX`. 
  The index refers to the index number shown in the most recent listing.

Examples: 
* `list`<br>
  `viewall 2`<br>
  Views all details of the 2nd task in the task book.
* `find Betsy`<br> 
  `viewall 1`<br>
  Views all details of the 1st task in the results of the `find` command.

### Clearing all entries : `clear`
Clears all entries from the task book.<br>
Format: `clear`  

#### Exiting the program : `exit`
Exits the program.<br>
Format: `exit`  

#### Saving the data 
Address book data are saved in the hard disk automatically after any command that changes the data.<br>
There is no need to save manually.

#### Changing the save location
Address book data are saved in a file called `TaskManager.txt` in the project root folder.
You can change the location by specifying the file path as a program argument.

Example: 
* `java seedu.TaskManager.Main mydata.txt`

> The file name must end in `.txt` for it to be acceptable to the program.
>
> When running the program inside Eclipse, you can set command line parameters 
  before running the program.
