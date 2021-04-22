package src

fun main()
{
    var t1 = topla(2,3)
    println(t1)

    var t2 = cikar(10,5)
    println(t2)

    var (ilkSayi, ikinciSayi) = sonrakiEleman(5)
    println("$ilkSayi $ikinciSayi")

    var toplam = sayilariTopla(10,20,30)
    println(toplam)

    var faktoryel = faktoryelHesapla(5)
    println(faktoryel)

}

//1
fun topla(num1:Int, num2:Int):Int
{
    return num1+num2
}

//2
fun cikar(num1: Int, num2: Int) = num1-num2

//3
fun sonrakiEleman(num: Int): Pair<Int,Int>
{
    return Pair(num+1, num+2)
}

//4
fun sayilariTopla(vararg sayilar:Int):Int
{
    var toplam=0
    sayilar.forEach { i -> toplam+=i }
    //for (i in sayilar)
    //    toplam+=i
    return toplam
}

//5
fun faktoryelHesapla(num1:Int):Int
{
    var fakt=1
    for (i in 1..num1)
        fakt*=i
    return fakt

}