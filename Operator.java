/*
 Definition
 -------------
 Operators are special symbols that perform specific operations on one, two, or three operands,
 and then return a result.

 --> Based on the no of operands java operators are divided into 3 parts
   1.Unary Operator
   2.Binary Operator
   3.Ternary Operator

 */
public class Operator {

  public static void main(String[] args) {
/*Unary operator*/

    /*
     * It is of 2 types
     * i. Increment operator --> Increase the value of a variable by 1
     * ii.Decrement operator --> Decrease the value of a variable by 1
     * 
     * Increment Operator
     * -------------------
     * a)Pre increment(++x)
     * b)Post increment(x++)
     * 
     * Decrement Operator
     * --------------------
     * a)Pre decrement(--x)
     * b)Post decrement(x--)
     * 
     * 
     */
    int m4 = 20;
    int z = ++m4;//First m4 will increase by one and then the value of m4 will assign to z(pre increment)
    int z1 = m4++;//First the value of m4 will assign to z and then m4 will increase by one(post increment)

    System.out.println(z);
    System.out.println(z1);

    //Example
    
    int z3 = 10;
    z3++;
    System.out.println(z3);//11
    ++z3;
    System.out.println(z3);//12
    int m5 = z3++;
    System.out.println(z3);//13
    System.out.println(m5);//12
    m5 = ++z3;
    System.out.println(z3);//14
    System.out.println(m5);//14

    int m6 = 40;
    System.out.println(++m6);//41
    System.out.println(m6++);//41
    System.out.println(++m6);//43
    System.out.println(m6++);//43

/* Binary operator */


  /* Arithmetic Operator */
    int a = 10;
    int b = 2;
    System.out.println(a + b);// 12
    System.out.println(a - b);// 8
    System.out.println(a * b);// 20
    System.out.println(a / b);// 5
    System.out.println(a % b); // 0

    /*
     * / ---> division --> Quotient
     * % ---> remainder --> Remainder
     * 
     * 
     * 
     * If we are using any arithmetic operators between two variables x and y,the
     * resultant type is always of
     * max(int,type of x,type of y).
     * 
     * 
     */
    int x = 45;
    double y = 30;
    double result = x + y;
    System.out.println(result);
    // max(int,int,double)

    byte b1 = 4;
    byte b2 = 5;
    int result1 = b1 + b2;
    System.out.println(result1);
    // max(int,byte,byte)

    /*
     * byte + short = int
     * short + short = int
     * int + long = long
     * long + float = float
     * 
     * 
     * b -----> s ------> i -------> l ------> f ------> d
     *                  /
     *                /
     *              /
     *            c 
     * /
     * The size of the memory where we store decimal number is always larger than the memory where we store integer number.
     * 
     */
    String arr[] = new String[2];
    System.out.println(arr[0]);
    /*String concatenation*/
    int m = 1;
    String s = "Soumya";

    String result_string_contacatenation = m + s;
    System.out.println(result_string_contacatenation);

    String p = "abc";
    int d = 10;
    int e = 20;
    int f = 30;
    
    System.out.println(p+d+e+f);//abc102030
    System.out.println(d+p+e+f);//10abc2030
    System.out.println(d+e+p+f);//30abc30
    System.out.println(d+e+f+p);//60abc

   // p = d+e+f; CE:Bcz expression will return int but we can't store int value in string
    d = e+f;
  //d = p+d+f; CE: Bcz the expression will return string value but we can't store string in int.
   d = d+e+f;

  /* Relational Operator */

    System.out.println(10<20); //true
    System.out.println('a' > 97.5); // false
  /*
  Relational operator is not applicable for non-premitive datatype
  System.out.println(true>false);//CE
  Relational operator is applicable for every primitive data type except boolean
  System.out.println("abc123">"abc");//CE
  Nesting of relational operator is not allowed
  System.out.println(10<20<30); //CE
  */
 
  /* Bitwise Operator */
  /*
    a&b --> it returns true if both arguments are true.
    a|b --> it returns true if any one of the argument is true.
    a^b --> it returns true if both arguments are different
  */
  System.out.println(true&false);//false
  System.out.println(true | false);//true
  System.out.println(true^false);//true

 //Bitwise operator is applicable for integer number

  System.out.println(4 & 5);//4
  System.out.println(4 | 5);//5
  System.out.println(4 ^ 5);//1
  
  /* Logical Operator */

   /*
    a && b ---> b will be executed iff a is true
    a || b ---> b will be executed iff a is false

    -> Execution of second argument of logical operator is optional

    */

    int x1 = 20;
    int y1 = 40;
    if(++x1 < 20 && ++y1 > 40){
      x1++;
    }else{
      y1++;
    }
    System.out.println(x1);//21
    System.out.println(y1);//41

  /* Bitwise Complement Operator */

  System.out.println(~4);//-5
  System.out.println(~(-4));//3
   //This operator is applicable for integer but not for boolean

  //System.out.println(~true);//CE
 
  /*
  For(1), ~ --> means ~(+1)/Add(+1) and then change the sign
  so (~4) --> (4+1) = 5 put '-' =  -5
  */

  /* Boolean Complement Operator */

 // System.out.println(!4);//CE
 System.out.println(!true);//false

 //this operator is only applicable for boolean but not for integer


  /* Equality Operator */

  System.out.println(10==20);//false
  System.out.println('a' == 97.0);//true
  System.out.println(false == false);//true

  //Equality operator is applicable for every primitive data type.
  //It is also applicable for non premitive data types(object types)
  /** 
   * POINT TO REMEMBER(PTR):
   * Every java class is a non premitive data type.
   * Now two objects can have same reference variable
   * 
   * */
  //Comparison will happen when there is some relation
  //We can compare objects of different classes but there must have some relations between those classes
  // x == y -->It returns true if both references are pointing towards the same object
    Operator op1 = new Operator();
    Operator op2 = new Operator();
    Operator op3 = op1;
    System.out.println(op1 == op2);//false
    System.out.println(op1 == op3);//true;
    System.out.println(op3 == op2);//false

    String s1  = new String();
    Object o = new Object();

    System.out.println(s1 == o);//false
    System.out.println(o == op1);//false
   //System.out.println(s1 == op1);//CE
 
   //System.out.println(op1 == 10);//CE:Because there is not relation between op1 and 10(op1 belongs to non premitive & 10 belongs to premitive)
  
   System.out.println(op1 == null);//false
   Operator op4 = null;
   System.out.println(op4 == null);//true

     /* Assignment Operator */

     //1.1 Simple assignment operator
     int am = 44;
     System.out.println(am);
     //1.2 Chained assignment operator
     int h,i,j,k;
     h=i=j=k=24;
     System.out.println(h+" "+i+" "+j+" "+k+" ");//24 24 24 24

     //1.3 Compound assignment operator
     int l = 50;
     l+=40;
     System.out.println(l);//90

     //int t=u=v=w=60;//CE

     int b3,c3,d3;
     int a3 = b3=c3=d3=20;
    //Operation starts from right side
     a3+=b3-=c3*=d3/=2;
     System.out.println(a3);//-160
     System.out.println(b3);//-180  
     System.out.println(c3);//200
     System.out.println(d3);//10

/* Ternary Operator */
  /**
   * Syntax
   * ---------
   * 
   * Condition ? statement1 : statement2
   * 
   * if condition is true then statement1 will be executed and if condition is false then statement2 will be executed
   * 
   * 
   */
 int x3 = (10<20)?30:40;
 System.out.println(x3);//30

 int x4 = ((10<20)?((30>40)?50:60):((70<80)?90:100));
 System.out.println(x4);//60

  }
}