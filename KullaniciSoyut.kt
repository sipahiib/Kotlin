class KullaniciSoyut(override var ad:String,override var soyad:String):KisiSoyut() {

    override fun islemYap() {
        println("İşlemler yapılıyor.")
    }

}

fun main() {
    var k = KullaniciSoyut("ibrahim", "sipahi")
    k.islemYap()
    k.ekranaBas()
}