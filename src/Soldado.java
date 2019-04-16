import javax.swing.ImageIcon;


public class Soldado extends Zombie{
	//CONSTRUCTOR
	public Soldado(int X,int Y,Juego j){
		super(200,10,100,X,Y,j);
		grafica.setIcon(new ImageIcon("C:/Users/User/Desktop/Zombies/zombie6normal.gif"));
	}
	
	//COMANDOS
	public void ataqueEspecial(){
		usoAtaqueEspecial=true;
		
	}

}
