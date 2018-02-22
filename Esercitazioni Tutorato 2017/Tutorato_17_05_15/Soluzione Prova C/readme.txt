Possibile soluzione della simulazione del tema d'esame TELECAMERE, che fa uso di tutti i costrutti principali:
- package
- classi
- enum
- eccezioni
- classi astratte
- overriding
- interfacce (Comparable)
- file di testo (come input)
- commenti stile Javadoc ( /** ... */ )

Il progetto è organizzato come segue:
- readme.txt
- telecamere.txt : il file di testo di input, contenente una lista di telecamere, una per linea, con campi separati da ";", nel formato:
    1. S/N/A: a seconda se Semplice, Normale o Allarmata (il tipo di telecamera)
    2. descrizione
    3. posizione (float compreso tra 0 e 200 che indica il km)
    4. Produttore (per le semplici), o numero di telefono (per le allarmate)
    
- package gestore (metodi di logica per la gestione delle telecamere + main)
  - GestoreTelecamere.java: il gestore, con il metodo "opera" che permette di operare su una telecamera. Contiene anche il metodo di lettura da file di testo.
  - Operazione.java: enum che contiene i tipi di operazione possibili
  - ProvaGestore.java: classe contenente unicamente il main

- package telecamere (classi che modellano gli oggetti della realtà in oggetto + eccezioni)
  - Telecamera.java: classe astratta, che implementa Comparable (vengono ordinate in base alla posizione sulla strada)
  - TelecameraAllarme, TelecameraNormale e TelecameraSemplice: i 2 tipi di telecamere particolari, 
    più un terzo tipo per permettere di instanziare una telecamera normale. Devono implementare il metodo "spegni" che è astratto.
  - StatoTelecamera: ogni telecamera ha uno stato, descritto da questa enum (anziché usare delle variabili booleane o intere, meglio una enum, è più chiara)
  - PosizioneOutOfBoundException: eccezione personalizzata creata apposta per gestire il caso la telecamera venisse posizionata a un km negativo o superiore a 200 (come indicato nel testo dell'esercizio)

E' stata usata la "SequenzaOrdinata" del package prog.io per gestire l'elenco delle telecamere. Poteva essere usato anche un ArrayList standard di Java e ordinato all'occorrenza.

ESECUZIONE DEL PROGRAMMA:

Per provare il programma, eseguire ProvaGestore.java , che contiene il main (non richiede alcun input da tastiera).