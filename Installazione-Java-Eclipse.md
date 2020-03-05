
# Come installare Java ed Eclipse
---
Installare per primo Java e poi Eclipse

# Come installare Java JDK
Per installare Java Development Kit, collegati quindi alla pagina Web di [Oracle Java], apponi il segno di spunta accanto alla voce Accept License Agreement collocata sotto la dicitura JAVA SE Development Kit xx e clicca sul primo link corrispondente a Windows per scaricare la versione più recente del software adatta ai sistemi Windows a 64 bit. 

Successivamente, ti consiglio di regolare le variabili d’ambiente del sistema operativo, in modo che tutto funzioni in maniera corretta durante lo sviluppo delle app.
Apri, dunque, l’Esplora File (l'icona della cartella gialle che si trova in basso a sinistra sulla barra delle applicazioni), fai clic destro sull’icona Questo PC (o Computer) che si trova nella barra laterale di sinistra e seleziona la voce Proprietà dal menu che compare.
Nella finestra che si apre, seleziona la voce Impostazioni di sistema avanzate dalla barra laterale di sinistra, pigia sul bottone Variabili d’ambiente e compi queste due semplici operazioni.

Clicca sul pulsante Nuova… situato sotto la dicitura Variabili di sistema. 
Digita JAVA_JDK nel campo Nome variabile; il percorso di JDK (es. C:\Program Files\Java\jdk-13) nel campo Valore variabile: e clicca su OK per salvare i cambiamenti.
Seleziona la variabile Path dall’elenco delle Variabili di sistema e clicca sul pulsante Modifica. Dopodiché modifica il campo Valore variabileinserendo la stringa %JAVA_JDK%\bin; al termine di quanto già presente in esso e clicca su OK per salvare i cambiamenti.

![screenshot](https://www.aranzulla.it/wp-content/contenuti/2019/01/xoCwdP5MJyWc42.jpg.pagespeed.ic.rxse10C9HE.jpg)

# Come installare Eclipse
Qualora non ne avessi mai sentito parlare, Eclipse è un IDE (o integrated desktop environment, che si può tradurre con _ambiente di sviluppo integrato_) che fornisce tutti gli strumenti necessari per scrivere, organizzare e pubblicare codice sorgente. Sebbene sia stato principalmente sviluppato per il linguaggio di programmazione Java, a oggi Eclipse è in grado di fornire supporto anche per altri linguaggi, come C/C++, PHP e i linguaggi di sviluppo Web (come HTML, JavaScript, XML e così via).

> Poiché Eclipse è un ambiente di sviluppo dedicato principalmente al linguaggio di programmazione Java, alcune sue parti sono basate proprio su quest’ultimo. Di conseguenza, prima ancora di poter installare Eclipse, ciò che devi fare è scaricare e installare il pacchetto Java sul tuo PC.

Tanto per cominciare, collegati all’area download del [sito Internet di Eclipse], clicca sul pulsante Download 64 bit (o Download 32 bit, se utilizzi una versione di Windows a 32 bit) presente nella pagina che si apre e clicca nuovamente sul pulsante Download, per avviare lo scaricamento del pacchetto d’installazione del programma.

Una volta ottenuto il file (ad es. eclipse-inst-win64.exe), avvialo e attendi che la schermata di scelta del software venga mostrata a schermo: quando ciò accade, clicca sulla versione di Eclipse di tuo interesse (ad es. Eclipse IDE for Java Developers), clicca sui pulsanti Install e Accept Now, apponi il segno di spunta nella casella Remember accepted licenses e clicca sul pulsante Accept.

![screenshot2](https://www.aranzulla.it/wp-content/contenuti/2019/09/xjoFIBYKRIf.jpg.pagespeed.ic.Nj6msbKmG7.jpg)

Successivamente, accetta i certificati di sicurezza di Eclipse, cliccando sui pulsanti Select All e Accept selected, e il gioco è fatto! Per avviare subito Eclipse, clicca sul pulsante verde Launch presente nella finestra dell’installer; in alternativa, puoi lanciare il programma attraverso le icone create sul desktop o nel menu Start di Windows.

Al primo avvio, ricorda di confermare la cartella di lavoro, utilizzando la finestra che ti viene proposta a schermo. Per accedere subito alla console di sviluppo, clicca invece sul link Create new Java project presente nella finestra iniziale del programma.


[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

  [Oracle Java]: <https://www.oracle.com/java>
  [sito Internet di Eclipse]: <https://www.eclipse.org/downloads>
