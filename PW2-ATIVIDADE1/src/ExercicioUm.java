
public class ExercicioUm{
	public static boolean ehDiaSemana(String fimDeSemana)
	{		
//Alteração para incluir equalsIgnoreCase para não diferenciar letras maiúscula e minúsculas
		if (fimDeSemana.equalsIgnoreCase("Sábado") || fimDeSemana.equalsIgnoreCase("Domingo")) {
			return false;			
		}
		return true;
	}

	public static void main(String[] args) {
		String diaSemana = "Segunda-Feira";	
		
		if (ehDiaSemana(diaSemana) == true) {
			System.out.println(diaSemana + " é dia de semana");
		}else {
		
		System.out.println(diaSemana + " é fim de semana");
		
		}
	}
}
