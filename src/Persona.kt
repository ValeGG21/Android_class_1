open class Persona {
    private var nombre : String;
    private var edad : Int;

    //Creamos el contrusctor instanciar las variables a usar
    public constructor(nombre : String, edad : Int){
        this.nombre = nombre;
        this.edad = edad;
    }
    //Creamos esta funcion para obtener el nombre
    public fun establecerNombre(nombre : String){
        this.nombre = nombre;
    }
    //Creamos esta funcion para retornar el nombre
    public fun obtenerNombre():String{
        return this.nombre;
    }
    //Creamos esta funcion para obtener la edad
    public fun establecerEdad(edad: Int){
        this.edad = edad;
    }
    //Creamos esta funcion para retornar la edad
    public fun obtenerEdad():Int{
        return this.edad;
    }

}
