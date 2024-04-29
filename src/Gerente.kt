//Subclase para calcular el salario del gerente y para esto se uso la fun CalcularSalario que esta en configuracion
class Gerente(private var nombre : String, private var salario : Double): Empleado(nombre, salario), emp {

    override fun CalcularSalario(){
        var total: Double = this.salario * 1.25;
        print("Tu nombre es: ${nombre}, tu salario es de: ${salario}, el pago que recibiras este mes es de: ${total}");
    }
}