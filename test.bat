set Projectpath=D:\Automation_Training\Userlogin
cd %Projectpath%
set classpath=%Projectpath%\bin;%Projectpath%\lib\*
java org.testng.TestNG %Projectpath%\testng.xml
