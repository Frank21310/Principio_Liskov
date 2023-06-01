package com.example.u2t1

abstract class ProductoFisicos(
    override val nombre: String,
    override val precio: Double,
    override val descripcion: String
    ) : Producto
{
    abstract fun calcularEnvio(): Double
}
