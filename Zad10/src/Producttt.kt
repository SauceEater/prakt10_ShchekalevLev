import Items.*
//Компьютерная мышь
class Producttt(name: String, price: Double, quantity: Int, year: Int, var fabricator: String)
    : Items(name, price, quantity, year) {

    //Качество
    override fun quality(): Double {
        val curYear = 2023
        val quality = super.quality()
        return quality + 0.5 * (curYear - year)
    }

    //Итог
    override fun summary(): String {
        return "Итог:\nНаименование: \"$name\"\nЦена за 1 шт.: $price\nКоличество: $quantity\nГод выпуска товара: $year\nПроизводитель $fabricator\n"
    }

    //Конечная стоимость
    fun totalPrice() {
        println("Стоимость: ${this.price * this.quantity}")
    }
}