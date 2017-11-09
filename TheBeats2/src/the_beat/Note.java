package the_beat;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread{

	private Image notebasicImage = new ImageIcon(Main.class.getResource("../images/notebasic.png")).getImage(); 
	private int x, y=580-(1000/Main.SLEEP_TIME* Main.NOTE_SPEED) * Main.REACH_TIME; //-120 y 1�ʿ� 580  
	private String noteType;
	private boolean proceeded = true;
	
	public String getNoteType() {
		return noteType;
	}
	
	public boolean isProceeded() {
		return proceeded;
	}
	
	public void close() {
		proceeded = false;
	}
	
	public Note(String noteType) { //x�������� 
		if(noteType.equals("S")) {
			x=228;
		}	
		else if(noteType.equals("D")) {
			x=332;
		}
		else if(noteType.equals("F")) {
			x=436;
		}
		else if(noteType.equals("J")) {
			x=540;
		}
		else if(noteType.equals("K")) {
			x=644;
		}
		else if(noteType.equals("L")) {
			x=748;
		}
		this.noteType=noteType;
	}
	
	public void screenDraw(Graphics2D g) {
		g.drawImage(notebasicImage, x, y, null);	//�� ��Ʈ�ϱ� 
	}
	
	public void drop() {
		y += Main.NOTE_SPEED;	
		if( y>620 ) {
			System.out.println("Miss");
			close();
		}
		
	}
	
	@Override
	public void run() {
		try {
			while(true) { //1�ʿ� 700�ȼ� ��ŭ �Ʒ������� ������ 
				drop();
				if(proceeded) {
					Thread.sleep(Main.SLEEP_TIME);
				}
				else {
					interrupt();
					break;
				}
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public String judge() {
	      if(y>= 670) {
	         System.out.println("Miss");
	         close();
	         return "Miss";
	      }
	      else if( y>=650) {
	         System.out.println("Bad");
	         close();
	         return "Bad";

	      }
	      else if( y>=630) {
	         System.out.println("Good");
	         close();
	         return "Good";

	      }
	      else if( y>=560) {
	         System.out.println("Perfact");
	         close();
	         return "Perfact";

	      }
	      else if( y>=520) {
	         System.out.println("Good");
	         close();
	         return "Good";

	      }
	      else if( y>=500) {
	         System.out.println("Bad");
	         close();
	         return "Bad";

	      }
	      return "None";
	}
	public int getY() {
		return y;
	}
}
