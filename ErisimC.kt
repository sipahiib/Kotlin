import com.sipahi.erisim.ErisimA

class ErisimC:ErisimA() {
    fun degerBas()
    {
        this.d_sayisi() //protected olan metota, kalıtım yoluyla erişebildik.
    }
}

fun main(args: Array<String>) {
    var erisim = ErisimC()
    erisim.degerBas()
}