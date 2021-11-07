package Java_Assignment2_Persistence;

public class Client 
{
	public static void main(String[] args) 
	{
		Persistence F = new FilePersistence();
		F.persist();
		Persistence D = new DatabasePersistence();
		D.persist();
	}

}

