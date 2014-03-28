iOS_Appium_Java
===============

Software Requirements:

1. MAC OS X 10.7 (minimum version required)
2. Xcode (updated version)
3. Node.js
4. Appium.app
5. Eclipse IDE
6. ANT as build tool

Appium IOS setup:

1. Install node.js (includes npm, the node.js package manager).
2. sudo npm install -g appium
3. sudo npm install wd
4. sudo authorize_ios (authorise the use of iOS simulator)
5. appium & (start appium server. default port 4723)

SET-UP INSTRUCTION

1. Clone the repository.
2. Create a empty folder 'lib' in the root directory
3. Add Selenium Webdriver to the project.
   * Download the Selenium WebDriver for Java from the location: http://seleniumhq.org/download/
   * Add all the Selenium JAR files to the 'lib' folder
4. Right click on the ‘ReferencedLibraries->BuildPath->ConfigureBuildPath‘ and then click on ‘Add External JARs‘ button.
5. Add all the Selenium JAR files from the 'lib' folder
