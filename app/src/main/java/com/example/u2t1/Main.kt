package com.example.u2t1
fun main() {
    val productoElectronico = ProductoElectronico(
        "Smartphone",
        1000.0,
        "Un teléfono inteligente de última generación",
        "MarcaA",
        "ModeloB")
    val productoAlimenticio = ProductoAlimenticio(
        "Manzanas",
        2.5,
        "Una bolsa de manzanas frescas",
        "2023-06-30")
    val productoElectronico2 = ProductoElectronico("Televisor HD",
        500.0, "Televisor de alta definición",
        "MarcaX",
        "ModeloY")
    val productoAlimenticio2 = ProductoAlimenticio("Manzanas",
        2.5,
        "Bolsa de manzanas frescas",
        "2023-06-30")

    val productos: List<Producto> = listOf(productoElectronico,
        productoAlimenticio,
        productoElectronico2,
        productoAlimenticio2
    )

    for (producto in productos) {
        producto.mostrarInformacion()
    }
}
