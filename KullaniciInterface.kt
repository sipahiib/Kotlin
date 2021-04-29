class KullaniciInterface:IYapi {
    override var ad: String = "Ali"
    override var soyad: String="Sipahi"
    override var sayi: Int=5

    override fun DegerBas() {
        var sonuc:String="Ad: $ad\nSoyad: $soyad\nSayı: $sayi"
        println(sonuc)
    }
}

fun main(args: Array<String>) {
    var k = KullaniciInterface()
    k.DegerBas()
}