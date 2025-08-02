class customer{
public static void main(String [] args){
int amount = 3500;
Boolean ismember = false;
Boolean hascoupan = false;
if(amount>5000 && ismember == true){
System.out.println("25 percent discount");
}
else if(amount>3000 && ismember == true && hascoupan == true){
System.out.println("20 percent discount");
}
else if(amount>3000 &&(ismember == true || hascoupan == true)){
System.out.println("10 percent discount");
}
else{
System.out.println("no discount");
}
}
}
