class Articulo(val nombre:String ,  precio:Number){
    val precio = precio.toDouble()
    init {
        generarId()
    }

    override fun toString(): String {
        return "$id"
    }
    companion object
        var id = 0
        fun generarId(){
         id++
        }
}


fun main(){
    val art1 = Articulo("pan" , 12)
    println(art1.toString())
    val art2 = Articulo("cebolla" , 12)
    println(art2.toString())

}

