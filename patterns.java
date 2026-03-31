import java.util.*;
class patterns{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int i,j;
for(i=0;i<=5;i++){
for(j=0;j<=5;j++){
if(j>i){
System.out.print("*");
}
}
System.out.println(" ");
}
}
}