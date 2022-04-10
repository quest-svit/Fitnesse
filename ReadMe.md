# Fitnesse

FitNesse is an open source automated framework created for software testing purposes.
FitNesse is designed to support functional testing (also known as acceptance testing) by being integrated on a business leve
It can perform integration Tests on the system under test.


## Code Organisation
* The system under test is inside code folder
* The fixtures to test the SUT ( Calculator) is under fixtures folder.
* The Fitnesse Test Pages are inside the FitnesseRoot folder.

## How to use?
1. Run the start-fitnesse.sh script.
   1. The script compiles the code 
   2. Then it compiles the fixtures. 
   3. Then it starts the fitnesse server.
![start](docs/startFitnesse.png)
2. Go to browser and Open http://localhost:/7000. 
3. When running for the first time it will show the following home-page
![default-home](docs/DefaultHome.png)
4. Add some Suite and Test Pages.
![add-test](docs/addFitnesseTest.png)
5. Run the suite
![suite-run](docs/Running_Suite.png)
