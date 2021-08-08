//19000936

import scala.io.StdIn._
object CaesarCipher extends App{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val shift = (readLine("Enter shift Encrypt-positive no, Decrypt-negetive no: ").toInt + alphabet.size) % alphabet.size

  val input  = readLine("String: ")

  val output = input.map((c: Char)=>{ 

     val x = alphabet.indexOf(c.toUpper)

     if (x == -1){
	 c
     }
     else{
	 alphabet((x + shift) % alphabet.size)
     } 
   })

   println(output);
}