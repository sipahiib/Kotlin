package src

fun main()
{
    //1
    var sayi=5
    var sayi2=3
    var sonuc  =0

    if(sayi>sayi2) {
        println("$sayi $sayi2'den büyüktür.")
    }
    else {
        println("$sayi $sayi2'den küçüktür.")
    }

    //2
    sonuc= if(sayi>sayi2)
                sayi
            else
                sayi2
    println("$sonuc en büyük sayıdır")

    //3
    var ogrenciJava = OgrenciJava()
    print(ogrenciJava.name.length) //exception alır

    var ogrenciKotlin = OgrenciKotlin()
    print(ogrenciKotlin.name?.length) //exception almaz. nullable değişkenler bu şekilde ? ile belirtilir.

}