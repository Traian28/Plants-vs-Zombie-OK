import java.util.ArrayList;


public class HiloColocacionZombies extends Thread{
	//ATRIBUTOS DE INSTANCIA
	protected Juego juego;
	protected ArrayList<Zombie> zombies;
	
	//CONSTRUCTOR
	public HiloColocacionZombies(Juego j,ArrayList<Zombie> z){
		juego=j;zombies=z;
	}
	
	//COMANDOS
	public void run(){
<<<<<<< .mine
		Zombie z;
		while(!zombies.isEmpty()){
			z=zombies.remove(0);
			tablero.colocarZombie(z);
			(new HiloZombie(z)).start();
=======
		Zombie z;Tablero tablero=juego.getTablero();
		while((juego.sigueJuego())&&(!zombies.isEmpty())){
			z=zombies.remove(0);
			tablero.colocarZombie(z);
			(new HiloZombie(juego,z)).start();
>>>>>>> .r45
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}}
	}
}
