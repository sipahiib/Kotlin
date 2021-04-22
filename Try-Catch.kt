package src

fun main()
{
    //1
    var str="4a"
    var num= try {
        str.toInt()
    }
    catch (e: Exception)
    {
        print(e.message)
    }

    //2
    var num2=0
    try {
      num2=str.toInt()
    }
    catch (e: Exception)
    {
        print(e.message)
    }
}