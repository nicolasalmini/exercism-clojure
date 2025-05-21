(ns darts)

(defn square [x] (* x x))

(defn get-radius-2 [x y]
  (+ (square x) (square y)))

(defn score
  "Calculates the score of a dart throw"
  [x y]
  (let [r2 (get-radius-2 x y)]
    (cond
      (> r2 100) 0
      (> r2 25) 1
      (> r2 1) 5
      :else 10
    )))
