import java.io.*;

public class Aufgabe2 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("Johner Institut CRM");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("Bitte waelen Sie einen der folgenden Optionen");
		System.out.println();
		System.out.println("[1] Kunde erfassen");
		System.out.println("[2] Liste aller Kunden ausgeben");		
		
			
		String eingabe = System.console().readLine();
		
		switch (eingabe) {
			case "1":{
				System.out.println("--------------------------------------------------------------------------------------------------------");
				System.out.println("Bitte geben Sie ihren Namen ein:");
				
				String name = System.console().readLine();
				
				FileWriter fw = new FileWriter("liste.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(name);
				bw.newLine();
				bw.close();  

			}break;
			
			case "2":{
				System.out.println("--------------------------------------------------------------------------------------------------------");
				
				FileReader fr = new FileReader("liste.txt");
				BufferedReader br = new BufferedReader(fr);
				
				String zeile = br.readLine();
				
				if (zeile == null) {
					System.out.println("Noch keine Kunden vorhanden");
				}else {
					System.out.println("Liste aller Kunden:");
					System.out.println("");
				}
				
				while (zeile != null){
					System.out.println(zeile);
					zeile = br.readLine();					
				}
				
			}break;
			
			default:{
				System.out.println("--------------------------------------------------------------------------------------------------------");				
				System.out.println("ungültige Eingabe");
			}break;
			
		}
	}

}
