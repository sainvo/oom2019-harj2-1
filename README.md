# oom2019-harj2-1

Nimetön 1. vuoden opiskelija on toteuttanut 2. asteen yhtälön ratkaisun tai ratkaisut etsivän graafisen Java-ohjelman 
CalculatorApp osana ‘Soveltava projekti’ -kurssia. Projekti sijaitsee edellä kuvatussa git-repositoryssä harj2-1.

**a)** Projekti vaikuttaa tekevän mitä ohjelman nimi antaa ymmärtää, mutta ohjelmaa ei
ole määritetty (spesifioitu) alkuunkaan. 

**Tehtäväsi on määrittää JA uudelleenmuotoilla ohjelman koodi luokassa fi.utu.tech.CalculatorApp uudelleen niin, että
ohjelman keskeiset (ei-graafiset) toiminnot tulee määritettyä alku- ja loppuehdoin
ja sanallisin kuvauksin.**

Eli metodiin public void start(Stage window) ei tarvitse koskea eikä myöskään luokkaan AppMain. Tätä luokkaa tarvitaan vain, jotta
ohjelman käyttöliittymä toimii oikein.

**b)** 
Ohjelman käytössä on tilanteita, jolloin se ei toimi oikein. Esim. kun b^2 < 4ac
tai syöte on esimerkiksi ‘Moikka’. 

**Käsittele poikkeustilanteet jollain kurssilla esitetyllä tavalla.**

**Laadi yksikkö- tai ominaisuustestejä, jotka testaavat määrittelemäsi
ohjelman keskeiset alku- ja loppuehdot kurssilla esitetyllä tavalla.** 

Täyteen testikattavuuteen ei tarvitse päästä, mutta kukin ehto olisi hyvä saada testattua alustavasti.

**c)** Varmistu, että saat testit ajettua komentoriviltä (mvn clean compile test) ja
Eclipsestä ja että Gitlabiin ladattuna projektiin ilmestyy symboli onnistuneesta
CI-ajosta (vihreä ruksi ympyrän sisällä ja seliteteksti Commit: passed).
