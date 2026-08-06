# DOSW_Lab1_Sua_Duarte_Ortiz

## Integrantes:
* Daniel Felipe Sua Siempira

* Juan Pablo Duarte Silva
  
* David Felipe Ortiz Salcedo


## Reto 1 - Welcome Message

### Evidencia

![Challenge evidence](images/challenge1.png)
### Descripción

Para la realización de este reto, se usó una lista para guardar
los objetos estudiante de acuerdo a la cantidad de miembros que hay
en el grupo. 

Así mismo, se usó un stream para filtrar los datos
de los estudiantes y se utilizó el método map para transformar los
datos con el uso de métodos getter de acuerdo a la información de cada
estudiante. Seguidamente, se utilizó el método joining de la clase
Collectors para unir el texto y se pueda ver correctamente.
Finalmente, se utiliza otro stream para obtener los correos de los
estudiantes.
Los comandos usados para subir este reto en el repositorio fueron git add, 
commit y push en la rama feature/challenge1_OrtizDavid_2026-2. 
No hubo conflictos durante el merge en develop.

## Reto 2 - Parallel Commit Race

### Evidencia

![Challenge evidence](images/challenge2.png)

Primeramente, realizamos las respectivas ramas: `feature/challenge_2_Sua_Duarte_Ortiz_2026-2` y subramas: `feature/challenge2_lane_one_Ortiz_2026-2` y `feature/challenge2_lane_two_Sua_2026-2` con el fin
de llevar la lógica de la carrera de commits y poder solucionar los
conflictos (sin embargo, al intentar realizar dichas ramas tuvimos problemas dado que un compañero no veía las ramas por lo que tuve que
realizarlo individualmente).

Seguidamente, se implementaron las funciones lambda de la primera línea
para poder retornar el número mayor, el número menor y la cantidad total de elementos con los métodos `min()`, `max()` y `count()` de la estructura de datos stream y se realizó la primera colisión, solucionándolo y siguiendo con la segunda línea; de la cual, era una verificación de pares usando el operador ternario y sucedió un conflicto entre archivos, logrando solucionarlo.

Finalmente, se creó una función que contenga el objeto `Results`, reutilizando todo lo hecho anteriormente.

- Se usaron los comandos git add, git commit, git push, git switch, git pull origin para ramas, subramas y develop. Los conflictos que aparecieron más que todo fue por eliminación de archivos y/o modificación de código, estos fueron solucionados editando el código que Visual Studio Code permite modificar. 

## Reto 3 — The Mysterious Echo

### Evidencia

![Challenge evidence](images/challenge3.png)
### Descripción

Para este problema para la primera parte cree repeatThreeTimes() usando StringBuilder y para la segunda parte cree 
reverseText() usando StringBuffer. En la lambda echoProcess use Streams para repetir el texto tres veces y luego invertirlo uniendo ambos.

- Se dividió el trabajo en dos ramas: feature/challenge3_builder_Duarte_2026-2 y feature/challenge3_buffer_JuanDuarte_2026-2.
- Use git add, git commit, git push, git merge y git pull origin develop.

El conflicto paso al fusionar la segunda rama en develop, ya que ambas usaban la misma función lambda echoProcess en Challenge3 y lo resolvimos aceptando ambos cambios en VS Code (accept both changes), luego unificamo StringBuilder + Stream + StringBuffer y lo guardamos con git add, git commit y git push.

## Reto 4 — The Treasure of Duplicate Keys

### Evidencia

![Challenge evidence](images/challenge4.png)
### Descripción

Para este reto implementé dos métodos que guardan datos en un HashMap y en un 
Hashtable, ambos ignorando las claves que ya existen (usando putIfAbsent). Luego hice 
un método que junta los dos mapas: si una clave se repite en ambos, se queda con el 
valor del Hashtable, y al final las claves quedan en mayúsculas y ordenadas usando 
un TreeMap con stream y Collectors.toMap.
 
Subí los cambios con git add, commit y push a mi rama feature/challenge_4_SuaDaniel_2026-2, 
y después la fusioné a develop con git merge. No tuve conflictos porque nadie más 
estaba trabajando en los mismos archivos.

## Reto 5 — Battle of Sets

### Evidencia

![Challenge evidence](images/challenge5.png)
### Descripción

Para este reto hice dos métodos usando stream().filter(): En el metodo 1 converti un HashSet a Stream 
para dejar solo los numero % 3 != 0, y en el metodo2 hice lo mismo con un Tregit statuseSet para descartar 
los multiplos de 5. En el main junte los dos conjuntos filtrados en un TreeSet e imprimi todo 
usando .forEach() con una funcion lambda.

Subi los cambios con git add, commit y push a mi rama feature/challenge5_JuanDuarte_2026-2, y 
después la fusioné a develop con git merge. 

## Reto 6 — The Decision Machine

### Evidencia

![Challenge evidence](images/challenge6.png)
### Descripción

Implementé una máquina de comandos usando un `Map<String, Runnable>` donde cada comando 
está asociado a una lambda que imprime su respuesta. El método executeCommand usa un 
switch para validar que el comando exista antes de ejecutarlo con .run(). Hice los 8 
comandos. Subí los cambios con git add, 
commit y push a mi rama feature/challenge_6_SuaDaniel_2026-2, y los fusioné a develop 
con git merge. No hubo conflictos.


## Questions
### 1. Acuerdos de trabajo en equipo

* ¿A qué horas te encontrarás?
Nos encontraremos ya sea presencial o asincronamente en alguna de las siguientes franjas o en varias de ellas lunes de por la mañana, martes 1:00 pm - 2:30 pm y jueves 8:30 - 10:00
* ¿Cuáles serán tus canales de comunicación: Teams, WhatsApp, Slack...?
WhatsApp para comuniación rapida, teams y discord para archivos y videollamadas
* ¿Con qué frecuencia os encontraréis?
2 sesiones una de ellas presencial otra asincrona segun disponibilidad
* Si surgiera un conflicto, ¿cómo se podría resolver?
Se resolveria, con la comunicación efectiva, exponiendo los desacuerdos de cada uno y entre el grupo se decidiria cual es la mejor solución a dicho problema

### 2. ¿Cual es la diferencia entre git merge y git rebase?
merge une dos ramas creando un nuevo commit que combina los historiales. rebase mueve los commits de una rama para que queden encima de otra, como si hubieran partido desde ahi es decir reescribe el historial para que se vea lineal

### 3. ¿Que pasa cuando dos ramas modifican la misma línea de un archivo?
como git no puede decidir automaticamente cual cambio conservar, genera un conficto de merge. Marcando el archivo con simbolos de flecha, mostrando ambas versiones el programadores debe editar manualmente para resolver que es lo que deja

### 4. ¿Como mostrar grarficamente el historial de ramas y fusiones en la terminal?
usando el comando 
```
git log --online --graph --decorate --all

```

Podemos ver como se dibuja un arbol ascii mostrando ramas. commits t donde se fusionaron

![alt text](images/tree.png)

### 5. ¿Diferencia entre commit y push?

commit guarda el progreso en el historial local(de mi pc) push envia dichos commits al repositorio github, haciendolos visibles para todos

### 6. ¿Qué son git stashy git stash poppara qué se utilizan?

git stash sirve para guardar temporalmente los cambios que se estanhaciendo sin hacer un commit y git stash pop recupera esos cambios y nos deja seguir trabajando desde donde nos habiasmos quedado.

### 7. ¿Cuál es la diferencia entre HashMapy Hashtable?

Los dos sirven para guardar info usando una clave y un valor, pero la diferencia es HashMap es mas rapido y permite guardar valores null. En cambio, Hashtable es un poco mas antiguo, no permite null y funciona mejor cuando varias partes del programa lo usan al mismo tiempo.

### 8. ¿Qué ventajas ofrece Collectors.toMap()respecto a un circuito tradicional?

sirve para convertir una coleccion en un Map de forma mas rapida y ordenada. Es como hacer en una sola linea lo que con un for requeriria varias, ademas de facilitar el manejo de claves repetidas.

### 9. Cuando se utiliza stream().map()en una lista de objetos, ¿qué tipo de operación se realiza?

Se realiza una transformacion de los elementos. Es como tomar cada objeto de la lista y cambiarlo por otro dato. Por ejemplo, de una lista de usuarios podemos tener una lista con solo sus nombres.