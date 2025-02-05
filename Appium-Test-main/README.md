# Api Demo App Automation Project

This project contains automated tests for the Api Demo App. It utilizes Appium Framework with Java to automate interactions with the app.


## Prerequisites

Before running the tests, ensure you have the following installed:
- Java Development Kit (JDK) 8 or higher
- Appium
- Android Studio
  
You can install the JDK from [here](https://www.oracle.com/java/technologies/javase-downloads.html).

For Maven, add the following dependency to your `pom.xml`:
```xml
      <dependency>
            <groupId>io.appium</groupId>
            <artifactId>java-client</artifactId>
            <version>9.0.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.8.0</version>
            <scope>test</scope>
        </dependency>

#Project Structure
swag-labs-automation/

│
├── src/
│   ├── main/                              # (if applicable, for application code)
│   │
│   └── test/
│        └── java/
│          ├── Test/
│          │    └── android/           
│          │    │      └── api_demo       
│          │    │                   └── ApiDemoTest.java  
│          │    └── TestBase.java
│          │
│          └──Page/
│              └── api_demo    
│              │       └──  ListViewPage.java
│              └── BasePage.java
│
├── apk/
│   ├── API_demo_AUT2023.apk
│   └── Test_app.apk
│   
└── README.md                            # This file

### Test Case:
Test case 1:
1.Navigate to "Support v13 Demos" => Fragment => Pager
2.Verify #1 display
3.Swipe left to right 6 times
4.Verify #6 display
Test case 2:
1.Navigate to "Support v13 Demos" => Fragment => Pager
2.Click Last button
3.Verify #9 display
4.Swipe right to left 6 times
5.Verify #3 display











