package src

fun main()
{
    var fakt = faktoryel(5)
    println(fakt)
}

//1
fun faktoryel(num:Int):Int
{
    if(num==0 || num==1)
    {
        return 1
    }
    else
    {
        return num* faktoryel(num-1)
    }
}

//2
