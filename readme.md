# Property Pattern Example - RPG

Shows how to make use of the property pattern, using a RPG character as an example. This character will receive bonus and malus which will affect his stats.

[![Release docs](https://img.shields.io/badge/docs-release-blue.svg)][site-release]
[![Development docs](https://img.shields.io/badge/docs-develop-blue.svg)][site-develop]

[![Release javadocs](https://img.shields.io/badge/javadocs-release-blue.svg)][javadoc-release]
[![Development javadocs](https://img.shields.io/badge/javadocs-develop-blue.svg)][javadoc-develop]

## Features

- Property pattern usage

## Documentation

Documentation is always generated for the latest release, kept in the 'master' branch:

- The [latest release documentation page][site-release].
- The [latest release Javadoc site][javadoc-release].

Documentation is also generated from the latest snapshot, taken from the 'develop' branch:

- The [the latest snapshot documentation page][site-develop].
- The [latest snapshot Javadoc site][javadoc-develop].

### Building the docs

The documentation site is actually a Maven site, and its sources are included in the project. If required it can be generated by using the following Maven command:

```
$ mvn verify site
```

The verify phase is required, otherwise some of the reports won't be generated.

## Usage

The application is coded in Java, using Maven to manage the project.

It is a Java library, meant to be included as a dependency on any project which may want to make use of it.

### Prerequisites

The project has been tested on the following Java versions:
* JDK 8
* OpenJDK 7

All other dependencies are handled through Maven, and noted in the included POM file.

## Collaborate

Any kind of help with the project will be well received, and there are two main ways to give such help:

- Reporting errors and asking for extensions through the issues management
- or forking the repository and extending the project

### Issues management

Issues are managed at the GitHub [project issues tracker][issues], where any Github user may report bugs or ask for new features.

### Getting the code

If you wish to fork or modify the code, visit the [GitHub project page][scm], where the latest versions are always kept. Check the 'master' branch for the latest release, and the 'develop' for the current, and stable, development version.

## License

The project has been released under the [MIT License][license].

[issues]: https://github.com/bernardo-mg/property-pattern-example-rpg/issues
[javadoc-develop]: https://docs.bernardomg.com/development/maven/property-pattern-example-rpg/apidocs
[javadoc-release]: https://docs.bernardomg.com/maven/property-pattern-example-rpg/apidocs
[license]: http://www.opensource.org/licenses/mit-license.php
[scm]: https://github.com/bernardo-mg/property-pattern-example-rpg
[site-develop]: https://docs.bernardomg.com/development/maven/property-pattern-example-rpg
[site-release]: https://docs.bernardomg.com/maven/property-pattern-example-rpg