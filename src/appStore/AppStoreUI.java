package appStore;

import java.util.Scanner;


public class AppStoreUI 
{

	public void startApp ()
	{
		String nome = "MadApps ";
		
		AppStore store = new AppStore (nome);
		
		printMenu(nome);
		
		Scanner sc = new Scanner(System.in); // cria e inicializa o scanner de input
		
		int choice = MyUtils.tryOption(sc);
		
		switch (choice)
		{
			case 0:
			{
				sc.close(); // Fecha o scanner
				
		        System.exit(0); // Sai do sistema
			}
		}
		
	}

	public void printMenu (String nome)
	{
	
		System.out.println("╔========  Bemvindo ao menu da AppStore  ========╗");
		System.out.println("║"+ MyUtils.returnSpaces((48 -nome.length()) /2) + nome + 
				MyUtils.returnSpaces((48 -nome.length()) /2) + "║");
		System.out.println("╠================================================╣");
		System.out.println("║            * Escolha uma opção *               ║");
		System.out.println("║                                                ║");
		System.out.println("║                                                ║");
		System.out.println("║       1 - Registar utilizador                  ║");
		System.out.println("║                                                ║");
		System.out.println("║       0 - Sair                                 ║");
		System.out.println("║                                                ║");
		System.out.println("╚================================================╝");

	}
	
}
