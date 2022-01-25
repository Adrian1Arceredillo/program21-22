/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

/*
JOKOAREN AZALPENA:

Fitxategia exekutatzerakoan, bi tablero ikusiko dira:
    - konponduta (fitxategia exekutatzerakoan SOILIK ikusiko da)
    - tablero normala (hasieran hutsik, eta mugimendu bakoitzaren ostean daukan "progreso")

Mugimendu bakoitza egin aurretik, jokalariak dituen saiakerak ikusiko dira (3 max.)

Mina EZ ZAPALDU:
    - mezu bat agertuko da
    - tablero normalean "1" agertuko da, jokalariak adierazitako posizioan (lorturiko "1" guztiak gordeko dira -> puntuazioa)

Mina ZAPALDU:
    - mezu bat agertuko da
    - tablero normalean "x" bat agertuko da (erabiltzaileak adierazitako posizioan)
    - programak, jokalariari jarraitzeko galdetuko dio (s/n)
        * s -> mezu bat + saiakera bat kendu
        * n -> programatik irten
    - 

Saiakera guztiak erabiltzean, honako hau ikusiko da:
    - lorturiko puntuazioa
    - aurkituriko mina kopurua


Mina COMODIN ZAPALDU:
    - mezu bat agertu
    - tableroan ez da "x" ezta "1" jarriko, "M" bat baizik
    - puntuazioaren balioa 1 handitu beharrean, +50 puntu gehituko dira
    - JOKALARIARI SAIAKERA BAT KENDUKO DIOGU

*/
