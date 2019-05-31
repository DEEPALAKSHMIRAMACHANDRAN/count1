import java.util.*;
public class count {
public static void main(String[] args) {
int a,temp=0,rem=0,count=0;
Scanner in=new Scanner(System.in);
a=in.nextInt();
int n=0;
for(int i=1;i<=a;i++) {

temp=i;
while(temp>0) {
rem=temp%2;
n=n+rem;
temp=temp/2;
if(rem==1)
count++;
}
}
System.out.println(count);
}
}