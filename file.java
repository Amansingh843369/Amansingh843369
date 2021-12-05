// import java.io.File;

// class file{

// public static void main(String[] args){

//  File f=new File("C:\\Users\\Client\\Desktop\\2.txt");



//     System.out.print("File info :"+f.getName()+"\n" );
//     System.out.print("File info :"+f.getAbsolutePath()+"\n");

//     System.out.print("File info :"+f.canRead()+"\n");

//     System.out.print("File info :"+f.length()+"\n");

import java.util.Scanner;



class file{

   static void  bag(){
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter number of rows: "); // takes input from user

    int rows = sc.nextInt();
     
    for (int i= 0; i<= rows; i++)
    {
        for (int j=1; j<=rows-i; j++)
        {
            System.out.print(" ");
        }
        for (int k=0;k<=i;k++)
        {
            System.out.print("*");
        } 
            System.out.println("A");
    }
    sc.close();

}
   
 public static void main(String[] args) {
    bag();

}





}
    
// }

















// }