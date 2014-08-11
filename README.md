#iOS Appium with Java
A iOS app automation framework using JAVA and [APPIUM](http://appium.io/)


##Get running..

###Software Requirements:

1. MAC OS X 10.7 (minimum version required)
2. Xcode (updated version)
3. Node.js
4. Appium.app
5. Eclipse IDE
6. ANT as build tool

###Appium IOS setup:

1. Install node.js (includes npm, the node.js package manager).
2. sudo npm install -g appium
3. sudo npm install wd
4. sudo authorize_ios (authorise the use of iOS simulator)
5. appium & (start appium server. default port 4723)

###Cloning the repository
```ruby
git clone https://github.com/itsrunning/iOS_Appium_Java.git
```

###Importing the project in Eclipse IDE
1. Open Eclipse and create a new workspace
2. Click on File -> Import
3. In import tab, expand "General" and click on "Existing Projects into Workspace"
4. Select root directory as the cloned folder
5. Click on Finish
6. Create a empty folder 'lib' in the root directory
7. Add Selenium Webdriver to the project.
   * Download the Selenium WebDriver for Java from the location: http://seleniumhq.org/download/
   * Add all the Selenium JAR files to the 'lib' folder
8. Right click on the Project and select properties 
9. In properties tab select java build path -> in the libraries tab Add External JARs add all the Selenium JAR files from the 'lib' folder
10. Install the [testNG plugin for Eclipse](http://testng.org/doc/eclipse.html#eclipse-installation)
