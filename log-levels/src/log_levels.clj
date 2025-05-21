(ns log-levels
  (:require [clojure.string :as str]))

;; [INFO]: Something informational is being informed


(defn message
  "Takes a string representing a log line
   and returns its message with whitespace trimmed."
  [s]
  (str/trim
    (second
      (str/split s #":"))))

(defn log-level
  "Takes a string representing a log line
   and returns its level in lower-case."
  [s]
  (->
    s
    (str/split #":")
    first
    (str/replace #"[\[\]]" "")
    str/lower-case))

(defn reformat
  "Takes a string representing a log line and formats it
   with the message first and the log level in parentheses."
  [s]
  (str (message s) " (" (log-level s) ")"))
