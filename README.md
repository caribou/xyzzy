# xyzzy - magical clojure xml handling

A hollow voice says "Fool".

## Usage

Say you have a string containing XML (we won't judge you for how you arrived at this string, it happens).  
You wish to access some value inside the structure represented by this string.  You could piece together the 
multitude of clojure libraries necessary to actually do this seemingly simple task, or you could appeal to
Xyzzy, the original source of all power.  This is the route we take.

```clj
(require '[xyzzy.core :as xyzzy])
(def blob (xyzzy/parse-xml giant-xml-string))
(xyzzy/text-at blob :keys :into :blob :at :the :path :you :desire)
```

Need at attribute, not the text value?  Use xyzzy/attr-at!

## License

Copyright © 2012 Instrument

Distributed under the MIT License
