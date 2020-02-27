# Skrivarkö
**Ett projekt av Malte Klüft, NTI Gymnasiet Umeå**

### Inledning
Syftet med arbetet var att genom programmering av en enkel skrivarkö få 
ytterligare förståelse om abstrakta datasystem och olika sätt att beskriva 
och hantera data. 

Projektet skrevs med hjälp av konceptet "testdriven programmering", som 
innebär att koden skrivs och refaktoreras för att matcha förexisterande 
tester.

### Bakgrund
Planeringen av projektet innebar genomtänkning av datasystemet i fråga och 
hur det bäst kan implementeras, detta gjordes genom en föreläsning om 
datastrukturer och dess användningsområden samt en enkel mindmap. 

Den Länkade Listan är en datastruktur som definieras av en mängd abstrakta 
noder länkade med varandra genom en generisk variabel. Den kan hantera nästan 
alla typer av data och dess stora fördelar ligger i enkel och effektiv tilläggning 
och borttagning av kända element/noder. Nackdelen med en länkad lista ligger 
dock i att det tar lång tid att förfråga/hitta specifika noder.

Skrivarkön Queue.java är ett barn av föräldern LinkedList.java. Den bygger på den 
Länkade Listans grundläggande funktioner men skriver om dem för att fungera genom 
strängar istället för abstrakta noder.

Då en skrivarkö sällan kommer hantera mer än ett par tusen datanoder samtidigt var 
inte hundraprocentig optimering prioriterat, istället prioriterades läsbar, enkel och 
kortfattad kod samt en minimal mängd globala variabler.


### Positiva erfarenheter
Projektet har en mycket liten mängd kod, men lyckas ändå mycket väl med att förmedla 
koden till läsaren. Med enkel psuedokod kan även vissa av de mer avancerade algorimerna 
beskrivas med enkelhet.
```
/* Psuedocode:
*
*   set current_node to first_node
*   
*   while current_node is not null:
*       if next_node is null:
*           set next_node to new_node
*           stop looping
*  
*   if first_node is null:
*       set first_node to new_node
*/

for(Node node = first; node != null; node = node.getNext()) {
    if(node.getNext() == null) {
        node.next = newNode;
        return;
    }
}
first = newNode;
```

### Negativa erfarenheter
Den länkade listan (LinkedList.java) är dåligt optimerat och klarar inte av hantering av 
mycket stora mängder noder. Detta är inte ett stort problem för en skrivarkö, men 
LinkedList.java bör inte användas av andra projekt utan att ha optimeringen i åtanke.

### Sammanfattning
Denna skrivarkö är en någorlunda effektiv och enkelt förståbar användning av den länkade 
listan, ett enkelt datasystem för hantering av köer och liknande system. Den är dock inte 
särskilt väloptimerad och klarar endast av mindre mängder (<10^6) värden.
 
Projektet skapades för att utforska den länkade listan som ett datasystem, vad man kan 
använda den för, och hur den är uppbyggd för att fungera på bästa sätt. Projektet var 
även en introduktion till testdriven programmering, en programmeringsprocess baserad på 
tidigare existerande tester som sedan används för att skriva koden en bit i taget.

Det är möjligt att en mer optimerad version av koden skapas någon gång i framtiden. 
Jag skulle gärna vilja få ner antalet nödvändiga loopar för att hämta och ta bort ett 
värde från listan till det optimala `Θ(n)`.