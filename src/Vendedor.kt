//Subclase para calcular el salario del gerente y para esto se uso la fun CalcularSalario que esta en configuracion

class Vendedor (private var nombre : String, private var salario : Double, private var ventas : Int): Empleado(nombre, salario), emp  {

    public fun cantventas(ventas: Int){
        this.ventas = ventas;
    }

    public fun ventas():Int{
        return this.ventas;
    }


    override fun CalcularSalario() {
        val total = this.salario * (this.ventas * 1.5);
        print("Tu nombre es: ${nombre}, tu salario es de: ${salario}, el pago que recibiras este mes es de: ${total},  por tus comisiones por ventas.");

    }

}