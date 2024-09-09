fun main() {
    println("Hello, World! $i")
    println(inputFunction("Something"))
    println(logikFunktion(inputFunction("Papier"),randomChoice()))
}

var i = 30
var o = 10


//Eingabeaufforderung

fun inputFunction(userInput :String) :String { return userInput }



fun logikFunktion(userInput: String, comInput:String) :String{
    var result :String =""
    var intPut : String = userInput

    println("Eingabe Spieler: $intPut")
    println("Eingabe Com: $comInput")
    if (intPut==comInput) result="Draw"
    if (intPut == "Schere" && comInput == "Stein") result="Computer gewinnt!"
    if (intPut == "Schere" && comInput == "Papier") result="Spieler gewinnt!"
    if (intPut == "Papier" && comInput == "Stein") result="Spieler gewinnt!"
    if (intPut == "Schere" && comInput == "Papier") result="Spieler gewinnt!"
    if (intPut == "Stein" && comInput == "Papier") result="Computer gewinnt!"
    if (intPut == "Papier" && comInput == "Schere") result="Computer gewinnt!"
    if (intPut == "Stein" && comInput == "Schere") result="Spieler gewinnt!"
    // if (intPut == "Stein" || intPut == "Schere" || (intPut == "Papier")) result="ungültige Eingabe"
    return result
}

fun randomChoice():String{
    var arrayOptions  = arrayOf("Schere", "Stein", "Papier")

    var indexOfArray = Math.random()*3

    var result = arrayOptions[indexOfArray.toInt()]

    return result
}