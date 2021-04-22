package src

import java.util.*

fun main()
{
    //1
    //sabit sayıda listedir. eklenemez veya silinemez
    var numaralar = listOf(1,2,3) //numaralar = 1..3 --> bundan daha kapsamlı metotlara sahiptir.

    //2
    //değiştirilebilri listedie. ekleme-çıkarma yapılabilir.
    var idler: MutableList<Int> = mutableListOf(1,2,3)
    idler.add(5) //5i ekledi.


    //3
    var insanlar = TreeMap<Int,String>()
    insanlar[0]="ibrahim"
    insanlar[123]="filiz"

    for (i in insanlar)
        println("${i.key} ${i.value}")

    //yukarısı ile aynı
    for ((tc,isim) in insanlar)
        println("$tc $isim")

    //4

}