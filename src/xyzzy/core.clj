(ns xyzzy.core
  (:use [clojure.data.zip.xml :only (xml-> text attr)])
  (:require [clojure.xml :as xml]
            [clojure.zip :as zip])
  (:import [java.io ByteArrayInputStream]))

(defn string-to-stream
  "Turns a string into an input stream suitable for further stream-based operations"
  [string]
  (ByteArrayInputStream.
   (.getBytes (.trim string))))

(defn parse-xml
  "Takes a string containing xml and returns a structure which can be navigated by xyzzy."
  [xml]
  (zip/xml-zip
   (xml/parse
    (string-to-stream xml))))

(defn text-at
  "Takes a parsed xml blob and accesses the text value given by the list of keys."
  [xml & keys]
  (apply
   (partial xml-> xml)
   (conj (vec keys) text)))

(defn attr-at
  "Takes a parsed xml blob and accesses the attributes given by the list of keys."
  [xml & keys]
  (apply
   (partial xml-> xml)
   (conj (vec keys) attr)))
