//Se heredo la interface "Confi" para usarla en el println y que imprima un mensaje diferente al de estudiante
open class Empleado(private var nombre : String, private var salario : Double) : Trabajador {

    //se heredo esta funcion de configuracion para imprimir el parrafo
    override fun realizarTarea() {
        println("Realizando tarea laboral");
    }

    //Para obtener el nombre
    public fun setNombre(nombre: String){
        this.nombre = nombre;
    }

    //para retornar el nombre
    public fun getNombre():String{
        return this.nombre;
    }

    //Para obtener el salario
    public fun setSalario(salario: Double){
        this.salario = salario;
    }

    //Para retornar el salario
    public fun getSalario():Double{
        return this.salario;
    }

}