# Joc_De_La_Vida
Pràctica de programació UF2: Disseny Modular.
Enunciat: Cal implementar el famós joc de la vida de Conway.
Tot i que hi ha força variants del joc, ens centrarem en la que va publicar originalment
en Conway al 1970. El joc de la vida és un joc on no hi ha jugadors, bàsicament
evoluciona de forma automàtica a partir d’una població inicial.
Les regles de l’evolució són les següents:
El tauler és una graella de cel·les quadrades que tenen dos possibles estats, viu o mort.
El tauler inicial tindrà les mesures que indiqui l’usuari per teclat.
- Cada cèl·lula té 8 possibles veïnes que la rodegen.
- En cada un dels passos de l’evolució, totes les cèl·lules s’actualitzen
instantàniament tenint en compte les següents regles:
o Cada cèl·lula viva amb 2 o 3 cèl·lules veïnes sobreviu.
o Cada cèl·lula amb 4 o més veïns mor per superpoblació.
o Cada cèl·lula amb 1 o cap veïna mor per soledat.
o Cada cèl·lula morta amb 3 cèl·lules veïnes vives, reneix de nou.
Aquest tipus de regles s’expressen:
AA/B  23/3
AA: Representen les condicions de sobreviure.
B: Representa les condicions de renaixença.
El sistema caldrà que el puguem configurar de forma que podrem variar les condicions de
AA/B i veure com evoluciona el sistema un cop canviat les condicions de l’evolució.
El sistema ens haurà de permetre donar d’alta inicialment vàries cèl·lules de forma manual o
de forma automàtica:
Manual: El sistema ens demanarà la posició de 5 cèl·lules de forma inicial.
Automàtica: El sistema crearà de forma aleatòria N grups de 5 cèl·lules automàticament.
Determinarà una posició X,Y inicial aleatori i crearà una colònia al voltant de 5 cèl·lules vives
que possibilitin expansió. N es demanarà a l’usuari a l’inici del programa.
El sistema anirà imprimint per pantalla l’evolució del món, un rere l’altra.
Requisits de la pràctica:
1.- El disseny cal que sigui absolutament modular composat per procediments i funcions.
2.- Evitarem l’ús de variables de tipus globals cosa que implicarà que fem pas per paràmetre a
les funcions i procediments del que necessitem.
Cal que lliureu:
A.- El programa (Fitxers .java)
Data de lliurament: 8 de març de 2020.
El següent dia de classe al lliurament, farem un examen escrit (1 hora) sobre la pràctica a
mode de Prova de validació que farà preguntes sobre la mateixa.
