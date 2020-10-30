class Sports
{
void types()
{
System.out.println("there are 2 type of sports indoor and outdoor");
}
}
class Indoor extends Sports
{
void indoorGames()
{
System.out.println("examples of indoor games: carroms,chess...");
}
void outdoorGames()
{
System.out.println("examples of outdoor games: cricket,football...");
}
}
class Chess extends Indoor
{
void chessGame()
{
System.out.println("chess is a indoor game and playing chess increases your knowledge");
}
}
class Multiple2
{
public static void main(String args[])
{
Chess ch=new Chess();
ch.types();
ch.indoorGames();
ch.outdoorGames();
ch.chessGame();
}
}