# Lassie
Dit is de officiële lassie app die mensen helpt met het zoeken naar hun huisdieren. Hieronder volgt een korte handleiding
waar staat wat wat is en hoe de app in elkaar zit. Ook worden er een paar standaarden beschreven die ten alle tijden
gevolgd moeten worden. Dit is in verband met consistentie van de lay-out.

## Waar begin ik?
Je begint met het downloaden van Android Studio (https://developer.android.com/sdk/index.html), waarna je meteen Java SE
Development Kit kan downloaden (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). 
Kloon (lees: download) de repo en importeer hem in Android Studio (File -> New -> Import project). Als het goed is, is het
project nu geopend.

## De belangrijkste bestanden
De belangrijkste bestanden voor de lassie app zijn de volgende:
  * Alle .Java bestanden voor de activiteiten (b.v. Home.Java). Deze worden automatisch verzameld in Lassie/app/src/main/java/lassie.lassie
  * De bijbehorden .xml bestanden van de activiteiten (b.v. menu_home.xml). Deze worden automatisch verzameld in Lassie/app/src/main/res/
  Hierbij kan gedacht worden aan menu_home.xml of activity_home.xml
  * AndroidManifest.xml. Dit bestand beschrijft de grote lijnen van de app, zoals het thema, de titel en het splashscreen
  * Strings.xml. Hierin worden ALLE strings opgeslagen die voorkomen in de app. Gebruik dus geen hardcoded tekst, maar
  een verwijzing naar strings.xml door middel van "@string/voorbeeld"
  * Drawawbles. Drawables zijn plaatjes die in de app gebruikt worden. Deze zijn te vinden in Lassie/app/src/res/.
  
## Enkele guidelines conform design
 * DE BELANGRIJKSTE: CONTROLEER ALTIJD JE CODE VOORDAT JE IETS COMMIT. Als je dit niet doen, gaat iemand anders dus verder met 
 jouw gepruts.
 * Gebruik verschillende formaten voor de drawables (mdpi, hdpi, xhdpi en xxhdpi vereist). xxxhdpi is handig maar niet noodzakelik.
 Plaatjes kunnen eenvoudig naar drawables worden geconverteerd (incl alle formaten en de juiste namen) met Android asset studio:
 https://romannurik.github.io/AndroidAssetStudio/index.html
 * Sla strings altijd op in Strings.xml. Hierdoor kan tekst makkelijk bewerkt worden en hoeft er dus niet helemaal gezocht
  te worden tussen alle regels code.
  * Kijk naar de panelen voordat je iets maakt. Hierdoor voorkom je dat dat je iets maakt waar niet over is overlegd. Het is de
  bedoeling dat alles wat gemaakt wordt is besproken en dus niet ter plekke uit je duim gezogen is.

## FAQ
### Hoe test ik de app?
 Om de app te testen, moet je hem afspelen op een zogenaamde emulator. De computer simuleert een telefoon, waardoor de app
 afgespeeld kan worden. laadt het project en druk op shift + f10. Met het creëeren van de app is de Nexus 5 met API 22
 gebruikt, maar je bent vrij om een ander apparaat te gebruiken. Zorg er wel voor dat je voldoende RAM geheugen beschikbaar
 hebt (maar dat geeft hij vanzelf aan als dast niet zo is).
 
### Wat moet ik doen?
 Dit wordt afgesproken in de taakverdeling. Als dit niet duidelijk is -> vraag Sander.
 
### Hoe koppel ik Android Studio aan de Github repo?
 Allereerst, download de github tools: https://git-scm.com/download/win. Klik vervolgens op VCS -> Enable version Control Integration -> Git. Om de files te updaten, klik op VCS -> Update project. Om te 
 comitten, klik op VCS -> Commit changes.
