package ConversorMonedas;

import javax.swing.JOptionPane;

import ConversorMonedas.ConvertirMonedas;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Soles a Dólar", "De Soles a Euro", "De Soles a Libras Esterlinas", "De Soles a Yen Japonés", "De Soles a Won sub-coreano", "De Dólar a Soles", "De Euro a Soles", "De Libras Esterlinas a Soles", "De Yen Japonés a Soles", "De Won sur-coreano a Soles"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Soles a Dólar": 
		monedas.ConvertirSolesDolares(valor);
		break;
	
	case "De Soles a Euro": 
		monedas.ConvertirSolesEuros(valor);
		break;
		
	case "De Soles a Libras Esterlinas":
		monedas.ConvertirSolesLibra(valor);
		break;
		
	case "De Soles a Yen Japonés":
		monedas.ConvertirSolesYen(valor);
		break;
		
	case "De Soles a Won sur-coreano":
		monedas.ConvertirSolesWon(valor);
		break;
	
	case "De Dólar a Soles":
		monedas.ConvertirDolaresSoles(valor);
		break;
		
	case "De Euro a Soles":
		monedas.ConvertirEurosSoles(valor);
		break;
		
	case "De Libras Esterlinas a Soles":
		monedas.ConvertirLibraSoles(valor);
		break;
	 
	case "De Yen Japonés a Soles":
		monedas.ConvertirYenSoles(valor);
		break;
		
	case "De Won sub-coreano a Soles":
		monedas.ConvertirWonSoles(valor);
		break;
	}
	}

}