package javaprojectEkta;

public class IfelseClass {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int[] intarray= new int[] {10,20,30,40};
		int[] intarray= { 10,20,30,40};
  int a=intarray.length;	
for(int i=0; i<a; i++)	
{
	
if(intarray[i]<=10)
	System.out.println(intarray[i]+"  you have to be more smart");
else if(intarray[i]>=10&&intarray[i]<=20)
	System.out.println(intarray[i]+"  you are great");
	else if(intarray[i]>=20&&intarray[i]<=30)
		System.out.println(intarray[i]+"  you are wonderful");
	else
		System.out.println(intarray[i]+"  you are awesome");
	
}}

}
