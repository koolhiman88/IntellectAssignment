package day5noon;



public class Remote 
{
	Command counters[]=new Command[5];
	public Remote()
	{
		for(int i=0;i<counters.length;i++) {
			counters[i]=new DummyCommands();
		}
	}
	public String useCounter(int slot) {
		return counters[slot].action();
	}
	public void setCommand(Command command,int slot) {
		counters[slot]=command;
	}
	
}
abstract class Command
{
	public abstract String action();
}
class DummyCommands extends Command{
	public String action()
	{
		return "dummy remotes...no yet operation";
	}
}
class All extends Command{
	public String action()
	{
		String result="";
		System.out.println("The process to get started");
		result=result+ new TVRemote().switchOn();
		result=result+ new TVRemote().switchOff();
		result=result+new SoundRemote().volumeUp();
		result=result+new SoundRemote().volumeDown();
		result=result+new SetBoxRemote().startNews();
		System.out.println("started papa's ");
		return result;
	}
}
class Mom extends Command{
	public String action()
	{
		
		System.out.println("The process to get started");
		String result="";
		result=result+new TVRemote().switchOn();
		result=result+new TVRemote().switchOff();
		result=result+new SoundRemote().volumeUp();
		result=result+new SoundRemote().volumeDown();
		result=result+new SetBoxRemote().startserial();
		System.out.println("started mom's ");
		return result;
	}
}