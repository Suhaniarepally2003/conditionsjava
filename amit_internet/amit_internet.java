class amit{
public static void main(String [] args){
int usage = 1020;
String plan = "basic";
if(plan == "basic" && usage >= 500){
System.out.println("premium");
}
else if(plan == "standard" && usage >= 1000){
System.out.println("ultra");
}
else{
System.out.println("continue same plan");
}
}
}
