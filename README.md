#Zippopotamus-clj

## Description

This is a small wrapper around the Zippopotamus API. It currently supports two public methods

```clojure
;; To find attributes of a zip code
(zip-request 11201)

;; To find attributes of a city
(zip-request "Brooklyn" "NY")

;; Will return a map of attributes with a :body key that holds the JSON response in a Clojure data structure
```

## License

Copyright © 2015 Daniel Spector

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
