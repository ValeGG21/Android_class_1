fun main() {
    val estudiante1 = Estudiante("Camila", 15, 10);
    estudiante1.print();
    estudiante1.realizarTarea();

    val gerente1 = Gerente("Valeria", 1500000.0 );
    gerente1.CalcularSalario();

    val vendedor1  = Vendedor("José", 1200000.0, 5 );
    vendedor1.CalcularSalario();
    vendedor1.realizarTarea();

    val circulo1 = Circulo("Circulo", "Rojo", 5.2);
    circulo1.print();

    val rectangulo1 = Rectangulo("Rectangulo", "Negro", 6.5, 4.6, 7.0);
    rectangulo1.print();
}