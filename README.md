# Lassie
Dit is de officiële lassie app die mensen helpt met het zoeken naar hun huisdieren. Hieronder volgt een korte handleiding
waar staat wat wat is en hoe de app in elkaar zit. Ook worden er een paar standaarden beschreven die ten alle tijden
gevolgd moeten worden. Dit is in verband met consistentie van de lay-out.

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
