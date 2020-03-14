# continousIntegration
building blocks for projects

The need for Continous Integration and Code Profilers
1. Performance Improvement
2. Agile methodology timelines


Java Tools for Code Profiling :

Cobertura : calculates the percentage of code accessed by tests.
Sonarqube : code coverage, rules configuration


Installation :
Download binaries from 
https://sonarsource.bintray.com/Distribution/sonarqube/sonarqube-6.3.zip

Extract Binaries

Run SonarQube : cd sonarQubeDirectory/
cd sonarqube-6.3/bin/linux-x86-64/
./sonar.sh start


Execution : 
cd projectDirectory 
mvn install && mvn cobertura:cobertura && mvn sonar:sonar -Dsonar.scm.disabled=True

https://confluence.atlassian.com/display/CLOVER/Comparison+of+code+coverage+tools
