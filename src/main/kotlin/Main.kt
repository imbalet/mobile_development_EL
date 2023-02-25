fun firstTask(){
    println("Задание 1")
    println("Введите число")
    val i = readLine().toString()
    if ('7' in i)
        println("Да, число $i содержит 7")
    else
        println("Нет, число $i не содержит 7")
}
fun secondTask(){
    println("Задание 2")
    println("Введите число")
    val i = readLine().toString()
    if ('4' in i && '6' in i)
        println("Да, число $i содержит 4 и 6")
    else
        println("Нет, число $i не содержит 4 и 6")
}
fun thirdTask(){
    println("Задание 3")
    println("Введите число")
    val i = readLine().toString().toInt()
    println("Введите начало диапазона")
    val a = readLine().toString().toInt()
    println("Введите конец диапазона")
    val b = readLine().toString().toInt()

    if (!(i in a..b))
        println("Нет, число $i не в диапазоне [$a; $b]")
    else
        println("Да, число $i в диапазоне [$a; $b]")
}
fun fourthTask(){
    var rubles = ""
    println("Задание 4")
    println("Введите сумму заказа")
    val i = readLine().toString().toInt()
    if (i > 1_000_000)
        println("Ошибка")
    else{
        rubles = when(i%10){
            0, 5, 6, 7, 8, 9 -> "рублей"
            1 -> "рубль"
            2, 3, 4 -> "рубля"
            else -> "ERROR"
        }
        println("Сумма заказа: $i $rubles")
    }
}
fun fifthTask(){
    var b = ""
    var beginning = ""
    println("Задание 5")
    println("Введите возраст")
    val years = readLine().toString().toInt()
    if (years < 18){
        println("Внутренние нормативы компании запрещают рассылку среди граждан, которые не достигли 18 лет. ")
        return
    }
    println("Введите ФИО через пробел")
    val fio = readLine().toString()
    println("Введите пол в виде \"М\" или \"Ж\"")
    val sex = readLine().toString()

    b = if (years % 10 == 5 || years % 10 == 0)
        "юбилеем."
    else
        "днем рождения."
    beginning = if (sex == "М")
        "Уважаемый"
    else
        "Уважаемая"

    val x = 100 - years

    println("$beginning $fio поздравляю с $b")
    println("Желаю не умереть в ближайшие $x лет! ")



}


fun main(args: Array<String>) {
    firstTask()
    secondTask()
    thirdTask()
    fourthTask()
    fifthTask()
}