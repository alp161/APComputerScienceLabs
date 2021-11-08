import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

class Comstumer
{
private double gameprice;
private int numGames;

public Comstumer()
{
   gameprice=0;
   numGames=0;
}

public Comstumer(double a, int b)
{
   gameprice=a;
   numGames=b;
}
public String getgameprice()
{
   return "the total price of the games is " + gameprice;
}
public String getnumGames()
{
   return " you have" + numGames + "games";
}
public String checkhowmuch()
{
   return "I bought "+getnumGames()+" and I plaied "+getgameprice()+" dollars.";
}

}


class credicard extends Comstumer
{
private int specialgamepoints;

public credicard(double x, int y)
{
   super(x, y);
   specialgamepoints=120;

}
public  credicard(double x, int y, int z)
{
   super(x, y);
   specialgamepoints=z;

}
public String getspecialgamepoints()
{
   return  "you have" + specialgamepoints + "specialgamepoints";
}
public String greeting()
{
   return  "You have "+getspecialgamepoints()+ "";
}


}

class personal extends credicard
{
private int years;
public personal(double x, int y, int z)
{
   super(x,y,z);
   years=0;

}
public personal(double x, int y, int z, int h)
{
   super(x,y,z);
   years=h;

}
public String getYears()
{
   return "you played for" + years;
}
public String ThankyouStatement()
{
   return "Thank you for using our creditcard for "+getYears()+" years " ;
}


}