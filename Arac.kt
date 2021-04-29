open class Arac(model:Int, agirlik:Int, renk:String) {
var model:Int
var agirlik:Int
var renk:String

init {
    this.model=model
    this.agirlik=agirlik
    this.renk=renk
}
    open fun ekrana_bas() //override edebilmek için open yazıldı
    {
        println("Model: $model\nAğırlık: $agirlik\nRenk: $renk")
    }
}