fun main() {

    /**
     * Berechnung anteiliger Miete
     */
    var kostenGesamt = 35.00 //-43.0 +316.0 +
    println("Kosten die aufzuteilen sind $kostenGesamt")

    var gehaltMateusz :Int = 3464; // 3320-120€ kosten für München
    var gehaltKamila :Int =1556;

    var faktor :Double = gehaltMateusz.toDouble()/gehaltKamila.toDouble();

    faktor=faktor+1
    // println(faktor);

    var miete1 = kostenGesamt;

    var x =0.0;
    // println("vorschleife")
    while(kostenGesamt>0){
        //   println("inschleife")
        x++
        kostenGesamt=kostenGesamt-faktor
        //   println(x)
    }

    var y = miete1-x;
    println("Anteil von Kamila beträgt: $x")

    println("Anteil von Mateusz beträgt $y")
}