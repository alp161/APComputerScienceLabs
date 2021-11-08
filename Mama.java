public class Mama extends Applet implements Runnable {

    int width, height;
    int x = 200;
    int y = 200;
    int dx = 1;
    Image img1, img2, img3, img4;

    @Override
    public void init(){
        setSize(627, 373);
        Thread t = new Thread(this);
        img1 = getImage(getCodeBase(),"Background.png");
        img2 = getImage(getCodeBase(), "boat.png");
        img3 = getImage(getCodeBase(), "LeftPalm.png");
        img4 = getImage(getCodeBase(), "RightPalm.png");

    }

    @Override
    public void paint(Graphics g){
        g.drawImage(img1, 0, 0, this);
        g.drawImage(img2, 200, 200, this);
        g.drawImage(img3, 40, 100, this);
        g.drawImage(img4, 450, 130, this);
    }

    @Override
    public void run() {
        while(true){

            x += dx;
            repaint();
            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                System.out.println("Thread generates an error.");
            }
        }
    }
} 