package src

fun main()
{
    //1
    val x=7
    when(x)
    {
        1 -> println(1)
        5 -> println(5)
        in 5..10 -> println("5-10 arası girdiniz")
        !in 11..20 -> println("11-20 arası değildir")
        21 -> println(21)
    }

    //2
    val no=10
    var sonuc: String = when(no)
                        {
                            1 -> "sayı: 1"
                            5 -> "sayı: 5"
                            else -> "bilinmeyen sayı"
                        }
    print(sonuc)
}