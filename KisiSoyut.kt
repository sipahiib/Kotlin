abstract class KisiSoyut {

    abstract var ad:String
    abstract var soyad:String
    var sayi:Int=10

    abstract fun islemYap()
    //final fun islemYap() //final yapılırsa, override edilemez!!

    fun ekranaBas()
    {
        println("Ad: $ad\nSoyad: $soyad\nSayi: $sayi")
    }
}



