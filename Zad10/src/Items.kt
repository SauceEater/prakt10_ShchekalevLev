package Items
import kotlin.random.Random

// абстрактный класс
abstract class Items(val name: String, val price: Double, val quantity: Int, val year: Int) : CheckInfo
{

    open fun barcode(): Int
    {
        return Random.nextInt(10000, 100000)
    }

    // качество объекта
    open fun quality(): Double
    {
        return price / quantity
    }

    // вывод информации
    open fun info()
    {
        println(summary())
        println("Качество: ${quality()}")
        if (age() != 0)
        {
            println("Возраст товара(год): ${age()}")
        }
            else println("Товар появился в этом году.")
    }
    override fun summary(): String
    {
        return "Итог: Название товара: $name\n Цена: $price\n Количество: $quantity\n Год выпуска: $year"
    }
    override fun age(): Int {
        return 2023 - year
    }
    override fun checkSale(): String
    {
        return if (age() > 6)
        {
            "Скидка будет"
        }
        else "Скидки не будет"
    }
}

interface CheckInfo
{
    fun summary(): String
    fun age(): Int
    fun checkSale(): String
}