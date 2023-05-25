# START INSTRUCTIONS

## To run the project with the .jar, you need to have installed:
</br>


**- JAVA 8+**
</br>
**- JAVA FX**
</br>

A .jar file is provided in the project folder, which can be run directly 
by the console with this command:

</br>


```java --module-path PATH_TO_YOUR_JAVAFX_LIB_FOLDER --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.web -jar test.jar```

</br>


Don't forget to replace ```PATH_TO_YOUR_JAVAFX_LIB_FOLDER``` with the path to your JavaFX lib folder.
And be in the same folder as the .jar file.

</br>


## However if you want to run the project from the source code, you need to have installed:
</br>

**- IntelliJ IDEA**
</br>
**- JAVA 8+**
</br>
**- JAVA FX**

## To run the project from the source code, you need to:
</br>
- Open the project in IntelliJ IDEA
</br>
</br>
- Go to File -> Project Structure -> Project
</br>
</br>
- Set the Project SDK to 17 (Java 8)
</br>
</br>
- Set the Project language level to 8
</br>
</br>
- Go to File -> Project Structure -> Libraries
</br>
</br>
- Click on the + button and add the JavaFX lib folder
</br>
</br>
- Go to Run -> Edit Configurations
</br>
</br>
- Click on the + button and add a new Application
</br>
</br>
- Set the Main class to Main
</br>
</br>
- Set the VM options to : --module-path PATH_TO_YOUR_JAVAFX_LIB_FOLDER --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.web
</br>
</br>
- Don't forget to replace PATH_TO_YOUR_JAVAFX_LIB_FOLDER with the path to your JavaFX lib folder.
</br>
</br>
- Click on Apply and then OK
</br>
</br>
- Run the project

</br></br>
**And that's good !! You should be able to run the project and see a beautiful grid with the vacuum !**
</br></br>
**Thanks for your time and the time you spent on the review of this test !**
