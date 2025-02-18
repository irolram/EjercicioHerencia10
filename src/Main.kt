//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val persona1 = Persona("Pepe", 33)
    val empleado1 = Empleado(salarioBase = 3000.0, nombre = "Carlos", edad = 30)
    val gerente1 = Gerente(15.0,2000.0,"Manuel", 21)



    persona1.celebrarCumple()
    println(persona1)

    empleado1.celebrarCumple()
    empleado1.trabajar()
    println(empleado1)


    gerente1.administrar()
    gerente1.calcularSalario()
    println(gerente1)
}