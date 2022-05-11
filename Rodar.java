package atividades;

public class Rodar {
	public static void main (String [] args) {
		System.out.println("Questão1");
		Cliente cliente1 = new Cliente("Lairton","124.546.234.65","087999119308",
		"Masculino",65);

		cliente1.mostrarInfo();
		cliente1.setIdade(22);
		cliente1.mostrarInfo();
		
		System.out.println("\n****************Final******************");
		
		//Questão 2
		System.out.println("\nQuestão 2");
		
		Aviao aviao1 = new Aviao("Embraer E-195", 890 ,124);
		Aviao aviao2 = new Aviao("Boeing 777",950,550,"Boing");
		
		aviao1.mostrarInfo();
		aviao2.mostrarInfo();
	}
}
