open class Empleado(val salarioBase: Double, nombre: String, edad: Int,val porcentajeImpuestos: Double = 10.0): Persona(nombre, edad) {

    constructor(salarioBase: Int, porcentajeImpuestos: Double, nombre: String, edad: Int) : this(salarioBase.toDouble(), nombre, edad, porcentajeImpuestos)

    constructor(salarioBase: Int, porcentajeImpuestos: Int, nombre: String, edad: Int) : this(salarioBase.toDouble(), nombre, edad, porcentajeImpuestos.toDouble())

    constructor(salarioBase: Double, porcentajeImpuestos: Int, nombre: String, edad: Int) : this(salarioBase.toDouble(), nombre, edad, porcentajeImpuestos.toDouble())



    fun calcularSalario():Double{

        val calculoImpuesto = salarioBase * (porcentajeImpuestos / 100)

        return salarioBase - calculoImpuesto
    }

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, salario: ${String.format("%.2f", salarioBase)}€"

    }

    fun trabajar():String{
        return "$nombre está trabajando en la empresa."
    }

}