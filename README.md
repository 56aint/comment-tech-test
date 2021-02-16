##This project has been achieved on windows10 x86_64-bit OS

##Setup & Configuration

###JAVA
1. Install Java jdk
Java SE Development Kit 15 Downloads
```https://www.oracle.com/uk/java/technologies/javase-jdk15-downloads.html```
Follow the default installation prompts
2. Configure Environment variables
*Go to Advance System Settings on windows
  *Click on environment variables
  *Under user variables. Click on new
    *Variable name : JAVA_HOME
    *Variable value: C:\Program Files\Java\jdk-15.0.1
  *Under system variables, place your cursor on PATH, and click edit, add new
   %JAVA_HOME%\bin 




### ECLIPSE
Download Eclipse for JEE Developers
```https://www.eclipse.org/downloads/packages/release/kepler/sr2/eclipse-ide-java-ee-developers```
Install as administrator

To interact with this project on eclipse your local machine:
*fork the repo:
  ```git clone git@github.com:56aint/comment-tech-test```
  To run:
  ```open testRunner/testRun.java, right click and run as JunitTest```
  Switch feature to run:
  features = ".//Features/Comment.feature",
  features = ".//Features/LoginComment.feature"
  Cucumber report is available via the link at the console
  

###CHROMEDRIVER AND CUCUMBER INSTALLATION

1. Download chromeDriver
** Goto your google chromeDriver settings -> help, and find your chrome version
  **Google Chrome is up to date
    Version 88.0.4324.... (Official Build) (64-bit)
Then goto ```https://chromedriver.chromium.org/downloads```
...and download the version of your google chromeDriver

2. CUCUMBER PLUGIN
https://mvnrepository.com/search?q=cucumber
The dependencies below are needed to be copied and paste into the pom.xml file:
Download the latest versions from io.cucumber

cucumber core
cucumber-html
cobertura  from net.sourceforge.cobertura
cucumber-java
cucumber-junit
cucumber-jvm-deps
cucumber-reporting from net.masterthought
hamcrest-core
gherkin
selenium-java
junit

Maven dependencies will be auto downloaded once saved.
to clear the error at the top of pom.xml file, download another dependency:
                <dependency>
			<groupId>com.sun</groupId>
			<artifactId>tools</artifactId>
			<version>1.7</version>
			<scope>system</scope>
			<systemPath>C:\Program Files\Java\jdk-15.0.1\lib\tools.jar</systemPath>
		</dependency>


In eclipse -> click on Help -> click on Eclipse Marketplace
  *search for cucumber and install:
    *Cucumber Eclipse Plugin & Natural
