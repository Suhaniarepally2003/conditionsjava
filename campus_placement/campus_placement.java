class placement{
public static void main(String [] args){
double cgpa =7.5;
int attendance = 88;
Boolean hasnobacklog = false;
if(cgpa>= 7 && attendance>=75 && hasnobacklog == true){
System.out.println("eligible");
}
else if(cgpa>=6.5 && attendance>=80 && hasnobacklog== false){
System.out.println("eligible for tier-2 companies");
}
else{
System.out.println("not eligible");
}
}
}