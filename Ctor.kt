class Ctor constructor(var renk:String, var marka:Char) {
    fun deger_bastir()
    {
        var ozellikler:String = "Renk: $renk\nMarka: $marka"
        println(ozellikler)
    }
}

fun main(args: Array<String>) {
    var nesne = Ctor("kırmızı", 'D')
    nesne.deger_bastir()
}