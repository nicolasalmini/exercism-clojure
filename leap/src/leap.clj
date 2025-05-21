(ns leap)

(defn divisible-by? [a b]
  (zero? (rem a b)))

(defn leap-year? [year]
  (if (divisible-by? year 100)
    (divisible-by? year 400)
    (divisible-by? year 4)))
