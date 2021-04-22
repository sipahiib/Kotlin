


fun main(args: Array<String>)
{
    println("hello")

    var sayi1=1
    var sayi2: Int=10
    val sayi3 = 5 //readonly değişken
    println("$sayi1 $sayi2 $sayi3")
    println("${sayi1} ${sayi2} ${sayi3}") //yukarısı ile aynı
    println("$sayi1 $sayi2 "+ sayi3) //yukarısı ile aynı

    var enBuyukInt:Int=Int.MAX_VALUE
    var enKucukInt:Int = Int.MIN_VALUE
    println("$enBuyukInt $enKucukInt")

    if(enBuyukInt is Int)
        println("$enBuyukInt bir Int'tir")

    var harf:Char='A'
    println("A bir char mı:  ${harf is Char}")


}