//Es una subclase que hereda las variables de FiguraGeometrica
class Rectangulo(private var nombre : String, private var color : String, private var longitud : Double, private var ancho : Double, private var perimetro : Double): FiguraGeometrica(nombre , color) {

    //Creamos esta funcion para obtener la longitud
    public fun longitud (longitud: Double ){
        this.longitud = longitud;
    }
    //Creamos esta funcion para retornar la longitud
    public fun longitud(): Double{
        return this.longitud;
    }
    //Creamos esta funcion para obtener el ancho
    public fun ancho (ancho: Double ){
        this.ancho = ancho;
    }
    //Creamos esta funcion para retornar el ancho
    public fun ancho(): Double{
        return this.ancho;
    }
    //Creamos esta funcion para obtener el perimetro
    public fun perimetro (perimetro: Double ){
        this.perimetro = perimetro;
    }
    //Creamos esta funcion para retornar el perimetro
    public fun perimetro(): Double{
        return this.perimetro;
    }
    public fun print (){
        println("Su nombre es: ${nombre}, su color es: ${color}, tiene una longitud de: ${longitud}, " +
                "un ancho de: ${ancho} y un perimetro de: ${perimetro}");
    }
}