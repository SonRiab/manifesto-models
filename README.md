# Manifesto Models

(No pure) POJOs to persist and map data from the Manifesto Project. (https://manifesto-project.wzb.eu/)

### Attention

The current state is alpha or work in progress! The library doesn't include all information the Manfiesto Project API 
provides! 

## Getting started

You will find the models under the package name `de.vnull.manifestoproject.model`.

### Installation 

#### Gradle

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

#### Maven

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

#### Classpath

If you want to use this library directly, you can [download](https://github.com/SonRiab/manifesto-models/releases) and 
add it to our classpath.

### Running tests

Because this library only provides (no pure) POJOs you can use to map or persist Manifesto Project information, 
no tests were added here.

// TODO link to manifesto-api tests

## Build with

* [Gradle](https://gradle.org/) - Build Tool
* [Maven](https://maven.apache.org/) - Dependency Management

## Contributing

// TODO add CONTRIBUTING file

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the 
[tags on this repository](https://github.com/SonRiab/manifesto-models/tags). 

## Authors

* Rene Jablonski ([SonRiab](https://github.com/SonRiab)) - *Initial work*

See also the list of [contributors](https://github.com/SonRiab/manifesto-models/contributors) who participated in this 
project. They were also (hopefully) added to the [CONTRIBUTORS](CONTRIBUTORS) file.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
