import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import TDADiccionario.*;

public class Tablero{
	//ATRIBUTOS DE INSTANCIA
	protected Dictionary<Integer,Humano> humanos;
	protected Dictionary<Integer,Zombie> zombies;
	protected LinkedList<Dinero> dinero;
	
	//CONSTRUCTOR
	public Tablero(){
		humanos=new HashTableDictionary<Integer,Humano>();
		zombies=new HashTableDictionary<Integer,Zombie>();
		dinero=new LinkedList<Dinero>();
	}
	
	//COMANDOS
	public void colocarZombie(Zombie z){
		try {
			zombies.insert(z.getFila(),z);
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void retirarZombie(Zombie z){
		try {
			zombies.remove(new Entrada<Integer,Zombie>(z.getFila(),z));
		} catch (InvalidEntryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void colocarHumano(Humano h){
		try {
			humanos.insert(h.getFila(), h);
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void retirarHumano(Humano h){
		try {
			humanos.remove(new Entrada<Integer,Humano>(h.getFila(),h));
		} catch (InvalidEntryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void colocarDinero(Dinero d){
		dinero.add(d);		
	}/*
<<<<<<< .mine
	public void avanzarZombies(Juego j){
		Zombie z;Iterator<Entry<Integer,Zombie>> it=zombies.entries().iterator();
		while((it.hasNext())&&(j.sigueJuego())){
			z=it.next().getValue();
			if(!z.estaBloqueado()){
				z.avanzar();
				if(z.getColumna()==0)
					j.setSigueJuego(false);
				else (new HiloZombie(z)).start();}}			
	}*/
=======
>>>>>>> .r45
	public void retirarDinero(Dinero d){
		dinero.remove(d);
	}
	
	//CONSULTAS
	public boolean hayZombieFila(int fila){
		boolean hay=false;
		try {
			if(zombies.find(fila)!=null)
				hay=true;
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hay;
	}
	public boolean hayHumanoFila(int fila){
		boolean hay=false;
		try {
			if(zombies.find(fila)!=null)
				hay=true;
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hay;
	}
	public Iterator<Zombie> getZombies(){
		LinkedList<Zombie> aux=new LinkedList<Zombie>();
		for(Entry<Integer,Zombie> e:zombies.entries())
			aux.add(e.getValue());
		return aux.iterator();
	}
	
	
}
