# Web Automation Test at saucedemo.com

Web automation test at https://www.saucedemo.com/ for testing the specific product
detail page and add to cart button on that page. And testing registered user at login page.
The project created with lessons learned from a large number of development project.

# Table of Content
* [Concept Included](#concept-included)
* [Pre-requisites](#prerequisites)
* [Running the Test](#running-the-test)

# Concept Included

- Shared state across cucumber step definitions
- Page Object pattern
- Common web page interaction methods
- Externalised test configuration
- Commonly used test utility classes

# Prerequisites

## Tools

- Maven
- Cucumber-JVM
- JUnit
- Selenium Webdriver

## Requirements

- JDK above version 8
- Gradle version 8.5 or Gradle Wrapper
- Firefox and geckodriver (can be change in config)

## Repository Installing Tutorial

**Clone this repository and navigate to the code directory as shown below :**

```bash
git clone https://github.com/ichsanmp/web_automation_saucedemo
cd web_automation_saucedemo
```

## File Configuration

- Setup testing with code :

```bash
test {
    useJUnitPlatform()
    systemProperty "cucumber.filter.tags", System.getProperty("cucumber.filter.tags")
}
```

- Setup gradle task web testing with code :

```bash
configurations {
    cucumberRuntime {
        extendsFrom testImplementation
    }
}
```

- Setup cucumber testing with code :

```bash
tasks.register('webTest') {
    description("Running Cucumber Test")
    dependsOn assemble, compileTestJava
    doLast {
        javaexec {
            main = "io.cucumber.core.cli.Main"
            classpath = configurations.cucumberRuntime + sourceSets.main.output + sourceSets.test.output
            args = [
                    '--plugin', 'html:reports/test-report.html',
                    '--plugin', 'pretty',
                    '--glue', 'com.SauceDemo',
                    '--tags', "${tags}",
                    'src/test/resources'
            ]
        }
    }
}
```

## Project Structure

```bash
(Name_of_Project)
  src
    java
    test
      java
        com.SauceDemo
          helper
            utility.java
          page
            (name_of_page).java
          runner
            tesRunner.java
          stepDef
            hook.java
            (feature).java
      resources
        (feature).feature
  
```
# Running the Test

**Test Scenario** will be executed in terminal using command line :

```bash
./gradlew webTest
```

**Report** from this testing will be saved in the project folder locate at **reports/test-report.html**