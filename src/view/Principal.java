package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.SteamController;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		String ano = "";
		String mes = "";
		int media = 0;
		int choose = 0;
		boolean existe = false;
		
		SteamController steam = new SteamController();
		
			do {
				choose = Integer.parseInt(JOptionPane.showInputDialog(
						"----------------------------------------------------------------------"
								+ "\nExerc�cio Steam\n"
								+ "\nDigite 1 para realizar uma verifica��o."
								+ "\nDigite 2 para encerrar o programa."
								+ "\n----------------------------------------------------------------------",
						JOptionPane.QUESTION_MESSAGE));

				switch (choose) {
				case 1:
					
					String absolutePath = "C:\\TEMP\\SteamCharts.txt";
					String endedPath = "C:\\TEMP\\SteamEnd.txt";
					
					ano = JOptionPane.showInputDialog("Digite o ano: ");
					mes = JOptionPane.showInputDialog("Escreva o m�s: ");
					media = Integer.parseInt(JOptionPane.showInputDialog("Digite a m�dia: "));
					
					existe = steam.tentaCriarArquivo(absolutePath);
					
					if ( existe == true) {
						steam.verificaTxt(absolutePath,ano,mes,media);
					}
					
					break;
				}
			} while (choose != 2);
		
	}
	
}