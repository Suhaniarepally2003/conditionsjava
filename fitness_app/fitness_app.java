class fitness{
public static void main(String [] args){
int age = 28;
int bmi = 28;
boolean hasnoheartcondition = true;
if(age<40 && bmi<=25 && hasnoheartcondition == true){
System.out.println("High intensity program");
}
else if(age<60 &&(bmi<=30 || hasnoheartcondition == false)){
System.out.println("moderate program");
}
else{
System.out.println("consult doctor first");
}
}
}
