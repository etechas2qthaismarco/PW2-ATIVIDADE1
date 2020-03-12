
public class ExercicioDois {
	public static boolean possoIrBanco(String diaSemana, int horaValida) {

		if (diaSemana.equalsIgnoreCase("Sabado") || diaSemana.equalsIgnoreCase("Domingo")) {

			return false;

		} else if (horaValida < 10 || horaValida > 16) {

			return false;

		}

		return true;
	}

	public static void main(String[] args) {

		boolean teste = possoIrBanco("Segunda", 17);
		System.out.println("Este dia e horário: " + teste);
	}

}
