
public class player {
   private String name;
   private char symbol;
   
   player(String name,char symbol){
	   setName(name);
	   setSymbol(symbol);
   }

public void setSymbol(char symbol) {
	// TODO Auto-generated method stub
	if(symbol!='\0') {
		this.symbol=symbol;
	}
}

public void setName(String name) {
	// TODO Auto-generated method stub
	if(!name.isEmpty()) {
		this.name=name;
	}
}
public String getName() {
	return this.name;
}
public char getSymbol() {
	return this.symbol;
}

}
