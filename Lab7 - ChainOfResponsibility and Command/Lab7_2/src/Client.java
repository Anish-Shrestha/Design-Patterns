import invoker.Invoker;

import java.util.LinkedList;

import Command.Command;
import concreteCommand.CreateSquare;
import concreteCommand.MoveSquare;
import concreteCommand.ScaleSquare;
import receiver.Shape;
import receiver.Square;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Command> commandList= new LinkedList<Command>();
		Shape square=new Square();
		Command create=new CreateSquare(square);
		Command move=new MoveSquare(square);
		Command scale=new ScaleSquare(square);
		//--Square 5*5 is created --//
		Invoker invoker=new Invoker(create);
		commandList.addFirst(create);
		invoker.execute();
		//--Square is moved right by 2 tabs--//
		invoker=new Invoker(move);
		commandList.addFirst(move);
		invoker.execute();
		//invoker.undo();
		//---Square is scaled 2 times--//
		invoker=new Invoker(scale);
		commandList.addFirst(scale);
		invoker.execute();
		invoker.undo();

	}

}
