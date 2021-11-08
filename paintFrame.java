//Where instance variables are declared:
Image stars;
Image rocket;

...//In the init() method:
stars = getImage(getCodeBase(), "../images/starfield.gif");
rocket = getImage(getCodeBase(), "../images/rocketship.gif");

...//In the update() method:
//Paint the frame into the image.
paintFrame(offGraphics);

...//A new method:
void paintFrame(Graphics g) {
    Dimension d = size();
    int w;
    int h;

    //If we have a valid width and height for the background image,
    //draw it.
    w = stars.getWidth(this);
    h = stars.getHeight(this);
    if ((w > 0) && (h > 0)) {
        g.drawImage(stars, (d.width - w)/2,
                    (d.height - h)/2, this);
    }

    //If we have a valid width and height for the background image,
    //draw it.
    w = rocket.getWidth(this);
    h = rocket.getHeight(this);
    if ((w > 0) && (h > 0)) {
        g.drawImage(rocket, ((frameNumber*5) % (w + d.width)) - w,
                    (d.height - h)/2, this);
    }
}