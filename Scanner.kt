import java.util.Scanner

fun main()
{
    val scanner = Scanner(System.`in`)
    print("bir değer giriniz: ")
    //var gelenSayi = scanner.next()
    var gelenSayi = scanner.nextInt()
    //var gelenSayi = scanner.nextLine()
    gelenSayi+=10
    println("gelen sayı + 10= $gelenSayi")
    //println("gelen sayı + 10= ${gelenSayi + 10}")


}