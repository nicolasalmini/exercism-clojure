(ns collatz-conjecture)

(defn collatz
  "Returns the number of steps it takes to reach 1 according
  to the rules of the Collatz Conjecture."
  ([num]
  (collatz num 0))

  ([num steps]

   (cond
     (= num 1)  steps
     (odd? num) (collatz (+ 1 (* num 3)) (inc steps))
     :else      (collatz (/ num 2) (inc steps)))))
