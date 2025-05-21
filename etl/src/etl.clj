(ns etl)
(require '[clojure.string :as str])

(defn transform [source]
  (->>
    source
    (mapcat
      (fn [[value letter-list]]
        (map
          (fn [letter]
            [(str/lower-case letter) value])
          letter-list)))
    (into {})
  ))
