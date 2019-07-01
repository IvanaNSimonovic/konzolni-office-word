package word;

import java.util.Scanner;

public class KonzolniWord {
	
	public static int noviBrojac(int a, String b) {
		String[] pom = b.split("[.!?]");
		for(int i=0;i<pom.length;i++) {
			a++;
		}
		return a;
	}
	
	public static void brojReci(String[][] ispis, int b) {
		int brojac2=0;
		int suma=0;
		String pom2 = "";
		for(int i=1;i<=b;i++) {
			pom2=ispis[i][i];
			String[] pom3 = pom2.split(" ");
			 brojac2 = pom3.length;
			 suma+=brojac2;
		}
		System.out.println("----------status---------");
		System.out.println("broj reci: " + suma);
		System.out.println("-------------------------");
	}
	
	public static String[][] zamena(String[][] ispis,int a, String b) {
		String pom2="";
		String pom = b.substring(0, 1).toUpperCase() + b.substring(1);
		if(pom.endsWith(".") || pom.endsWith("!") || pom.endsWith("?")) {
			pom2=pom;
		} else {
			pom2 = pom + ".";
		}
		
		ispis[a][a] = pom2;
		return ispis;
	}
	
	public static String[][] oduzimanje(String [][] ispis, int b, int a){
		String[][] noviIspis = new String[100][100];
		for(int i=1;i<b;i++) {
			if(i==a) {
				noviIspis[0][0] = ispis[i][i];
				for(i=a;i<b;i++) {
					noviIspis[i][i] = ispis[i+1][i+1];
				}
			} else if(i!=a) {
				noviIspis[i][i] = ispis[i][i];
			}
		}
		return noviIspis;
	}
	public static String[][] dodavanje(String[][] ispis,int a, String b) {
		int noviID=a+1;
		String pom2="";
		String pom = b.substring(0, 1).toUpperCase() + b.substring(1);
		if(pom.endsWith(".") || pom.endsWith("!") || pom.endsWith("?")) {
			pom2=pom;
		} else {
			pom2 = pom + ".";
		}
		ispis[noviID][noviID] = pom2;
		return ispis;
	}
	
	public static String[][] blokTeksta(String[][] ispis, int a, String b) {

		String[] pom = b.split("[.!?]");
		int noviID=a+1;
		for(int i=0;i<pom.length;i++,noviID++) {
			String pom2 = pom[i];
			String pom3 = pom2.trim();
			String pom4 = pom3.substring(0, 1).toUpperCase() + pom3.substring(1) + ".";
			ispis[noviID][noviID] = pom4;
		}
		return ispis;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dobrodosli u konzolni Word!");
		System.out.println("---------------------------");
		System.out.println("Komande:");
		System.out.println("-1) Izlaz iz programa");
		System.out.println("0) Obrisi recenicu");
		System.out.println("1) Dodaj recenicu");
		System.out.println("2) Dodaj blok teksta");
		System.out.println("3) Izmeni recenicu");
		System.out.println("4) Ispis celog teksta");
		System.out.println("99) Ispis komandnog menija");
		System.out.println("---------------------------");
		int izlaz=0;
		int komanda;
		int brojac=0;
		int brojac2=0;
		String test="";
		//String[][] ispis = new String[100][100];
		String[][] konacanIspis = new String[100][100];
		
		while(izlaz!=-1) {
			komanda=sc.nextInt();
			switch(komanda) {
			case -1: izlaz=-1;break;
			case 0: konacanIspis=oduzimanje(konacanIspis, brojac, sc.nextInt());brojac--;break;
			case 1: konacanIspis=dodavanje(konacanIspis,brojac,sc.nextLine().trim());brojac++;break;
			case 2: 
				String pom=sc.nextLine().trim();
				konacanIspis=blokTeksta(konacanIspis,brojac,pom);
				brojac=noviBrojac(brojac,pom);break;
			case 3: konacanIspis=zamena(konacanIspis,sc.nextInt(),sc.nextLine().trim());break;
			case 4:
				System.out.println("----------tekst----------");
				for(int i=1;i<=brojac;i++) {
					System.out.println(i + ": " + konacanIspis[i][i]);
				}
				brojReci(konacanIspis, brojac);
				break;
			case 99:
				System.out.println("Komande:");
				System.out.println("-1) Izlaz iz programa");
				System.out.println("0) Obrisi recenicu");
				System.out.println("1) Dodaj recenicu");
				System.out.println("2) Dodaj blok teksta");
				System.out.println("3) Izmeni recenicu");
				System.out.println("4) Ispis celog teksta");
				System.out.println("99) Ispis komandnog menija");
				System.out.println("---------------------------");break;
			}
			
			
		}
		

	}


}