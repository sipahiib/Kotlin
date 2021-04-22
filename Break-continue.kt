package src

fun main()
{

    //1
    var numaralar = 1..10
    for (i in numaralar)
    {
        println(i)
        if(i==5)
            break
    }

    //2
    for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
            if(i==2 && j==1)
                break //sadece içteki for'u kırar ve saymaya devam eder
        }
    }

    distakiFor@ for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
            if(i==2 && j==1)
                break@distakiFor //dıştaki for'u kırar ve artık saymaz.
        }
    }

    //3
    var numaralar2 = 1..10
    for (i in numaralar2)
    {
        if(i==5)
            continue
        print(i)
    }
}