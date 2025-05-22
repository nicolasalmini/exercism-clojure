(ns rpn)

(defn is-operator? [x]
  (not (number? x)))

(defn- evaluate-operation [current-acc operator]
  (let
    [[start last-two] (split-at (- (count current-acc) 2) current-acc)
     evaluated-operation (operator (first last-two) (second last-two))]
    (vec (flatten [start evaluated-operation]))))

(defn evaluate-rpn
  ([tokens]
   (evaluate-rpn tokens []))

  ([tokens acc]
    (if (empty? tokens)
      acc

      (let [[current-token & tail] tokens
            tail-as-vec (vec tail)]
        (if (not (is-operator? current-token))
          (evaluate-rpn tail-as-vec (conj acc current-token))

          (let [updated-acc (evaluate-operation acc current-token)]
            (evaluate-rpn tail-as-vec updated-acc)))))))

