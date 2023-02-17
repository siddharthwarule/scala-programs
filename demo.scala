package Demo

import scala.io.StdIn.readInt
import scala.io.StdIn.readLine



// program for practicals

// program of multiplication of two matrix

object demp9{
  def main(args:Array[String]):Unit={

   var array1=Array.ofDim[Int](10,10);
    var array2=Array.ofDim[Int](10,10);
    var result=Array.ofDim[Int](10,10);

    println("Enter the length of matrix");
      val n= readInt();
   var i:Int=0;
    var j:Int=0;

    println("Enter the 1st matrix");

    for(i <- 1 .to(n)) {

      for(j <- 1 .to(n)) {
        array1(i)(j) = readInt();
      }
    }

    println("Enter the 2nd matrix");

    for(i <-1 .to(n);j <- 1.to(n)){
      array2(i)(j)=readInt();
    }

    for(i <-1 .to(n);j <- 1 . to(n); k <- 1 .to(n)){

      result(i)(j)= result(i)(j) + array1(i)(k) * array2(j)(k);

    }

    for (i <-1 to n){
      for(j <-1 to n){
        print(result(i)(j) +"  ");
      }
      println("");
    }


  }
}


// read two string and find the occurnce


object demo10{
  def main(args:Array[String]):Unit={

    println("ENTER THE FIRST STRING");
       var str1=  readLine();

    println("ENTER THE FIRST STRING");
      var str2= readLine();

    println(str1);
    println(str2);

//    var str1l =str1.length;
//    var str2l =str2.length;
//    var results=new Array[Char](30)
//    for (i <- 1 .to(str1l)){
//    for (j <- 1 .to(str2l)){
//
//      if(str1.charAt(i)==str2.charAt(j)){
//          results= str1.charAt(i);
//      }
//    }
//    }
//    println(results);
//     var res= str1.contains(str2);
  }
}

// program to covert into binnery and octal

object demo11{

  def octal(n: Int): Unit ={
    var num =n;
     var i =0;
    var B =new Array[Int](20);
    while (num>0){
      B(i)=num % 8;
      i =i+1;
      num= num/8;
    }
    println("\n the Octal of this number is :");

      for (y <- B){
        print(y);
      }
  }

  def binary(n:Int):Unit={
   var num = n;
    var i=0;
    var A =new Array[Int](10);
    while (num >0){
      A(i)=num%2;
      i =i+1 ;
      num=num/2;
    }

    println("\n The binary form of number is :")
      for (x <- A ){
        print(x);
      }

  }
  def main(args:Array[String]):Unit={

   println("Enter the number");
    var n =scala.io.StdIn.readInt();

    binary(n);
    octal(n);

  }
}




// abstract class order derive two claases purches order and sels order

object demo12{


  abstract class Order() {
    def printDetails(){}
  }

  class  purchesOrder(id:Int,desc:String) extends Order
  {
    override def printDetails(): Unit ={
      println("id :"+id+ "description :"+desc);
    }
  }

 class sellingOrder(id:Int,desc:String) extends Order {
   override def printDetails(): Unit ={
     println("id :"+id+ "description :"+desc);
   }

 }

  def main(args: Array[String]): Unit = {

    var sell = new sellingOrder(1 ,"mobile:Samsung");

    var purches =new purchesOrder(1,"mobile: Apple");

        print(purches);
        print(sell);

  def print(o:Order): Unit ={
     o.printDetails();
  }
  }

}




// create a map with empname departmtnt print detials

object Maps{


  val emp:Map[Int,String] = Map(1 -> "mr joshi", 2 -> "gura",3 ->"mithilesh",4 ->"ankit",5 ->"ajay");
  val dep = Map(1->"it",2->"electro",3->"comp",4->"it",5->"it");

  def main(args:Array[String]){

    var k:Int =0;
    var d :String="";

    var lastKey:Int=0;
    var name :String=""
      emp.keys.foreach{
        key =>
          if (emp(key)=="mr joshi"){
           k = key;
          }
      }

    dep.keys.foreach{
      key =>
        if (key == k){
         d = dep(key);
        }
    }

    println("the department of mr joshi is :"+d);

    println("the other people working on same department in "+d +"  is ")
    dep.keys.foreach{
      key=>
        if(dep(key)==d){
            lastKey=key;

          emp.keys.foreach{
            keys =>
              if (keys==lastKey){
                println(emp(keys))
              }
          }

        }
    }

  }
}




//merge two sets of integer and calculate

object sets {
  def main(args:Array[String]):Unit={

    val numberSet1:Set[Int]=Set(10,20,30,40,50);
    val numberSet2:Set[Int]=Set(60,70,80,90,100);

    val mergeSet:Set[Int]=numberSet2 ++ numberSet1;


    println("FIRST NUMBER SET IS :")
    println(numberSet1);
    println("SECOND NUMBER SET IS :")
    println(numberSet2);
    println("THE MEARGE SET IS :")
    println(mergeSet);

    var greater:Int=0;
    var smallest:Int=0;
    var sum:Int=0;


    greater = mergeSet.max;
    smallest = mergeSet.min



    println("the greater elements is :"+greater);
    println("the smallest elements is :"+smallest);


    mergeSet.foreach {
      sets =>
       sum=sum+sets;
    }

    println("the sum of merege set is :"+sum)

  }

}





// five  types of defing string

object list1 {
  def main (args:Array[String]):Unit={


    println("JAVA STYLE LIST")
    val list1:List[Int]=List(10,12,13,14,15,16);
    println(list1);

    println("LIST STYLE")
    val list2 =List("Sid","guru","mithilesh","ankit");
    println(list2);

    println("FILL METHOD")
    println(List.fill(10)(2));

    println("BY TABULETED FUNCTION")
    println(List.tabulate(10)(n=>n*2));

    println("BY RANGE METHOD");
    println(List(1::2::3::4::5::Nil));

  }
}


//perfect number sum between 1 to 100

object divisiblenum{

  def main(args:Array[String]): Unit ={

   var  k :Int=0;
    var l :Int=0;

    for (i <- 1 to 100){

      for (j <- 1 to 100){

        if (i % j == 0){

         k = k + i;
        }

        if (k == i){

          l =l + i;

        }


      }

    }
    println("the sum of perfect number between 1 to 100 is :"+l);
  }

}




object divisiblenum2 {

  def main(args: Array[String]): Unit = {


    def sumOfFactors(n:Int) :Any={

     var  sum :Int=0;

        for (i <- 1 to n){

          if (n % i==0){

            sum = sum + i;

          }

        }

      return sum;

    }

    var k: Int = 0;
    var totalSum: Int = 0;

    var arr =new Array[Int](103);

    for (i <- 1 to 100 ){
      arr(i)=i;
    }
for (i <- arr){

  var sums:Any = sumOfFactors(i);

//  println(sums)

   if (i == sums){

     totalSum = totalSum+i

   }

}

    println("the sum of perfect numbers between 1 to 100 is:"+totalSum);

  }
}


// defign a class saving account and approsiate the contractor

object classes
{

  class savingsAccount(names:String,acnos:Int,minB:Int=1000){

     var balance:Double =minB;
     var name :String="";
     var acno:Int=0;


     name=names;
     acno=acnos;


    def diposit(amo:Int): Unit ={

      balance= balance+amo;

    }
    def withdrow(amo:Int): Unit ={

      balance= balance-amo;

    }

    def showBalance():Unit ={

      println("Your Ac Balance is :")
      println(balance);

    }

    def showDetails(): Unit ={

      println("Saving Account Detials")
      println("Ac holder name :"+name);
      println("Ac No : "+acno)
      println("Your balance is :"+balance)
    }


  }

def main(args:Array[String]): Unit ={

  var obj1=new savingsAccount("sidharth warule",12345689);

  obj1.diposit(15000);
  obj1.showBalance();
  obj1.withdrow(1000);
  obj1.showBalance();

 obj1.showDetails();

}

}


//sort matrix by insersion sort


object  matrix {

  def main(args: Array[String]): Unit = {

    var no:Int=0;
    var flag:Boolean=false;
    var matrix = Array.ofDim[Int](10,10)


    println("Enter the no :");
    no=scala.io.StdIn.readInt();


for (i <- 1 to no) {
  for (j <- 1 to no) {

    matrix(i)(j) = scala.io.StdIn.readInt();


  }

}


  for (i <- 1 to no) {
    for (j <- 1 to no) {

      print(matrix(i)(j));

      if (matrix(i)(j) != 0) {

        flag = true;
      }
      else {
        flag = false;
      }

    }
    println();

  }

    if (flag==true){
      println("Your matrix is Upper Triangular ");
    }

  else {
      println("Your matrix is not Upper Triangular");
    }


  }

  }









