# SOLID

* Introducción al código limpio
* Importancia del nombrado
* Las funciones en el código limpio
* Comentarios
* Formateo
* Objetos y estructuras de datos
* Procesamiento de errores

* Refactoring


## 1. Código limpio

### Qué es el código limpio

Cada lenguaje y paradigma de programación tiene su conjunto de matices, buenas prácticas, convenciones. EJ:

* Java: camelCase
* Python: snake_case

> El código limpio puede resumirse como un código que cualquier desarrollador puede leer y modificar fácilmente.

Referentes: Martin Fowler y Robert C Martin

Cualquiera puede escribir código que un ordenador pueda entender, la clave es que otras personas puedan entenderlo.

* Lenguaje de bajo nivel
* Lenguaje ensamblador
* Lenguaje de alto nivel
    * Primera generación
    * Segunda generación
    * ....

El código fuente será compilado/interpretado para un procesador concreto.

Java:

* Lenguaje de programación: Java SE
* JVM
* Biblioteca estándar (API)
* Java EE (Jakarta EE): javax a jakarta

Características:

* Enfocado: debe escribirse para resolver un problema específico y nada más.
* Simple. Evitar complejidad
* Testable: el código debe ser intuitivo y fácil de probar

Ciclo de vida del software:
* Análisis de requisitos (ERS)
* Diseño: Arquitectura (alto nivel) y bajo nivel (UML)
* Desarrollo
* Testing: QA, TDD, BDD
* Despliegue: devOps, devSecOps (AWS, GCP, DO, Azure)
* Mantenimiento: monitorización

Paradigmas:

* Estructurada
* POO
* Funcional
* Reactiva

### Por qué queremos el código limpio
Problema **deuda técnica** y complejidad: el código acumula defectos, demasiada complejidad, desarrollos que no se han implementado de buena manera. Se forma un efecto de bola de nieve que se acumula y puede hacer que un proyecto de software, al cabo de 5 años sea insostenible económicamente.

Herramientas para medir deuda técnica y complejidad:

* Empresa: SonarSource
* Plugin IntelliJ IDEA: Sonarlint
* Plataforma: SonarQube
* SaaS: SonarCloud

Ventajas:

* Mejor mantenimiento: corrección de fallos, evolución, nuevas mejoras, todo más fácil.
* Solución de problemas más rápida
* Comprensión más rápida: cualquier desarrollador nuevo en el proyecto se adapta antes.

### Regla BoyScout

> Deja el código más limpio de lo que lo encontraste.

Basta con introducir un pequeño arreglo cada vez que tocamos un código. Desde mejorar los identificadores hasta refactorizar una función.

El concepto de calidad debe ser común para todo el equipo, todo el equipo debe estar alineado en base a unas mismas prácticas.

## 2. Nombrado

* Utilizar nombres que revelen la intención
* Evitar desinformación
* hacer distinciones significativas
* Utilizar nombres pronunciables
* Utilizar nombres que se puedan buscar
* Evitar el mapeo mental
* Elegir nombre de Clase
* Elección nombre de método
* Claridad, cuidado con eufemismos: kill(), abort()
* Una palabra con concepto
* Contexto significativo

### 2.1. Nombres que revelen intención

Mal:
```java
int d; // elapsed time in days
```

Bien:
```java
int elapsedTimeInDays;
int elapsedDays;
int fileAgeInDays;
```



Mal:
```java 
// get active employees
public List<int[]> getElements(){
	List<int[]> list1 = new ArrayList<>();
	for( int[] x: theList )
		if(x[0] == 1)
			list1.add(x);
	return list1;
}
```

Bien:
```java 
public List<Employee> getActiveEmployees(){
	List<Employee> activeEmployees = new ArrayList<>();
	for(Employee employee: employees )
		if(employee.isActive())
			activeEmployees.add(employee);
	return activeEmployees;
}
```

### 2.2. Evitar desinformación
Evitar dejar pistas falsas que creen confusión con respecto a los datos que estamos manejando.

Si tenemos una variable ``account``, que en realidad es una lista entonces nos está creando la confusión de pensar que es una sola cuenta cuando en realidad es una lista. O al revés, una variables ``accounts`` cuando en realidad no es una estructura de datos.

### 2.3. Distinciones significativas

No utilizar el mismo nombre para referirse a cosas diferentes en el mismo ámbito. Evitar elegir nombres de forma arbitraria:

* ``Product``, ``ProductInfo``, ``ProductData``
* ``Customer``, ``CustomerObject``
* ``customer``, ``customerInfo``
* ``money``, ``moneyAmount``
* ``message``, ``theMessage``

Mal:

```java 
public static void copyChars(char[] a1, char[] a2){
	for (int i = 0; i < a1.length; i++)
		a2[i] = a1[i];
}
```

Bien:

```java 
public static void copyChars(char[] source, char[] destination){
	for (int i = 0; i < source.length; i++)
		destination[i] = source[i];
}
```

### 2.4. Utilizar nombres pronunciables

Mal:

```java 
class DtaRcrd102{
	LocalDateTime genymdhms;
	LocalDateTime modymdhms;
}
```

Bien:

```java 
class Customer{
	LocalDateTime generationTimestamp;
	LocalDateTime modificationTimestamp;
}
```

### 2.5. Búsqueda de nombres


Mal:

```java 
for (int j = 0; j < 34; j++){
	s += (t[j]*4) / 5;
}
```

Bien:

```java 
public static final int WORK_DAYS_PER_WEEK = 5;

int idealTasksPerDay = 4; 
int sum = 0;

for (int j = 0; j < tasks.length; j++){
	int realTaskDays = tasks[j].estimate * idealTasksPerDay;
	int realTaskWeek = realTaskDays / WORK_DAYS_PER_WEEK;
	sum += realTaskWeek;
}

```

### 2.6. Notación Húngara

HN proporciona una forma de prefijar el nombre de una variable con su tipo de dato. Esto se utilizaba más en los lenguajes de bajo nivel.

No se usa hoy en día en los lenguajes de alto nivel, especialmente java que es un lenguaje fuertemente tipado.

```java
// Notación húngara: [scope] + type + name + [qualifier]

bFinished = false;
strHexDigits = "0123456789ABCDEF";
```

### 2.7.  Prefijos

Mal:

```java 
public class Part{
	private String m_dsc; // textual description
}
```

Bien:

```java 
public class Part{
	private String description;
}```

### 2.8. Interfaces e implementaciones

Mal: `IShapeFactory`, `ShapeFactory`

Bien: `ShapeFactory`, `ShapeFactoryImp` o `ShapeFactoryImpl`

### 2.9. Asignación mental

En el contexto tradicional de los bucles ``for`` se suelen utilizar las letras ``i``, ``j``, ``k``, ``l``.

Pero en otros contextos no es buena idea utilizar variables de una sola letra que impliquen un proceso mental extra de tener que saber o mapear mentalmente a qué concepto equivale cada cosa.

### 2.10. Nombrado de clases y métodos

Los métodos deberían ser verbos: ``postPayment()``, ``deletePage()``, ``save()``.

Los métodos para acceder o cambiar debería ser: ``get``, ``set``, ``is``.

En lugar de sobrecargar constructores es mejor usar:

* Factorías que describan los argumentos
* Patrón Builder

```java
Complex point = new Complex(23.0);
Complex point = new Complex(23.0, 50.9, 6.0, 77, true, "text");

// Uso de Factories
Complex point = Complex.fromRealNumber(23.0);
```

### 2.11. Claridad, cuidado con eufemismos: kill(), abort()

```
kill()
abort()
stop()
delete()
```

### 2.12. Una palabra por concepto

Ser consistente a la hora de nombrar, no utilizar distintas palabras para lo mismo de manera arbitraria:

* get(), fetch(), retrieve(), find(), read(): Si todos hacen lo mismo en diferentes clases, lo mejor es nombrarlos igual en todas las clases.
* CustomerController, EmployeeController. Evitar utilizar palabras distintas cuando en realidad es lo mismo: CustomerController, EmployeeManager, AccountDriver
    * Spring REST: CustomerRestController, EmployeeRestController
    * Spring MVC: CustomerController, EmployeeController

## 3. Funciones

### 3.1. Funciones pequeñas

2,3,4 líneas de código por función está bien. En general, cuantas menos líneas tenga mejor.

### 3.2. Bloques e indentación
Indentación es la sangría que aplicamos al código que está contenido en una estructura: if, else, switch, for, while.

Cada bloque debería tener una o dos líneas como mucho.

### 3.3. Una sola funcionalidad por función

Mal

```java
public void emailClients(List<Client> clients){
	for(Client client: clients){
		Client clientDB = repository.findOne(client.getId());
		if(clientDB.isActive())
			email(client);
	}
}

```

Bien:

```java
public void emailClients(List<Client> clients){
	for(Client client: clients){
		if(isActive(client.getId()))
			email(client);
	}
}

private boolean isActive(Long customerId){
	Client clientDB = repository.findById(customerId);
	return clientDB.isActive();
}

```


### 3.4. No mezclar niveles de abstracción

* Nivel abstracción alto: ``getHtml();``
* Nivel de abstracción intermedio: ``String pagePathName = PathParser.render(pagePath);``
* Nivel de abstracción bajo: ``.append("\n")``

### 3.5. Lectura descendente

> De alto nivel a bajo nivel.

El código se lee como una narración descendente.

Cada función vaya seguida de las del siguiente nivel de abstracción, de modo que podamos leer el programa descendiendo un nivel de abstracción cada vez.

Es decir, no mezclar en el orden las funciones de alto nivel con las de bajo ni intercalarlas.

