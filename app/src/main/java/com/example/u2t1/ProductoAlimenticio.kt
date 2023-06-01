package com.example.u2t1

class ProductoAlimenticio(
    override val nombre: String,
    override val precio: Double,
    override val descripcion: String,
    val fechaCaducidad: String
) : Producto
{
    override fun mostrarInformacion() {
        println("Nombre: $nombre")
        println("Precio: $$precio")
        println("Descripción: $descripcion")
        println("Fecha de caducidad: $fechaCaducidad")
        println()
    }
}