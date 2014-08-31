# Dive into Datomic: getting started Leiningen template

A basic template for working with Datomic Free. Includes logging configuration.

## Usage

To start using Datomic, download Datomic Free from [https://my.datomic.com/downloads/free](https://my.datomic.com/downloads/free), unzip it, and start the transactor process:

```
cd datomic-free-0.9.4894
bin/transactor config/samples/free-transactor-template.properties
```

Then, to use this template to create a new project: 

```
lein new did-datomic-free did-sandbox
cd did-sandbox
```

Then start up a repl:

```
lein repl
```

## License

Copyright © 2014 Robert Stuttaford

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.