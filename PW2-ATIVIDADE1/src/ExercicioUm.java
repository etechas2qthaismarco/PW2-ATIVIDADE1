
public class ExercicioUm{
	public static boolean ehDiaSemana(String fimDeSemana)
	{
		if (fimDeSemana == "S�bado" || fimDeSemana == "Domingo") {
			return false;			
		}
		return true;
	}

	public static void main(String[] args) {
		String diaSemana = "Domingo";	
		
		if (ehDiaSemana(diaSemana) == true) {
			System.out.println(diaSemana + " � dia de semana");
		}else {
		
		System.out.println(diaSemana + " � fim de semana");
		
		}
	}
}
