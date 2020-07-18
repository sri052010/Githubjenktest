set projectLocation=C:\Srikanth\CucumberProject\Githubjenktest1
cd %projectLocation%
set classpath=C:\Srikanth\CucumberProject\Githubjenktest1\target\classes\;C:\Srikanth\CucumberProject\Githubjenktest1\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause

