import kotlin.system.exitProcess

fun main() {

    val product1 = createProductt()
    println()

    product1.info()
    // Перевод год-дни

    product1.getDays()
    println("Штрих-код: ${product1.barcode()}")
    println(product1.checkSale())
    println()
    val product2 = createProducttt()
    println()

    product2.info()
    // Общая стоимость товаров
    product2.totalPrice()
    println("Штрих-код: ${product2.barcode()}")
    println(product2.checkSale())
}

fun createProductt(): Productt {
    println("Добавление товара (Кухонная посуда)")
    try {
        print("Введи Наименование: ")
        val name = readLine().toString()

        print("Введи цену товара: ")
        val price = readLine()!!.toDouble()
        if (price < 0) throw Exception()

        print("Введи количество товара: ")
        val quantity = readLine()!!.toInt()
        if (quantity < 0) throw Exception()

        print("Введи год выпуска товара: ")
        val year = readLine()!!.toInt()
        if (year < 1999 || year > 2023) throw Exception()

        print("Введи материал, из которого выполнен товар: ")
        val material = readLine().toString()

        if (name.isBlank() || material.isBlank()) throw Exception()

        return Productt(name, price, quantity, year, material)
    }
    catch (e: Exception) {
        println("Ошибка ввода")
        exitProcess(0)
    }
}

fun createProducttt(): Producttt {
    println("Добавление товара (Компьютерная мышь)")
    try {
        print("Введи название товара: ")
        val name = readLine().toString()

        print("Введи цену товара: ")
        val price = readLine()!!.toDouble()
        if (price < 0)
            throw Exception()

        print("Введи количество товара: ")
        val quantity = readLine()!!.toInt()
        if (quantity < 0)
            throw Exception()

        print("Введи год выпуска товара: ")
        val year = readLine()!!.toInt()
        if (year < 1999 || year > 2023)
            throw Exception()

        print("Введи фирму-производителя товара: ")
        val fabricator = readLine().toString()

        if (name.isBlank() || fabricator.isBlank())
            throw Exception()

        return Producttt(name, price, quantity, year, fabricator)
    }
    catch (e: Exception) {
        println("Ошибка ввода")
        exitProcess(0)
    }
}