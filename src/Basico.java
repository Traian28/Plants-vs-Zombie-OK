import javax.swing.ImageIcon;


public class Basico extends Zombie{
	//CONSTRUCTOR
<<<<<<< .mine
	public Basico(int X,int Y){
		super(100,10,25,X,Y);
		grafica.setIcon(new ImageIcon("C:/Users/Traian/Downloads/zombie.gif"));
=======
	public Basico(int X,int Y,Juego j){
		super(100,10,25,X,Y,j);
		grafica.setIcon(new ImageIcon("C:/Users/User/Desktop/Zombies/zombie2normal.gif"));
	//	grafica.setIcon(new ImageIcon(getClass().getClassLoader().getResource("zombie.gif")));
>>>>>>> .r45
	}
	
	//COMANDOS
	public void ataqueEspecial(){
		usoAtaqueEspecial=true;
		
	}


}
