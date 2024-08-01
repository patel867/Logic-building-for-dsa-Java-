// Rectangular Star Pattern
class main {
    static void pattern(int n)
 {
     for (int i = 0; i < n; i++)     // Outer  loop for the rows
     {
         for (int j = 0; j < n; j++)  // Inner loop for columns ,which will print star
         {
             System.out.print("*");
         }
         System.out.println(); // To move to the nextline
     }
 }
     public static void main(String[] args) {
         int n = 5;
         pattern(n);
     }
 }


Output:  

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 


//Right-Angled Triangle Pattern
class main {
    static void pattern(int n)
 {
     for (int i = 0; i < n; i++)     // Outer  loop for the rows
     {
         for (int j = 0; j <= i; j++)  // Inner loop for columns ,which will print star
         // no. of columns = row number for each line here
         {
             System.out.print("*");
         }
         System.out.println(); // To move to the nextline
     }
 }
     public static void main(String[] args) {
         int n = 5;
         pattern(n);
     }
 }

Output:

* 
* * 
* * * 
* * * * 
* * * * * 


//Right-Angled Number Pyramid
class main {
    static void pattern(int n)
 {
     for (int i = 0; i < n; i++)     // Outer  loop for the rows
     {
         for (int j = 0; j <= i; j++)  // Inner loop for columns ,which will print star
         {
           //   Here, we print numbers from 0 to the row number
          // instead of stars in each row.
             System.out.print(j);
         }
         System.out.println(); // To move to the nextline
     }
 }
     public static void main(String[] args) {
         int n = 5;
         pattern(n);
     }
 }


Output:

0
01
012
0123
01234

    
// Right-Angled Number Pyramid - II
    class main {
    static void pattern(int n)
 {
     for (int i = 0; i < n; i++)     // Outer  loop for the rows
     {
         for (int j = 0; j <= i; j++)  // Inner loop for columns ,which will print star
         {
             System.out.print(i);
         }
         System.out.println(); // To move to the nextline
     }
 }
     public static void main(String[] args) {
         int n = 5;
         pattern(n);
     }
 }

Output:

0
11
222
3333
44444


//Inverted Right Pyramid

   class main {
   static void pattern(int n)
{
    for (int i = 0; i < n; i++)
    {
       // no. of columns = (n - row index).
        for (int j = n; j > i; j--)
        {
            System.out.print("* ");
        }
        // next row and give a line break otherwise all stars
        System.out.println();
    }
}
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}

Output:
* * * * * 
* * * * 
* * * 
* * 
* 

// Inverted Numbered Right Pyramid
class main
{
   static void pattern(int n)
{
    for (int i = 0; i < n; i++)
    {
        // no. of columns = (n - row index) 
        // (n-j) will give us the numbers in a row starting from 1 to n-i to print an inverted pyramid.
        for (int j = n; j > i; j--)
        {
            System.out.print(n-j+1+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) 
    {
        int n = 5;
        pattern(n);
    }
}
    

Output:
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 


