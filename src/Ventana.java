import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Ventana extends javax.swing.JFrame {

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Ventana inst = new Ventana();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	//ATRIBUTOS DE INSTANCIA
	protected Juego juego;
	protected JPanel JPanelInicio;
	private JLabel JLabelDerrota;
	protected JPanel JPanelFondo;
	protected JLabel JLabelFondoJuego;
	protected JLabel JLabelFondoInicio;
	protected JDialog JDialogDerrota;
	protected JButton JButtonReiniciar,JButtonMenu;
	
	protected JButton BtnSalir;
	protected JButton BtnIniciarJuego;

	public Ventana() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(800,640);
			setLayout(null);
			setTitle("Humanos Vs Zombies");
			setResizable(false);
			
			presentacionJuego();
			
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	private void presentacionJuego(){
		JPanelInicio = new JPanel();
		getContentPane().add(JPanelInicio);
		JPanelInicio.setBounds(0, 0, 800, 600);
		JPanelInicio.setLayout(null);

		JLabelFondoInicio = new JLabel();
		JPanelInicio.add(JLabelFondoInicio);
		JLabelFondoInicio.setBounds(0, 0,800,600);
		JLabelFondoInicio.setIcon(new ImageIcon(getClass().getClassLoader().getResource("FondoInicio.jpg")));
		JLabelFondoInicio.setOpaque(true);

		{
			BtnIniciarJuego = new JButton();
			JLabelFondoInicio.add(BtnIniciarJuego);
			BtnIniciarJuego.setBounds(314, 331, 199, 50);
			BtnIniciarJuego.setText("Iniciar Juego");
			BtnIniciarJuego.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					BtnIniciarJuegoMouseClicked(evt);
				}
			});
		}
		
		{
			BtnSalir = new JButton();
			JLabelFondoInicio.add(BtnSalir);
			BtnSalir.setText("Salir");
			BtnSalir.setBounds(314, 430, 201, 47);
			BtnSalir.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					BtnSalirMouseClicked(evt);
				}
			});
		}
		
	}
	
	private void iniciarJuego(){
		
		JPanelFondo = new JPanel();
		getContentPane().add(JPanelFondo);
		JPanelFondo.setBounds(0, 0, 800, 600);
		JPanelFondo.setLayout(null);

		JLabelFondoJuego = new JLabel();
		JPanelFondo.add(JLabelFondoJuego);
		JLabelFondoJuego.setBounds(0, 0,800,600);
		JLabelFondoJuego.setIcon(new ImageIcon(getClass().getClassLoader().getResource("FondoJuego.jpg")));

		juego=new Juego();	
		juego.start();
	
		(new HiloGrafica(juego,JLabelFondoJuego,this)).start();
		
	}
	public void derrota(){
		JDialogDerrota=new JDialog(this,"Has perdido");
		
		JDialogDerrota.setVisible(true);
		JDialogDerrota.setLayout(null);
		JDialogDerrota.setBounds(410,260,380, 199);
		JDialogDerrota.setDefaultCloseOperation(0);

		{
			JButtonReiniciar=new JButton("Reiniciar");
			JDialogDerrota.add(JButtonReiniciar);
			JButtonReiniciar.setBounds(8, 91, 169, 40);
			JButtonReiniciar.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					JButton1MouseClicked(evt);
				}
			});

			}
		{
			JButtonMenu=new JButton("Menu Principal");
			JDialogDerrota.add(JButtonMenu);
			JButtonMenu.setBounds(188, 91, 165, 40);
			JButtonMenu.setSize(169, 40);
			JButtonMenu.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					JButton2MouseClicked(evt);
				}
			});
		}
		{
			JLabelDerrota = new JLabel();
			JDialogDerrota.getContentPane().add(JLabelDerrota);
			JLabelDerrota.setText("       Has perdido, ¿Quieres volver a jugar o ir al menú principal?");
			JLabelDerrota.setBounds(0, 12, 364, 52);
			JLabelDerrota.setBackground(new java.awt.Color(255,128,128));
		}
	}
	
	private void BtnIniciarJuegoMouseClicked(MouseEvent evt) {
		System.out.println("BtnIniciarJuego.mouseClicked, event="+evt);
		//TODO add your code for BtnIniciarJuego.mouseClicked
		getContentPane().remove(JPanelInicio);
		iniciarJuego();
	}
	
	private void BtnSalirMouseClicked(MouseEvent evt) {
		System.out.println("BtnSalir.mouseClicked, event="+evt);
		//TODO add your code for BtnSalir.mouseClicked
		System.exit(0);
	}
	
	private void JButton1MouseClicked(MouseEvent evt) {
		System.out.println("JButton1.mouseClicked, event="+evt);
		//TODO add your code for JButton1.mouseClicked
		getContentPane().removeAll();
		JDialogDerrota.dispose();
		iniciarJuego();	
	}
	
	private void JButton2MouseClicked(MouseEvent evt) {
		System.out.println("JButton2.mouseClicked, event="+evt);
		//TODO add your code for JButton2.mouseClicked
		getContentPane().removeAll();
		JDialogDerrota.dispose();
		presentacionJuego();
	}

}
