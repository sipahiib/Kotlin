fun main()
{

    print("değer giriniz: ")
    val gelenDeger= Integer.parseInt(readLine())

    when(gelenDeger)
    {
        1 -> print("1")
        2 -> print("2")
        5 -> {
            print("5")
            print(" girdiniz")
        }
        10 -> print("10")
        else -> {
            println("girdiğiniz sayı geçerli değil")
        }
    }

}