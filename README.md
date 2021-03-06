#Zippopotamus-clj

Zipcodes for Clojure

## Usage

Add this to your dependencies in Leiningen

```clojure
[zippopotamus-clj "0.1.3"]
```

If you're using it in your REPL

```clojure
; You can use refer if you want as well
(require '[zippopotamus-clj.core :as z])
```

Or in your code

```clojure
(ns my-app.core
  (:require [zippopotamus-clj.core :as z]))
```

## Description

This is a small wrapper around the Zippopotamus API. It currently supports two public methods

```clojure
;; To find attributes of a zip code
(z/zip-request 11201)

;; To find attributes of a city
(z/city-request "Brooklyn" "NY")

;; Will return the JSON from the API as a Clojure map
```

## License

Copyright © 2015 Daniel Spector

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
