# ZPO4-zad2
2.	(PLIKI) (0,5 pkt) 
Napisz program generujący N liczb losowych o rozkładzie normalnym (gaussowskim) o zadanych parametrach m (średnia) i  (odchylenie standardowe) i zapisujący je do pliku binarnego.  Następnie plik ten jest odczytywany, liczba po liczbie, a dane zapisywane do nowego pliku (tekstowego), każda liczba w osobnym wierszu.  Dodatkowo należy zwizualizować (przy pomocy Excela lub w Pythonie/matplotlib) histogram tych liczb, aby sprawdzić, czy rzeczywiście rozkład przypomina krzywą dzwonową Gaussa. Zapis do pliku tekstowego ma wykorzystywać konwencję formatu przyjętą w Polsce (tj. przecinki zamiast kropek dziesiętnych).
Parametry N (liczba całkowita), m i  (liczby zmiennoprzecinkowe) mają być argumentami wiersza poleceń.  Przy pomocy mechanizmu asercji dopilnuj, aby odchylenie standardowe nie było liczbą ujemną.
 
Wskazówki. 
a) Generacja liczb o rozkładzie normalnym – poszukaj w klasie Random.  
b) Zapis/odczyt liczb w postaci binarnej: klasy DataOutputStream / DataInputStream.  
c) Utwórz odpowiedni obiekt klasy NumberFormat.
