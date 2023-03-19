package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirSolesDolares(double valor) {
		double monedaDolar = valor / 3.74;
		monedaDolar = (double)Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaDolar + " Dolares");
	}
	public void ConvertirSolesEuros(double valor) {
		double monedaEuro = valor / 4.03;
		monedaEuro = (double)Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " Euros");	
	}	
	public void ConvertirSolesLibra(double valor) {
		double monedaLibra = valor / 4.55;
		monedaLibra = (double)Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaLibra + " Libras Esterlinas");	
	}	
	public void ConvertirSolesYen(double valor) {
		double monedaYen = valor / 0.028;
		monedaYen = (double)Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaYen + " Yen Japonés");	
	}
	public void ConvertirSolesWon(double valor) {
		double monedaWon = valor / 0.0029;
		monedaWon = (double)Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaWon + " Won sur-coreano");	
	}
	
	
	public void ConvertirDolaresSoles(double valor) {
		double monedaDolar = 3.74 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tus "+ valor + " Dolares, equivalen a " + monedaDolar + " en soles");
	}
	public void ConvertirEurosSoles(double valor) {
		double monedaEuro = 4.03 * valor;
		monedaEuro = (double)Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tus "+ valor + " Euros, equivalen a " + monedaEuro + " en soles");
	}
	public void ConvertirLibraSoles(double valor) {
		double monedaLibra = 4.55 * valor;
		monedaLibra = (double)Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tus "+ valor + " Libra, equivalen a " + monedaLibra + " en soles");
	}
	public void ConvertirYenSoles(double valor) {
		double monedaYen = 0.028 * valor;
		monedaYen = (double)Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tus "+ valor + " Yen, equivalen a " + monedaYen + " en soles");
	}
	public void ConvertirWonSoles(double valor) {
		double monedaWon = 0.0029 * valor;
		monedaWon = (double)Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tus "+ valor + " Won, equivalen a " + monedaWon + " en soles");
	}
}