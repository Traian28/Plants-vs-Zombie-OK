import java.util.Iterator;
import javax.swing.JLabel;



public class HiloGrafica extends Thread{
	//ATRIBUTOS DE INSTANCIA
	protected Juego juego;
	protected JLabel fondo;
	protected Ventana ventana;
	
	//CONSTRUCTOR
	public HiloGrafica(Juego j,JLabel f,Ventana v){
		juego=j;fondo=f;ventana=v;
		
	}
	
	//COMANDOS
	public void run(){
		Zombie z;JLabel grafica;Iterator<Zombie> zombies;
		while(juego.sigueJuego()){
			zombies=juego.zombies();
			while((juego.sigueJuego())&&(zombies.hasNext())){
				z=zombies.next();
				grafica=z.getGrafica();
<<<<<<< .mine
				grafica.setBounds(z.getPosX(),z.getPosY(),100,100);}}
=======
				grafica.setBounds(z.getPosX(),z.getPosY(),100,100);
				grafica.setOpaque(false);
				if(!z.estaBloqueado()){
					fondo.add(grafica);
					z.bloquearZombie();}}}
		ventana.derrota();
>>>>>>> .r45
		
		
	}

}
