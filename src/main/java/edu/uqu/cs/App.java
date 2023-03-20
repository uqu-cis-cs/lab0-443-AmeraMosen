package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/


public class App{
      public static void main(String[] args) {
         twisters();

        Scanner inpu = new Scanner(System.in);
        System.out.println("enter a word");
        String str = inpu.nextLine();
        phoneKeypad(str);
    }
        public static void twisters (){
 for(int i=1; i<111; i++){
            
                if( i%2!=0 & i%4!=0 & i%6!=0)
                System.out.print(" "+i);
                if(i%2==0)
                System.out.print(" Tweetle");
                if(i%4==0)
                System.out.print(" Beetle");
                if (i%6==0)
                System.out.print(" Poodle");
              if(i%11==0) {       
             System.out.println(" ");
             }
                    
         }
        }

        public static void phoneKeypad(String str){
              str = str.toLowerCase();
               for(int i=0; i<str.length(); i++){
                   switch( str.charAt(i)) {
                   case 'a':
                   case 'b':
                   case 'c':
                   System.out.print("2"); break;
                   case 'd':
                   case 'e':
                   case 'f':
                    System.out.print("3"); break;
                   case 'g':
                   case 'h':
                   case 'i':
                    System.out.print("4"); break;
                   case 'j':
                   case 'k':
                   case 'l':
                    System.out.print("5"); break;
                   case 'm':
                   case 'n':
                   case 'o':
                    System.out.print("6"); break;
                   case 'p':
                   case 'q':
                   case 'r':
                   case 's':
                    System.out.print("7"); break;
                   case 't':
                   case 'u':
                   case 'v':
                    System.out.print("8"); break;
                   case 'w':
                   case 'x':
                   case 'y':
                   case 'z':
                    System.out.print("9"); break;
                    
                   }}}
               
}
