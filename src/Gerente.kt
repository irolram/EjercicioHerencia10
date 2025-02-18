class Gerente(val bonus: Double,
              salarioBase: Double,
              nombre: String,
              edad: Int,
              porcentajeImpuestos: Double = 33.99
)
    :Empleado(salarioBase, nombre, edad,porcentajeImpuestos ) {

    var exentoImpuestos: Boolean = true
    fun calcularSalario(salarioBase: Double): Double {

        if (exentoImpuestos) {
            return salarioBase + bonus
        }else{
            val salarioMasBonus = super.calcularSalario() + bonus

            return salarioMasBonus
        }
    }

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, salario: ${String.format("%.2f", salarioBase)}€, excento de impuesto: $exentoImpuestos, bonus: $bonus"
    }

    fun administrar():String{

        return "$nombre, está administrado en la empresa"
    }

}