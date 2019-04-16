import javax.swing.ImageIcon;


public class Resucitador extends Zombie{
	//ATRIBUTOS DE INSTANCIA
	
	//CONSTRUCTOR
	public Resucitador(int X,int Y,Juego j){
		super(100,15,50,X,Y,j);
		grafica.setIcon(new ImageIcon("C:/Users/User/Desktop/Zombies/zombie5normal.gif"));
	}
	
	//COMANDOS
	public void ataqueEspecial(){
		usoAtaqueEspecial=true;
		
	}



}
