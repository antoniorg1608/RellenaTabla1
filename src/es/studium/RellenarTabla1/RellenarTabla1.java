package es.studium.RellenarTabla1;

public class RellenarTabla1
{

	public static void main(String[] args)
	{
		final int TAM = 20;
		int Pares[] = new int[TAM];
		int i;
		// Recorrido para rellenar
		for (i = 0; i < TAM; i++)
		{
			Pares[i] = i * 2;
		}
		// Recorrido para mostrar el resultado
		for (i = 0; i < TAM; i++)
		{
			System.out.println(Pares[i]);
		}

	}

}
