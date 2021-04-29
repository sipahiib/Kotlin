class Araba(model:Int, agirlik:Int, renk:String, fiyat:Int, kapisayi:Int): Arac(model,agirlik,renk) { //kalıtım aldık
    var fiyat:Int
    var kapisayi:Int
    init {
        this.fiyat = fiyat
        this.kapisayi = kapisayi
    }

    override fun ekrana_bas() {
        super.ekrana_bas()
        println("Fiyat: $fiyat\nKapıSayı: $kapisayi")
    }
}

fun main(args: Array<String>) {
    var a = Araba(2020, 5, "Kırmızı", 3000, 4)
    a.ekrana_bas()
}