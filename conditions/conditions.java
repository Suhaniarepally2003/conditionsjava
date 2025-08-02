class priya_shopping{
public static void main(String [] args){
int amount=400;
boolean hasmember =true;
if(amount>=10000 && hasmember){
System.out.println("she gets 30 percent discount");
}
else if(amount>=5000 && hasmember){
System.out.println("she gets 20 percent discount");
}
else{
System.out.println("she gets 5 percent discount");
}
}
}