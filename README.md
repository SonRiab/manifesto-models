# Manifesto Models

Models to persist and map data from the Manifesto Project. (https://manifesto-project.wzb.eu/) 

## Getting started

### Gradle

If you want to use this library with **Gradle** add this into the dependencies of your `build.gradle` file:
```
compile 'de.vnull.manifestoproject:manifesto-models:'
```

Full example of `build.gradle`:
```
group 'your.group'
version '1.0-SNAPSHOT'

apply plugin: 'java'

sourceCompatibility = 1.8

repositories {
    mavenCentral()
}

dependencies {
    compile 'de.vnull.manifestoproject:manifesto-models:1.0-SNAPSHOT'
    testCompile group: 'junit', name: 'junit', version: '4.12'
}
```

### Maven

If you want to use this library with **Maven** add this into the dependencies of your `pom.xml` file:
```
<dependency>
    <groupId>de.vnull.manifestoproject</groupId>
    <artifactId>manifesto-models</artifactId>
    <version>1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

Full example of `pom.xml`:
```
<?xml version="1.0" encoding="UTF-8"?>
<project xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd" xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <modelVersion>4.0.0</modelVersion>
  <groupId>your.group</groupId>
  <artifactId>your-project</artifactId>
  <version>1.0-SNAPSHOT</version>
  <dependencies>
    <dependency>
        <groupId>de.vnull.manifestoproject</groupId>
        <artifactId>manifesto-models</artifactId>
        <version>1.0-SNAPSHOT</version>
        <scope>compile</scope>
    </dependency>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>

```
