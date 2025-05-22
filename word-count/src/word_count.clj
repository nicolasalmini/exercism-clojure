(ns word-count)

;; I'm not enjoying the fact that, since most Java functions
;; use RegEx in some way to interact with strings, every exercise
;; that involves manipulating a string ends up being a RegEx test,
;; not an actual clojure development problem.
;;
;; I'm still hoping to see an actual proper clojure exercise involving
;; strings that are not RegEx focused

(defn word-count
  "Counts how many times each word occurs in the given string"
  [s]
  (->>
    s
    (clojure.string/lower-case)
    (re-seq #"\b(?:\d+|[a-z]+(?:'[a-z]+)?)\b")
    (frequencies)
  ))
