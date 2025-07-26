(ns anagram
  (:require [clojure.string :as str]))

(println "anagram.clj file is being loaded!")

(defn anagram? [s1 s2]
  (let [lcs1 (str/lower-case s1)
        lcs2 (str/lower-case s2)]
    (and (not= lcs1 lcs2)
         (= (sort lcs1) (sort lcs2)))))


(defn anagrams-for
  [target-word
   candidates]
  ;; (filter (partial anagram? target-word) candidates))
  (filter #(anagram? target-word %) candidates))

 
(anagrams-for "BANANA" ["BANANA" "banana" "nanaba" "NANABA"])

(anagram/anagrams-for "BANANA" ["banana"])