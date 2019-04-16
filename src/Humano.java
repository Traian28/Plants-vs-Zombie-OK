import javax.swing.JLabel;


public abstract class Humano extends JLabel implements Runnable{
	//ATRIBUTOS DE INSTANCIA
	protected int daño;
	protected int velocidadDisparo;
	protected int disponibilidad;
	protected int costo;
	protected int puntaje;
	protected boolean puedeAtacar;
	protected int columna,fila;
	protected int x,y;
	protected boolean bloqueado;
	protected JLabel grafica;
	
	//CONSTRUCTOR
	public Humano(int da,int vD,int d,int c,int p, int f, int col){
		daño=da;velocidadDisparo=vD;disponibilidad=d;
		costo=c;puntaje=p;puedeAtacar=true; fila=f;columna=col;
		x=columna*100; y=fila*100;bloqueado=false;
		grafica=new JLabel();
		
	}
	
	//COMANDOS
	public void atacar(Zombie z){
		z.atacado(daño);
	}
	public void infectado(){
		daño-=daño*0.3;
		velocidadDisparo+=2;
	}
	public void setPuedeAtacar(boolean p){
		puedeAtacar=p;
	}
	public void run(){
		
		
	}
	
	//CONSULTAS
	public int getVelocidadDisparo(){
		return velocidadDisparo;
	}
	public int getDisponibilidad(){
		return disponibilidad;
	}
	public int getCosto(){
		return costo;
	}
	public int getPuntaje(){
		return puntaje;
	}
	public boolean getPuedeAtacar(){
		return puedeAtacar;
	}
	public boolean estaBloqueado(){
		return bloqueado;
	}
	public int getPosX(){
		return x;
	}
	public int getPosY(){
		return y;
	}
	public int getFila(){
		return fila;
	}
	public int getColumna(){
		return columna;
	}
	public JLabel getGrafica(){
		return grafica;
	}
	
}
