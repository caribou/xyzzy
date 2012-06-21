# XYZZY - magical clojure xml handling

A hollow voice says "Fool".

## Usage

Say you have a string containing XML (we won't judge you for how you arrived at this situation, it happens).  
You wish to access some value inside the structure represented by this string.  You could piece together the 
multitude of clojure libraries necessary to actually do this seemingly simple task, or you could appeal to
XYZZY, the original source of all power.  This is the route we take here.

```clj
(require '[xyzzy.core :as xyzzy])

(let [blob (xyzzy/parse-xml giant-xml-string)]
  (xyzzy/text-at blob :keys :into :the :blob :at :the :path :you :desire))
```

Need an attribute, not the text value?  Use xyzzy/attr-at!

## License

Copyright © 2012 Instrument

Distributed under the MIT License
