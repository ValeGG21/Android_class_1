//creamos esta clase base para utilizarla en las subclases rectangulo y circulo
open class FiguraGeometrica {
    private var nombre : String;
    private var color : String;

    //Creamos el contructor para instanciar sus variables
    public constructor(nombre : String, color : String){
        this.nombre = nombre;
        this.color = color;
    }
    //Creamos esta funcion para obtener el nombre
    public fun establecerNombre(nombre : String){
        this.nombre = nombre;
    }
    //Creamos esta funcion para retornar el nombre
    public fun obtenerNombre():String{
        return this.nombre;
    }
    //Creamos esta funcion para obtener el color
    public fun establecerColor(color: String){
        this.color = color;
    }
    //Creamos esta funcion para retornar el color
    public fun obtenerColor():String{
        return this.color;
    }

}