# Calculator App Automation With Selenium and Appium
### Here, Selenium Webdriver and Appium are used to automate the calculator app. It can automate calculations for arithmetic series.
## Tools and Technology Used
- IntelliJ IDEA
- Selenium Webdriver
- Appium
- Appium Inspector
- Android Studio
- TestNG Framework
- Java
- Gradle
- Allure

## Prerequisites
- JDK
- Gradle
- Appium

## How to run this project
- Clone this repository
- Give the following command for checking the connectivity with the emulator: adb devices
- Open Appium Server with the following command: appium
- Open Appium Inspector
- Set the following desired capabilities in JSON format & click Start Session:
  ![App Automation Json](https://github.com/Moonmoon838/HRM_Suite_Automation_TestNG/assets/143262452/9f56452c-e746-4384-b358-a3279bf80291)
  
- Open build.gradle file as a project with IntelliJ IDEA
- Open terminal
- Give this following command: gradle clean test
- For generating Allure Report use these commands: allure generate allure-results --clean -output &
  allure serve allure-results

## Allure Report
![AllureReportOverview](https://github.com/Moonmoon838/HRM_Suite_Automation_TestNG/assets/143262452/7715a5ab-c92c-4910-994c-d419de2434b6)

![AllureReportBehaviour](https://github.com/Moonmoon838/HRM_Suite_Automation_TestNG/assets/143262452/83aae44d-31c5-4378-b986-3f89855989dc)

## Output Video
https://github.com/Moonmoon838/HRM_Suite_Automation_TestNG/assets/143262452/992f8cf7-20cf-486e-adc5-e528f9bf75de
