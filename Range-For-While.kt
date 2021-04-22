package src

fun main()
{
    //1
    var numaralar = 1..10 //1den 10a kadar sayılar tutulur
    //var numaralar = 1.rangeTo(10) //1den 10a kadar sayılar tutulur. yukarısı ile aynı
    var numaralar2 = 10..1 //10dan 1e kadar ters sırada tutulur
    //var numaralar2 = 10.downTo(1) //10dan 1e kadar. yukarısı ile aynı

    //2
    var harfler = 'a'..'z'
    var iceriyorMu = 'c' in harfler
    when(iceriyorMu)
    {
        true -> print("evet")
        else -> print("hayır")
    }

    //3
    var ikiserliNumaralar = 1..10 step 2 //sayıları 2şer artırır
    //var ikiserliNumaralar = 1.rangeTo(10).step(2) //sayıları 2şer artırır. yukarısı ile aynı

    //4
    for(i in 1..10)
        print(i)

    for(i in harfler)
    print(i)

    //5
    var i=0
    while (i<10)
    {
        print(i)
        i++
    }

    //6
    for (i in numaralar)
    {
        print(i)
    }
    for (i in numaralar.reversed().step(2))
    {
        print(i)
    }
}