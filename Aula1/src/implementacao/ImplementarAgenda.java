package implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import beans.AgendaRevisao;

public class ImplementarAgenda {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		AgendaRevisao agenda1 = new AgendaRevisao();
		
		agenda1.agendar();
		
		agenda1.cliente = "Ana Maria Braga";
		agenda1.fone = "(11)1234567";
		agenda1.modelo = "Ferrari";
		agenda1.data = myDate.parse("27/10/2022 22:45");
		
		System.out.println(agenda1.cliente);
		System.out.println(agenda1.modelo);
		System.out.println(agenda1.fone);
		System.out.println(agenda1.data + "\n");
		
		AgendaRevisao agenda2 = new AgendaRevisao();
		
		agenda2.cliente = "Fausto Silva";
		agenda2.modelo = "Mclaren";
		agenda2.data = myDate.parse("30/10/2022 21:30");
		
		System.out.println(agenda2.cliente);
		System.out.println(agenda2.modelo);
		
		
		
		
	}

}
