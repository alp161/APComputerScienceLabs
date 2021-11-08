import javax.swing.JFrame; 

public class Main
   
   {

     public static void main(String[] args)
   {
   
  JFrame obj = new JFrame(); 
  GamePlay gameplay = new GamePLay();
  obj.setBounds(10,10,700,600);
  obj.setTitle("Brick Game");
  obj.setResizable(false);
  obj.setVisible(true);
  obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  obj.add(gameplay);

}
}
