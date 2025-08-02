public class kiran_movie{
public static void main(String [] args){
String day="weekday";
String seat="normal";
if(day ==  "weekend" && seat == "vip"){
System.out.println("ticket price is 500");
}
else if(day == "weekend" && seat ==  "normal"){
System.out.println("ticket price is 300");
}
else if(day == "weekday" && seat == "vip"){
System.out.println("ticket price is 400");
}
else{
System.out.println("ticket price is 200");
}
}
}
