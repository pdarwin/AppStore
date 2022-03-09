package appStore;

import java.util.Scanner;

public class MyUtils {

	public static String returnSpaces (int num)
	{
		String spaces = "";
		
		for (int i = 0; i < num; i++)
		{
			spaces += " ";
		}
		
		return spaces;
	}
	
	/**
	 * Valida op��es do menu
	 * 
	 * @param sc
	 * 			o scanner que estamos a usar para receber o input
	 * @return - o inteiro escolhido pelo utilizador e validado pelo sistema
	 */
	public static int tryOption (Scanner sc) 
	{
		
		int option;
		
		do
		{
	
			option = tryScannerIntFromNextLine(sc);
			
			if (option == 0)
			{
				break;
			}
			else
			{
				System.out.println("Op��o inv�lida. Por favor escolha uma op��o entre 0 e 0.");

			}
		} while (true);
		
		return option;
	}
	
	public static int tryScannerIntFromNextLine (Scanner sc)
	{
	
		int nInt = 0; // inicializa a vari�vel que guarda o inteiro a devolver
		
		do
		{
			try 
			{
				nInt = Integer.parseInt (tryScannerNextLine(sc)) ; // Tenta atribuir o valor do scanner ao inteiro
				break;
			}
			catch (Exception e1) {
				e1.printStackTrace();
			}
		} while (true);
		
		return nInt;
	}
	
	/**
	 * Testa a String inserida no Scanner, para ver se � vazia ou s� com espa�os
	 * 
	 * @param sc
	 * 			o scanner que estamos a usar para receber o input
	 * @return - a string inserida pelo utilizador, se v�lida
	 */
	public static String tryScannerNextLine (Scanner sc)
	{
		String sString = "";
		do
		{
			try 
			{
				sString = sc.nextLine(); // Tenta atribuir o valor do scanner � String
				
				if (sString.trim().isEmpty()) // Se a tring estiver vazia
				{
					System.out.println("O valor inserido estava vazio, ou s� continha espa�os. Por favor digite outra vez.");
				}
				else
				{
					break;
				}					
					
			}
			catch (Exception e)
			{// quando n � uma String v�lida
				e.printStackTrace();
			}
		} while (true);
		
		return sString;
	}
	
}
