package main.scala.chapter01

object digui {

  def main(args: Array[String]): Unit = {
    //递归
    //阶乘
    def  jiechen(i:Int):Int  ={
     if (i==1){
       1
     } else{
       i*jiechen(i-1)
     }
    }

    println(jiechen(4));
  }

}
