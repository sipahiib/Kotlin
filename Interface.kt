package src

interface operasyon{
    fun topla(s1:Int,s2:Int)
    fun bol(s1:Int,s2:Int)
}

class KullaniciOperasyonlari:operasyon
{
    override fun topla(s1: Int, s2: Int) {
        println(s1+s2)
    }

    override fun bol(s1: Int, s2: Int) {
        //TODO
    }
}

fun main()
{
    var user = KullaniciOperasyonlari()
    user.topla(5,10)
}