(ns hamming)

(defn distance [strand1 strand2]
  (if (= (count strand1) (count strand2))
    (->>
      (map = strand1 strand2)
      (filter false?)
      count)

    (throw (IllegalArgumentException. "strands must be of equal length"))))
