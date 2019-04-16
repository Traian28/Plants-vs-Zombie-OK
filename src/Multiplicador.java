import javax.swing.ImageIcon;


public class Multiplicador extends Zombie{
	//CONSTRUCTOR
	public Multiplicador(int X, int Y,Juego j){
		super(100,10,100,X,Y,j);
		grafica.setIcon(new ImageIcon("C:/Users/User/Desktop/Zombies/zombie8normal.gif"));
		//grafica.setIcon(new ImageIcon(getClass().getClassLoader().getResource("zombie2.gif")));
	}
	
	//COMANDOS
	public void ataqueEspecial(){
		if(columna==3){
			Zombie z1=new Basico(1,8,juego);
			Zombie z2=new Basico(3,8,juego);
			Zombie z3=new Basico(5,8,juego);
	
			(juego.getTablero()).colocarZombie(z1);
			(new HiloZombie(juego,z1)).start();
			(juego.getTablero()).colocarZombie(z2);
			(new HiloZombie(juego,z2)).start();
			(juego.getTablero()).colocarZombie(z3);
			(new HiloZombie(juego,z3)).start();

			usoAtaqueEspecial=true;}		
	}

}
