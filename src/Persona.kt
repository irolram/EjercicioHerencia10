open class Persona(val nombre: String, var edad: Int) {


    override fun toString(): String {
        return "(nombre='$nombre', edad=$edad)"
    }
    fun celebrarCumple(): String{
        edad++
        return "Feliz cumpleaños $nombre! Ahora  tienes $edad años."
    }

}