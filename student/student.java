public class student{
public static void main(String [] args){
int percentage =99;
Boolean sportscertificate = false;
int familyincome = 300000;
Boolean volunteerexperience = false;
if(percentage>=90 && sportscertificate == true && familyincome <= 200000){
System.out.println("full scholarship");
}
else if(percentage>=85 && (sportscertificate == true || volunteerexperience == true)){
System.out.println("partial scholarship");
}
else{
System.out.println("no scholarship");
}
}
}