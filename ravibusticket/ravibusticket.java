public class ravibusticket{
public static void main(String[] args){
int distance=200;
Boolean weekday='false';
if(distance<50){
System.out.println("fare 50");
}
else if(distance>50 && distance<100){
System.out.println("fare 100");
}
else if(distance>100 && weekday){
System.out.println("fare 200");
}
else{
System.out.println("fare 300");
}
}
}