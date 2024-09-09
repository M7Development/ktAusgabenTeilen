fun main() {

    /**
     * Berechnung anteiliger Miete
     */
    var mieteGesamt = 1050
    var gesamtFläche = 105
    var meinZimmmerFläche = 7
    var strom = 94
    var internet = 40
    var gez = 55

    // Telekom einbauen und das in eine function auslagern --> einfache IOs App daraus bauen

    var kostenMeinesZimmers = mieteGesamt/gesamtFläche*meinZimmmerFläche
    var tatsächlicheKosten = mieteGesamt-kostenMeinesZimmers+strom+internet+gez
    println("Kosten die aufzuteilen sind $tatsächlicheKosten")

    var miete: Double = tatsächlicheKosten.toDouble()

    var gehaltMateusz :Int = 3464;
    var gehaltKamila :Int = 1556;//

    var faktor :Double = gehaltMateusz.toDouble()/gehaltKamila.toDouble();

    faktor=faktor+1

    // println(faktor);

    var miete1 = miete;

    var x =0.0;
   // println("vorschleife")
    while(miete>0){
     //   println("inschleife")
        x++
        miete=miete-faktor
     //   println(x)

    }

    var y = miete1-x;

    println("Die anteilige Miete von Kamila beträgt: $x")
    println("Die anteilige Miete von Mateusz beträgt $y")
}