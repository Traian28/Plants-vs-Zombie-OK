
public class Atleta extends Zombie{
	//ATRIBUTOS DE INSTANCIA
	
	//CONSTRUCTOR
	public Atleta(int X, int Y,Juego j){
		super(150,15,50,X,Y,j);
	}
	
	//COMANDOS

	public void ataqueEspecial(){
		usoAtaqueEspecial=true;
		
	}
	

}
