# START INSTRUCTIONS

## To run the project with the .jar, you need to have installed:
**-JAVA 8+**
**-JAVA FX**

A .jar file is provided in the project folder, which can be run directly 
by the console with this command:

java --module-path PATH_TO_YOUR_JAVAFX_LIB_FOLDER --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.web -jar test.jar

Don't forget to replace PATH_TO_YOUR_JAVAFX_LIB_FOLDER with the path to your JavaFX lib folder.
And be in the same folder as the .jar file.

However if you want to run the project from the source code, you need to have installed:
-IntelliJ IDEA
-JAVA 8+
-JAVA FX

## To run the project from the source code, you need to:
-Open the project in IntelliJ IDEA
-Go to File -> Project Structure -> Project
-Set the Project SDK to 17 (Java 8)
-Set the Project language level to 8
-Go to File -> Project Structure -> Libraries
-Click on the + button and add the JavaFX lib folder
-Go to Run -> Edit Configurations
-Click on the + button and add a new Application
-Set the Main class to Main
-Set the VM options to --module-path PATH_TO_YOUR_JAVAFX_LIB_FOLDER --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.web
-Don't forget to replace PATH_TO_YOUR_JAVAFX_LIB_FOLDER with the path to your JavaFX lib folder.
-Click on Apply and then OK
-Run the project

And that's good !! You should be able to run the project and see a beautiful grid with the vacuum !

Thanks for your time and the time you spent on the review of this test ! 
