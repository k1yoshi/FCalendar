Introducción
============

	Primero aclarar que este es mi primer proyecto en github así que si alguien lo se le pide la mayor comprensión, toda critica es bienvenida mientras sea constructiva.
	FCalendar es una simple librería que convierte un JTextField a un selector de fechas tipo calendario, esto lo hice por que necesitaba uno para mi proyecto de instituto y al buscar me encontré con JCalendar que esta bueno pero no me agrado su interfaz así que hice este con una interfaz a mi parecer mas llamativa. 

Modo de Uso
===========
	Para usarla solo tiene que importar la librería:	import com.k1yoshi.FCalendar.FCalendarCombo;
Bueno cuenta con dos elementos un FCalendar y FCalendarCombo el primero es un simple JPanel con los elementos necesarios para seleccionar la fecha y el segundo es el que convierte el JTextField en un selector de fechas lo único que tiene que hacer para usarlo es:
	JTextFiel txtFecha = new JTextFiel();
	FCalendarCombo fecha = new FCalendarCombo(txtFecha);
	String fecha_ingresada = fecha.getDate();
	O simplemente leen el valor de la caja de texto: fecha_ingresada = txtFecha.getText();
Iniciar:
---------
	Al iniciar pueden hacerlo de diferentes formas:
		Formatos:	d = dia, m = mes, y = año;
		FCalendarCombo fecha = new FCalendarCombo(txtFecha); Tomas como formato predeterminado "d/m/y"
		FCalendarCombo fecha = new FCalendarCombo(txtFecha, "d-m-y"); Como segundo parametro recibe el formato, pueden poder el orden que quieran(en el formato) con el separador que mejor les guste;
		A la hora de obtener el valor, pueden leer el texto de la caja de texto si es que lo quieren con el formato con el que se inicio o si desean obtenerla en otro formato, al afuncion getDate le pasan como seguno parametro el formato con el que desean la fecha.

Usar
------
	Una vez iniciado cada vez que le den click en la caja de texto se desplazara el calendario, cuenta con botón de atrás y adelanté para avanzar entre meses, si lo que desean es avanzar entre años tiene dos formas de hacerlo:
	1)Le dan un click sostenido al botón deseado y avanzaran entre años.
	2)Le dan un click sostenido al texto donde indica el mes y año y aparecerá un JComboBox que les permitirá seleccionar el año, una vez seleccionado se ocultara nuevamente.


Bueno si alguien encuentra esto espero le sirva.


