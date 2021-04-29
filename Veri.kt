//veri sınıfı
data class Veri(var ad:String, var soyad:String) {
}

//normal sınıf
class Veri2(var ad:String,var soyad:String){
    override fun toString(): String {
        return "ad: $ad\nsoyad:$soyad"
    }
}

fun main(args: Array<String>) {
    var v =  Veri("ibrahim", "sipahi") //data class sayesinde, normal classtaki gibi extra metotlar yazmamıza gerek kalmadı.
    var v2 = Veri2("ibrahim", "sipahi")
    println(v)
    println(v2)

    var yeni_veri = v.copy("filiz", "sipahi")
    var yeni_veri2 = v.copy("yasir", "sipahi")
    println("sonuc: " + yeni_veri.equals(yeni_veri2)) //false

    var v3 = Veri("ibrahim", "sipahi")
    var v4 = Veri2("ibrahim", "sipahi")
    println("sonuc: " + v.equals(v3)) //true
    println("sonuc:" + v2.equals(v4)) //false

    var (ad2, soyad2) = v //Destruction
    println(ad2 + " "+soyad2)

}