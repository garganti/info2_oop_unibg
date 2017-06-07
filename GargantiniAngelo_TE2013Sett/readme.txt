


Nel main ho testato i punti 1,2,3,6,7. Funzionano correttamente.


Il punto 5 non l'ho eseguito, il 4 ho abbozzato qualcosa.

La classe volo contiene tutti dati del volo, un metodo inserisciPrenotazione per inserire le prenotazioni relative a quel volo, metodo toString(), 
metodi getId e getDestinazione che restituiscono rispettivamente ID e destinazione e il metodo pieno (utilizzati per la funzionalità 7).

La classe prenotazione contiene i dati comuni a tutte le prenotazioni. Implementa comparable effetuato sulla data prenotazione. Contiene metodo
toString per la stampa dei dati.

Le classi prenotazioneIndividuale e prenotazioneGruppo estendono la classe prenotazione. 

Utilizzo gli enumerativi tipo (GRUPPO/INDIVIDUALE) e posto (CORRIDOIO/FINESTRINO).

Nella classe gestorePrenotazioneVoli implemento le funzionalità elencate.

Il file inserimento.txt servirebbe per il punto 1. Il funzionamento è il seguente:
il primo campo mi indica se devo inserire un volo o una prenotazione. In base a questo ho due blocchi di codice differenti.
Se si tratta di volo inserisco i campi sfruttando lo split.
Se si tratta di prenotazione devo effettuare una verifica anche sul secondo campo (gruppo o individuale?). In base a questa ho due blocchi di codice.
Per l'inserimento dell'array di persone sfrutto un campo int chiamato "gruppo". In base al valore di questo campo conosco quante persone devo inserire
e di conseguenza come gestire gli indici dei campi.