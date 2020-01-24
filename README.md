# Duct logger.clojure

[![Build Status](https://travis-ci.org/duct-framework/logger.clojure.svg?branch=master)](https://travis-ci.org/duct-framework/logger.clojure)

Integrant multimethods for setting up a [tools.logging][] logger for
the [Duct][] framework.

[timbre]: https://github.com/clojure/tools.logging
[duct]: https://github.com/duct-framework/duct

## Installation

To install, add the following to your project `:dependencies`:

    [duct/logger.clojure "0.1.0-SNAPSHOT"]

## Usage

There are no configuration options for this. Just add the
`:duct.logger/clojure` key to your configuration:

```clojure
{:duct.logger/clojure {}}
```

When this configuration is initiated with `integrant.core/init`, the
`:duct.logger/timbre` key is replaced with an implementation of the
`duct.logger/Logger` protocol. See the [duct.logger][] library for how
to make use of this.

[duct.logger]: https://github.com/duct-framework/logger

## License

Copyright © 2020 James Reeves

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
