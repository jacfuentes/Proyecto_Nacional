package main;

import javax.swing.JOptionPane;

import Datos.Azafate;
import Datos.Cliente;
import Datos.Pasaje;
import Datos.Piloto;

public class Main {
	public static void main(String[] args ) {
		Piloto 	pilo=new Piloto();
		Azafate azaf=new Azafate();
		Cliente clie=new Cliente();
		Pasaje pasa=new Pasaje();
		String n="", r="", ap="", na="", e="", hv="", i="", nv="", fh="", d="", as="", cl="", v="";
		
		Object [] opciones=new Object [] {"1.-Ingresar piloto", "2.-Ingresar azafate", "3.-Ingresar Pasaje", "4.-Ingresar Cliente"};
		Object Seleccion = JOptionPane.showInputDialog(null,"Seleccione una opcion", "Aerolinea JavaOne",
				JOptionPane.QUESTION_MESSAGE, null, opciones, "1.- Ingresar piloto");
		switch (String.valueOf(Seleccion).charAt(0)) {
			case '1':
				n=JOptionPane.showInputDialog("Ingrese nombre del piloto");
				pilo.setPerNombre(n);
				ap=JOptionPane.showInputDialog("Ingrese Apellido del piloto");
				pilo.setPersApellido(ap);
				r=JOptionPane.showInputDialog("Ingrese rut del piloto");
				pilo.setPerRut(r);
				na=JOptionPane.showInputDialog("Ingrese nacionalidad del piloto");
				pilo.setPersNacionalidad(na);
				e=JOptionPane.showInputDialog("Ingrese edad del piloto");
				pilo.setPersEdad(Integer.parseInt(e));
				hv=JOptionPane.showInputDialog("Ingrese horas de vuelo del piloto");
				pilo.setPilHorasDeVuelo(Integer.parseInt(hv));
				System.out.println("Datos del piloto");
				System.out.println("Nombre: "+pilo.getPerNombre());
				System.out.println("Apellido: "+pilo.getPersApellido());
				System.out.println("Rut: "+pilo.getPerRut());
				System.out.println("Nacionalidad: "+pilo.getPersNacionalidad());
				System.out.println("Edad: "+pilo.getPersEdad());
				System.out.println("Horas de vuelo: "+pilo.getPilHorasDeVuelo());
			case '2':
				n=JOptionPane.showInputDialog("Ingrese nombre de la azafate");
				azaf.setPerNombre(n);
				ap=JOptionPane.showInputDialog("Ingrese Apellido de la azafate");
				azaf.setPersApellido(ap);
				r=JOptionPane.showInputDialog("Ingrese rut de la azafate");
				azaf.setPerRut(r);
				na=JOptionPane.showInputDialog("Ingrese nacionalidad de la azafate");
				azaf.setPersNacionalidad(na);
				e=JOptionPane.showInputDialog("Ingrese edad de la azafate");
				azaf.setPersEdad(Integer.parseInt(e));
				i=JOptionPane.showInputDialog("Idiomas que habla la Azafate");
				azaf.setAzaIdioma(i);
				System.out.println("Datos de la azafate");
				System.out.println("Nombre: "+azaf.getPerNombre());
				System.out.println("Apellido: "+azaf.getPersApellido());
				System.out.println("Rut: "+azaf.getPerRut());
				System.out.println("Nacionalidad: "+azaf.getPersNacionalidad());
				System.out.println("Edad: "+azaf.getPersEdad());
				System.out.println("Idiomas: "+azaf.getAzaIdioma());
			case'3':
				nv=JOptionPane.showInputDialog("Ingrese N° de vuelo");
				pasa.setPasNdeAsiento(Integer.parseInt(nv));
				fh=JOptionPane.showInputDialog("Ingrese Fecha y Horas");
				pasa.setPasFechayHora(fh);
				d=JOptionPane.showInputDialog("Ingrese Destino");
				pasa.setPasDestino(d);
				as=JOptionPane.showInputDialog("Ingrese N° de asiento");
				pasa.setPasNdeAsiento(Integer.parseInt(as));
				cl=JOptionPane.showInputDialog("Ingrese la clase");
				pasa.setPasClase(cl);
				v=JOptionPane.showInputDialog("Ingresar Valor");
				pasa.setPasValor(v);
				r=JOptionPane.showInputDialog("Ingrese El rut del Cliente");
				clie.setPerRut(r);
				System.out.println("Datos del Pasaje");
				System.out.println("N° del vuelo: "+pasa.getPasNdeVuelo());
				System.out.println("Fecha y Hora del vuelo: "+pasa.getPasFechayHora());
				System.out.println("Destino del vuelo: "+pasa.getPasDestino());
				System.out.println("N° del asiento: "+pasa.getPasNdeAsiento());
				System.out.println("Clase del vuelo: "+pasa.getPasClase());
				System.out.println("Valor del Pasaje: "+pasa.getPasValor());
				System.out.println("Rut del comprador: "+pasa.getPerRut());
			case'4':
				n=JOptionPane.showInputDialog("Ingrese el Nombre");
				clie.setPerNombre(n);
				r=JOptionPane.showInputDialog("Ingrese el Rut");
				clie.setPerRut(r);
				System.out.println("Nombre del cliente; "+clie.getPerNombre());
				System.out.println("Rut del cliente: "+clie.getPerRut());
			
				
			
}
}
}

