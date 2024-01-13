# BootstrapLib

Bienvenue sur le repo github de cette librairie. 
Cette librairie vous permettra de créer facilement un bootstrap en seulement 3 lignes de code.
(Téléchargement de n'importe quel type de fichier mais uniquement lancement de fichier de type jar)

### Os compatibilité

Cette librairie est compatible sur n'importe quel os (normalement).

# __Comment l'utiliser dans son projet ?__

**Obligatoire :**

 >String fileName = "echocraft.jar";
> 
  > String fileUrl = "VotreUrlDeTéléchargement";
> 
   > String outPutPath = "Yourpath" + "\\" + fileName; //Only modify "Yourpath" !!
> 
 **Attention, "yourpath" doit seulement être modifié, pas le reste de la variable !**

Si vous voulez un bootstrap avec une fenêtre et une image en fond voici la ligne que permettra de créer le fenêtre.


> ⚠ Cette option n'est pas obligtoire ⚠

### Frame.newWindow()

```Frame.newWindow("ExampleWindow", 700, 720, true, false, true, ImageUrl);```

### Download.start()

```Download.start(fileUrl, outPutPath);```

### Launch.start()

Cette fonction prends en paramètres, le path de sortie et de quel os il s'agit (je vous conseil de rester sur **false**) 



```Launch.start(outPutPath, false);```

## Exemple entier :

```
package fr.cakihorse.bootstraplib;

public class Example {
    public static void main(String[] args) {


    String fileName = "echocraft.jar";
    String fileUrl = "https://github.com/cakihorse/echocraft/releases/download/V1.2/echocraft.jar";
    String outPutPath = "yourpath" + "\\" + fileName; //Only modify "yourpath" !!

    Frame.newWindow("ExampleWindow", 700, 720, true, false, true, "src/main/resources/bg.jpg");
    Download.start(fileUrl, outPutPath);
    Launch.start(outPutPath, false);

    }
}
```
## Comment L'importer dans son projet ?

### Avec Gradle : 

``implementation files('libs/bootstraplib-1.0-SNAPSHOT-all.jar')``
Veillez à ce que la lib soit incluse dans le BuildPath de votre projet.

## Avec JitPack :
[![](https://jitpack.io/v/cakihorse/bootstraplib.svg)](https://jitpack.io/#cakihorse/bootstraplib)


Ajoutez le à la fin de votre build.gradle :

	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. AAjoutez la dependance : 

	dependencies {
	        implementation 'com.github.cakihorse:bootstraplib:V.1.0'
	}
