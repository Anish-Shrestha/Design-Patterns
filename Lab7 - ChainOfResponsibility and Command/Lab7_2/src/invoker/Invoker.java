package invoker;

import Command.Command;




public class Invoker {
	Command theCommand;

	public Invoker(Command newCommand){
		
		theCommand = newCommand;
		
	}

	public void execute() {

		theCommand.execute();

	}

	// Now the remote can undo past commands

	public void undo() {

		theCommand.undo();

	}

}
