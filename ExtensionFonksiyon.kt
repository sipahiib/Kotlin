package src

fun main()
{
    println(faktoriyelHesapla(5))
    println(5.faktoriyelHesaplaExt()) //extension metot

    var yazi = "ibrahim   Sipahi"
    println(bosluklariSil(yazi))
    println(yazi.bosluklariSilExt())

    var emre = OgrenciKotlin()
    emre.yetenek="java"
    var hasan = OgrenciKotlin()
    hasan.yetenek="C++"
    var ibrahim = emre.plus(hasan)
    ibrahim.yazdir()
}

//1
fun faktoriyelHesapla(num1:Int):Int
{
    var fakt=1
    for (i in 1..num1)
        fakt*=i
    return fakt
}

//extension metot
fun Int.faktoriyelHesaplaExt():Int
{
    var fakt=1
    for (i in 1..this)
        fakt*=i
    return fakt
}

//2
fun bosluklariSil(deger:String):String {
    var regex = Regex("\\s+")
    return regex.replace(deger, " ")
}

//extension metot
fun String.bosluklariSilExt():String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

//3
fun OgrenciKotlin.plus(deger:OgrenciKotlin):OgrenciKotlin
{
    var gecici = OgrenciKotlin()
    gecici.yetenek = this.yetenek + " " + deger.yetenek
    return gecici
}