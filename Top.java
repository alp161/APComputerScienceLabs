class Animal { 
public void description() 
{
System.out.println("Any animal, land, water or air"); 
}
class Mammal extends Animal { 
public void description() 
{
 } 
 } 
class Cat extends Mammal { 
public void description() { 
System.out.println("From small house cat to Bengal tiger"); 
}
}
}