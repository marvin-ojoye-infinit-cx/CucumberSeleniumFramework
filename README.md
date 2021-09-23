#Github Autor Syource: 
	- https://github.com/naveenanimation20/CucumberSeleniumFramework
	
#My Github Fork source
	- https://github.com/marvin-ojoye-infinit-cx/CucumberSeleniumFramework.git
	
#Tutorial Site of Project instructions for Cucumber
	- Cucumber - jvm (BDD Framework) with Selenium WebDriver - Part 1
	- https://www.youtube.com/watch?v=vHzMJuc9Zuk

##IF You havent Installed this Plugins in Eclipse
#Eclipse Plugin Installation Cucumber (in Resources)
	- (in Resources Package)/cucumber-eclipse-plugin-1.0.0-SNAPSHOT
	
	GitDokuSite - https://github.com/cucumber/cucumber-eclipse-update-site
	GitLink - https://cucumber.github.io/cucumber-eclipse/update-site
	
	Work true orgin Source
	-  https://github.com/cucumber/cucumber-eclipse/releases/tag/1.0.0-20210715074736.150
	
	cucumber-eclipse-plugin-1.0.0-SNAPSHOT.zip
	4.73 MB
	Source code
	(zip)
	Source code
	(tar.gz)

	Directly from the Eclipse marketplace, search Cucumber Eclipse Plugin.
	From this update site
	From Eclipse, go to menu Help > Install New software
	Work with: https://cucumber.github.io/cucumber-eclipse/update-site
	Select the check-box for Cucumber Eclipse Plugin
	Select Next as per the instruction shown during installation.
	Restart your Eclipse after completion of instruction.
	Now latest version of cucumber-eclipse plugin is installed successfully in your Eclipse.
	
#Eclipse Plugin Installation TestNG (in Resources)
	- (in Resources Package)/org.testng.eclipse.updatesite

	From Eclipse, go to menu Help > Install New software
	Select the check-box for Cucumber Eclipse Plugin
	Select Resources Folder in the Link of new Software
	Paste the Relative Path from (in Resources Package)/org.testng.eclipse.updatesite
	Select Next as per the instruction shown during installation.
	Restart your Eclipse after completion of instruction.
	Now latest version of cucumber-eclipse plugin is installed successfully in your Eclipse.
	
#TODO Maven LIB Setup POM
	STD LIBs
	cucumber-java-1.2.5.jar
	cucumber-junit-1.2.5.jar
	cucumber-jvm-deps-1.0.5.jar
	cucumber-reporting-5.0.2.jar
	gherkin-2.12.2.jar
	junit-4.13.jar
	selenium-java-3.141.59.jar
	selenium-api-3.141.59.jar
	selenium-chrome-driver-3.141.59.jar
	selenium-edge-driver-3.141.59.jar
	selenium-firefox-driver-3.141.59.jar
	selenium-ie-driver-3.141.59.jar
	selenium-opera-driver-3.141.59.jar
	selenium-remote-driver-3.141.59.jar
	selenium-safari-driver-3.141.59.jar
	selenium-support-3.141.59.jar
	byte-buddy-1.8.15.jar
	commons-exec-1.3.jar
	guava-25.0-jre.jar
	jsr305-1.3.9.jar
	checker-compat-qual-2.0.0.jar
	error_prone_annotations-2.1.3.jar
	j2objc-annotations-1.1.jar
	animal-sniffer-annotations-1.14.jar
	okhttp-3.11.0.jar
	okio-1.14.0.jar
	
	<dependencies>
		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>1.2.5</version>
		</dependency>
		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>1.2.5</version>
		</dependency>
		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-jvm-deps</artifactId>
			<version>1.0.5</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>net.masterthought</groupId>
			<artifactId>cucumber-reporting</artifactId>
			<version>5.0.2</version>
		</dependency>
		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>gherkin</artifactId>
			<version>2.12.2</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.13</version>
		</dependency>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.141.59</version>
		</dependency>
	</dependencies>

#TEST Resources Setup