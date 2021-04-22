@file:JvmName("FonksiyonDosyasi") //bunu yazmazsak, class adı otomatik olarak dosya adı ile oluşuyor (fonksiyonKt).

package src

fun main()
{
    print(maksimumSayi(5,10))
}

//1
fun maksimumSayi(sayi1:Int, sayi2:Int):Int = if(sayi1>sayi2) sayi1 else sayi2

//2
