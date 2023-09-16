import Items.*
//Кухонная посуда
class Productt(name: String, price: Double, quantity: Int, year: Int, var material: String) : Items(name, price, quantity, year) {

    //Качество
    override fun quality(): Double {
        val curYear = 2023
        val quality = super.quality()
        return quality + 0.5 * (curYear - year)
    }

    //Итог
    override fun summary(): String {
        return "Итог:\nНаименование: \"$name\"\nЦена за 1 шт.: $price\nКоличество: $quantity\nГод выпуска товара: $year\nМатериал: $material\n"
    }

    //Сколько товар находится на складе
    fun getDays() {
        if (year == 2023) {
            return
        }
        else {
            val days = (2023 - this.year) * 365
            println("На данный момент товар находится на складе уже $days дней")
        }
    }

}