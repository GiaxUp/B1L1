package it.epicode.be;
import java.util.Scanner;

public class Helloworld {
	//Serve per esercizio 4.1
	public static double perimetroRettangolo(double lato1, double lato2) {
        double perimetro = 2 * (lato1 + lato2);
        return perimetro;
	}
	//Serve per esercizio 4.2
	public static int pariDispari(int numero) {
        if (numero % 2 == 0) {
            return 0; 
        } else {
            return 1; // Se il numero è dispari
        }
	}
	//Serve per esercizio 4.3
	public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        double semiperimetro = (lato1 + lato2 + lato3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));
        return area;
	}
	
	
public static void main (String[] args)
		{
		// Esercizio 1: Stampa a console una frase
		System.out.println("Esercizio 1: " + "This is my first Epicode Java Project!");
		
		//Esercizio 2.1: Moltiplica due numeri interi
		int input1 = 2;
		int input2 = 3;
		System.out.println("Esercizio 2.1: " + input1 * input2);
		//Esercizio 2.2: Concatena un numero ad una stringa
		String inputStr = "Hello";
		int inputNum = 3;
		System.out.println("Esercizio 2.2: " + inputStr + inputNum);
		//Esercizio 2.3: Inserisci in un array una stringa in mezzo a delle altre stringhe pre-esistenti
		int a[] = new int[5];
		a[0] = 10;
		String arr[] = {"a", "b", "c", "d", "e"};
		String a2[] = new String[arr.length + 1];
		String str = "Ciao sono una stringa in mezzo alle lettere di prima.";
		a2[0] = arr[0];
		a2[1] = arr[1];
		a2[2] = str;
		a2[3] = arr[2];
		a2[4] = arr[3];
		a2[5] = arr[4];
		System.out.println("Esercizio 2.3:");
		for (int i = 0; i < a2.length; i++) {
		    System.out.println(a2[i]);
		}
		
		//Esercizio 3: Inserimento stringhe da console e stampa in ordine di inserimento e in ordine di inserimento inverso
		Scanner scanner = new Scanner(System.in);
		System.out.println("Esercizio 3.1: ");
        System.out.println("Inserisci la prima stringa:");
        String stringa1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa:");
        String stringa2 = scanner.nextLine();
        System.out.println("Inserisci la terza stringa:");
        String stringa3 = scanner.nextLine();
        String concatenazione = stringa1 + stringa2 + stringa3; // Concatenazione delle stringhe
        System.out.println("La concatenazione delle stringhe in ordine di inserimento è: " + concatenazione);
        String concatenazioneInversa = stringa3 + stringa2 + stringa1; // Concatenazione delle stringhe in ordine inverso di inserimento
        System.out.println("La concatenazione delle stringhe in ordine inverso di inserimento è: " + concatenazioneInversa);
        
        //Esercizio 4.1: perimetroRettangolo che accetta la lunghezza decimale dei due lati di un rettangolo e ne calcola il perimetro
        double lato1 = 3.5;
        double lato2 = 5.2;
        double perimetro = perimetroRettangolo(lato1, lato2);
        System.out.println("Esercizio 4.1: " + "Il perimetro del rettangolo con lati " + lato1 + " e " + lato2 + " è " + perimetro);
        //Esercizio 4.2: pariDispari che accetta un numero intero e restituisce 0 se il numero è pari e 1 se è dispari
        int numeroPari = 6;
        int numeroDispari = 7;
        int risultato1 = pariDispari(numeroPari);
        int risultato2 = pariDispari(numeroDispari);
        System.out.println("Esercizio 4.2: " + numeroPari + " è pari? " + (risultato1 == 0)); // Se il numero è pari restituisce true
        System.out.println("Esercizio 4.2: " + numeroDispari + " è pari? " + (risultato2 == 0)); // Se il numero è dispari restituisce false
        //Esercizio 4.3: perimetroTriangolo che accetta le lunghezze decimali dei lati di un triangolo e ne restituisca l'area (è possibile usare la formula di Erone)
            double triangolo1 = 3.0;
            double triangolo2 = 4.0;
            double triangolo3 = 5.0;
            double area = perimetroTriangolo(triangolo1, triangolo2, triangolo3);
        System.out.println("Esercizio 4.3: " + "L'area del triangolo con lati " + triangolo1 + ", " + triangolo2 + ", " + triangolo3 + " è " + area);
        }
}


