
public class ExercicioUm{
	public static boolean ehDiaSemana(String fimDeSemana)
	{		
//Altera��o para incluir equalsIgnoreCase para n�o diferenciar letras mai�scula e min�sculas
		if (fimDeSemana.equalsIgnoreCase("S�bado") || fimDeSemana.equalsIgnoreCase("Domingo")) {
			return false;			
		}
		return true;
	}

	public static void main(String[] args) {
		String diaSemana = "Segunda-Feira";	
		
		if (ehDiaSemana(diaSemana) == true) {
			System.out.println(diaSemana + " � dia de semana");
		}else {
		
		System.out.println(diaSemana + " � fim de semana");
		
		}
	}
}
