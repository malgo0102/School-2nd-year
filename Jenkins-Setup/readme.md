Exercise: Setup Jenkins

Create simple helloworld application on git
Create new job in jenkins (Freestyle project)
Link job to git repository
Setup buildjob
Setup github-webhook(https://docs.google.com/document/d/1UlreiXQddZo9e-KJeZhLEmR2PTfILXNDsZtgTixT32Y) follow step 5 & 7
Test if its working

Jenkins AWS setup
Launch Amazon Linux AMI

Open up for port 22 (SSH), 8080 (Tomcat) and 8088 (Jenkins) in your security groups. 
SSH into your instance.(login as ‘ec2-user’)

Commands for your instance:

Updates all packages on your machine
sudo yum update -y

Removes java
sudo yum remove java -y

Installs higher version of java
sudo yum install java-1.8.0-openjdk-devel -y

Shows java version (should be 1.8.0)
java -version

Installs git
sudo yum install git -y

Add the Jenkins repo using the following command
sudo wget -O /etc/yum.repos.d/jenkins.repo http://pkg.jenkins-ci.org/redhat-stable/jenkins.repo
or
sudo wget -O /etc/yum.repos.d/jenkins.repo http://pkg.jenkins-ci.org/redhat/jenkins.repo

Import a key file from Jenkins-CI to enable installation from the package:
sudo rpm --import https://pkg.jenkins.io/redhat/jenkins.io.key
or
sudo rpm --import http://pkg.jenkins-ci.org/redhat-stable/jenkins-ci.org.key

Install Jenkins
sudo yum install jenkins -y

Start Jenkins as a service (uses the default port 8080)
sudo service jenkins start 

Stop Jenkins
sudo service jenkins stop

Restart Jenkins
sudo service jenkins restart

Start Jenkins in another port (stop Jenkins first):
sudo nano /etc/sysconfig/jenkins
Find the port value and change it to 8088.
JENKINS_PORT=“8088”
Now start Jenkins.

Now connect to your EC2 instance through the public DNS
http://<my-server-public-DNS>:8088

Retrieve the password to open jenkins:
sudo cat /var/lib/jenkins/secrets/initialAdminPassword

Install all recommended plugins
