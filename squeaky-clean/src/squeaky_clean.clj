(ns squeaky-clean
  (:require [clojure.string :as str]))

(defn- replace-empty-spaces [s]
  (str/replace s #"\s" "_"))

(defn- replace-control-characters [s]
  (str/replace s #"\p{Cc}" "CTRL"))

(defn- convert-kebab-case-into-camel-case [s]
  (str/replace s #"-(\p{L})" #(str/upper-case (%1 1))))

(defn- remove-non-letter-characters [s]
  (str/replace s #"[^\p{L}_]|[α-ω]" ""))

(defn clean
  "TODO: add docstring"
  [s]
  (->
    s
    replace-control-characters
    replace-empty-spaces
    convert-kebab-case-into-camel-case
    remove-non-letter-characters))
