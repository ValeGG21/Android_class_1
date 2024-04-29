//Heredamos de la clase persona para la utilizacion de los datos
class Estudiante(private var nombre : String, private var edad : Int, private var grado : Int): Persona(nombre, edad), Trabajador{


    //Se le pone esta función para obtener el dato y al mismo tiempo lo convertimos a un String
    public fun setGrado(grado: Int){
        this.grado = grado;
    }

    //Se le pone esta función para retornar el dato grado ya convertido
    public fun getGrado():String{
        return this.grado.toString();
    }
    //Se heredo la interface "Confi" para usarla en el println y que imprima un mensaje diferente al de trabajador
    override fun realizarTarea() {
        println("Realizando la tarea");
    }

    public fun print (){
        println("Su nombre es: ${nombre}, tu edad es: ${edad}, y estas en ${grado} grado");
    }

}