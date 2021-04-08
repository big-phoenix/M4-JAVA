package restaurant;

import java.util.*;

public class Restaurant {

	
	public static void main(String[] args){
		
	/******************************************************* Fase 1 ****************************************************/
		
		int billet1 = 5; /* Variables con los precios */
		int billet2 = 10; 
		int billet3 = 20;
		int billet4 = 50;
		int billet5 = 100;
		int billet6 = 200;
		int billet7 = 500;
		
		int total = 0; // Variable para el precio total
		
		//String [] platos = new String[5]; // array de platos del menu
		//int [] precio = new int [5]; // array de precio de los platos
		
		
	/******************************************************* Fase 2 ****************************************************/
		
		HashMap<String, Integer> menu = new HashMap<String, Integer>(); // Guadamos los platos y precios en un Map
		Scanner plato = new Scanner(System.in); // Creamos el objeto Scanner para introducir datos por consola
		ArrayList<String> pedido = new ArrayList<String>();
		int parar = 1;
		
		/*Si quieres hacer la prueba mas rapido, comentan los "for" y las "variables" iniciales*/
		
		String [] platos = {"Ensalada","Osobuco","Bacalao","Paella","Flan"}; // Inicializamos la variables de los platos
		int [] precio = {5,15,20,15,5}; // Inicializamos la variables de los precios
		
		
		
		/*for(int i=0; i<platos.length; i++) { // Inicializamos todas las variables de los platos
		
			System.out.println("Nombre del plato " +(i+1)+ ":"); // Pedimos por consola el nombre del plato
			platos[i] = plato.nextLine(); // Guardamos el valor en la variable
			System.out.println("Plato: " +platos[i]); // Mostramos el valor guardado
			
		}
	
		System.out.println("*************Introduce el precio de cada plato*************");
		
		for(int i=0; i<precio.length; i++) { // Inicializamos todas las variables de los platos
			
			System.out.println("Precio de " +platos[i]+ ":"); // Pedimos por consola el precio del plato
			precio[i] = plato.nextInt(); // Guardamos el valor en la variable
			System.out.println("El precio de: " +platos[i]+ " es: " +precio[i]); // Mostramos el valor guardado
			
		}*/
		
		
		for(int i=0; i<platos.length;i++) {
			menu.put(platos[i], precio[i]);
		}
		
		
		System.out.println("************* Nuestro Menu del día es: *************");
		
		for(String nuestrosPlatos:menu.keySet()) {
			System.out.println(nuestrosPlatos+ ": " +menu.get(nuestrosPlatos)+ "€");
			
		}
		
		
		do {
			
			System.out.println("\nQue plato deseas:"); // Pedimos por consola el plato
			pedido.add(plato.next()); // Guardamos el valor en la variable
			
			System.out.println("Quieres mas platos 1:SI o 0:NO "); // 
			parar = plato.nextInt();
			
		}
		while(parar != 0);
		
		
		
	/******************************************************* Fase 3 ****************************************************/
			
		
			for(int j=0;j<pedido.size();j++) {
				
				try {
					
					if(menu.containsKey(pedido.get(j))) {
						total += menu.get(pedido.get(j));
					}
					
				}catch(Exception e){
				
					System.out.println("\n No exite el Plato: ");
				}
				
				/*if(menu.containsKey(pedido.get(j))) {
					total += menu.get(pedido.get(j));
				}else {
					//System.out.println("\n No exite el Plato");
				}*/
				
			}
			
		System.out.print("\n*** Precio total del pedido: " +total+ "€ ***\n\n");
		System.out.print("*** Billetes necesarios ***\n\n");
		
		int num1 = 0; // Guardamos cuantos billetes hay en cada vuelta del bucle hasta que el total este a cero
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int num7 = 0;
		
		while(total != 0) { // Bucle para contar los billetes necesitamos para pagar cuenta
			
			if(total%billet7 == 0) {
				num7++;
				total -= billet7;
			} else if(total%billet6 == 0){
				num6++;
				total -= billet6;
			} else if(total%billet5 == 0){
				num5++;
				total -= billet5;
			} else if(total%billet4 == 0){
				num4++;
				total -= billet4;
			} else if(total%billet3 == 0){
				num3++;
				total -= billet3;
			} else if(total%billet2 == 0){
				num2++;
				total -= billet2;
			} else if(total%billet1 == 0){
				num1++;
				total -= billet1;
			}
			
		}
		
		/******* Mostramos por pantalla cuantos billetes necesitamos *******/
		
		if(num7 !=0) {
			System.out.println(num7+ " de 500€\n");
		}
		if(num6 !=0) {
			System.out.println(num6+ " de 200€\n");
		}
		if(num5 !=0) {
			System.out.println(num5+ " de 100€\n");
		}
		if(num4 !=0) {
			System.out.println(num7+ " de 50€\n");
		}
		if(num3 !=0) {
			System.out.println(num3+ " de 20€\n");
		}
		if(num2 !=0) {
			System.out.println(num7+ " de 10€\n");
		}
		if(num1 !=0) {
			System.out.println(num1+ " de 5€\n");
		}
		
	}

}
