Konzolni Office Word
Zadatak je implementirati neke od funkcionalnosti poznatog uslužnog programa. Korisnik unosi rečenice dok program nudi pametne
funkcionalnosti u vidu automatske korekcije unosa i pružanja analize komletnog teksta u statusnoj liniji.
Funkcije unosa:
Dodavanje rečenice
Brisanje rečenice
Dodavanje bloka teksta (više rečenica istovremeno)
Izmena rečenice nakon unosa
Analiza i korekcija:
Brojač reči (word count)
Ukoliko korisnik nije stavio znak za kraj rečenice, stavite tačku.
Svaka rečenica počinje velikim slovom.
Svaka od fukcionalnosti treba biti zasebna metoda. Smatrati da je maksimalan broj rečenica 100 i da posle interpunkcijskih znakova uvek
ide razmak.
Izgled ispisa na sledećoj strani

Dobrodošli u konzolni WordTM!
----------------------------
Komande:
-1) Izlaz iz programa
0) Obriši rečenicu [int]
1) Dodaj rečenicu [String]
2) Dodaj blok teksta [String]
3) Izmeni rečenicu [int] [String]
4) Ispis celog teksta
99) Ispis komandnog menija
----------------------------
komanda: 1 ala je lep ovaj svet!
komanda: 2 ovde majmun, onde cvet. tamo njiva, ovde sad
komanda: 1 i tebe sam sit kafano!
komanda: 1 eno sunca, eno hlad
komanda: 4
---------- tekst ------------
1: Ala je lep ovaj svet!
2: Ovde majmun, onde cvet.
3: Tamo njiva, ovde sad.
4: I tebe sam sit kafano!
5: Eno sunca, eno hlad!
---------- status ------------
broj reči: 22
------------------------------
komanda: 3 2 ovde potok, onde cvet
komanda: 0 4
komanda: 4
---------- tekst ------------
1: Ala je lep ovaj svet!
2: Ovde potok, onde cvet.
3: Tamo njiva, ovde sad.
4: Eno sunca, eno hlad!
---------- status ------------
broj reči: 17
------------------------------
komanda: -1

Sugestije:
Sve metode koje utiču na broj rečenica finalnog teksta vraćaju int koji predstavlja novu vrednost broja rečenica. Ovo je
neophodno jer nam je uvek potrebna ažurna vrednost o sadašnjem broju rečenica.
Za unos dužeg teksta koristiti metodu Scanner.nextLine() pa potom String.trim() nad izvučenom linijom. ‘nextLine’
izvlači celu liniju ne samo prvu reč dok ‘trim’ čisti nepotrebne blanko znakove sa početka i kraja koji su slučajno upali

Za procesiranje bloka teksta: Možete korisiti metodu String.split(delimiter) koja razbija string na niz stringova u
zavisnosti od delimitera. Delimiter je u ovom slucaju “[.!?]” (tacka ili uzvicnik ili upitnik)
Za brojanje reči: Možete korisiti metodu String.split(delimiter) koja razbija string na niz stringova u zavisnosti od
delimitera. Delimiter je u ovom slucaju " " (blanko znak)
Modifikacija:
Implementirati dodatne statusne funkcionalnosti recimo broj slova, maksimalna duzina recenice itd.
