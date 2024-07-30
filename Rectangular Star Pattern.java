
class main {
    static void pattern(int N)
 {
     for (int i = 0; i < N; i++)     // Outer  loop for the rows
     {
         for (int j = 0; j < N; j++)  // Inner loop for columns ,which will print star
         {
             System.out.print("* ");
         }
         System.out.println(); // To move to the nextline
     }
 }
     public static void main(String[] args) {
         int N = 5;
         pattern(N);
     }
 }


Output:  

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
