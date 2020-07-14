package day5noon;



public class RemoteAppp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remote remote=new Remote();
		remote.setCommand(new All(), 1);
		remote.setCommand(new Mom(), 2);
		String ans=remote.useCounter(2);
		System.out.println(ans);
	}

}
