//Es una subclase que hereda las variables de FiguraGeometrica
class Circulo(private var nombre : String, private var color : String, private var radio : Double):FiguraGeometrica(nombre, color) {

    //Creamos esta funcion para obtener el radio
    public fun radio (radio: Double ){
        this.radio = radio;
    }
    //Creamos esta funcion para retornar el radio
    public fun radio(): Double{
        return this.radio;
    }

    public fun print (){
        println("Su nombre es: ${nombre}, su color es: ${color}, tiene un radio de: ${radio}");
    }

}