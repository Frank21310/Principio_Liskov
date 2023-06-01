package com.example.u2t1

class ProductoElectronico(
    override val nombre: String,
    override val precio: Double,
    override val descripcion: String,
    val marca: String,
    val modelo: String
) : ProductoFisicos(nombre, precio, descripcion)
{
    override fun calcularEnvio(): Double {
    // Lógica para calcular el costo de envío de un producto electrónico
    return 10.0 // Supongamos un costo de envío fijo de $10 para productos electrónicos
    }

    override fun mostrarInformacion() {
        println("Nombre: $nombre")
        println("Precio: $$precio")
        println("Descripción: $descripcion")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Costo de envío: $${calcularEnvio()}")
        println()
    }
}