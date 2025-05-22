(ns grains)

(defn square
  "Returns the number of grains on the n-th chessboard square."
  [n]
  (.shiftLeft (biginteger 1) (dec n)))

(defn total
  "Returns the total number of grains on the chessboard."
  []
  ;; Sum = 2^n - 1
  (dec (square 65)))

