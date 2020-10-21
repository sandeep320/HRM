set projectLocation=C:\Users\Sandeep\eclipse-workspace\Hrm_Orangee
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%lib\*
java org.testng.TestNG %projectLocation%\testng.xml