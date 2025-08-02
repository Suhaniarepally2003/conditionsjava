class Sunitha{
public static void main(String [] args){
int age = 25;
Boolean certificate= true;
if(age>=18 && age<=45 && certificate == true){
System.out.println("she can participate");
}
else if(age<18 || age>45){
System.out.println("participation not allowed");
}
else{
System.out.println("participation denied");
}
}
}
