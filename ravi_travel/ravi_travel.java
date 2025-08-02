class ravi{
public static void main(String [] args){
int age = 16;
Boolean haspassport = false;
Boolean hasnocriminalRecord = true;
if(age >= 18 && haspassport == true && hasnocriminalRecord == true){
System.out.println("elligible for visa");
}
else if(age >= 18 && haspassport == false && hasnocriminalRecord == true){
System.out.println("apply for passport first");
}
else{
System.out.println("not eligible");
}
}
}

