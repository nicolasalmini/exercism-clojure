(ns triangle)

(defn- is-valid? [a b c]
  (and
    (> a 0) ;; Sides can't be zero
    (> b 0)
    (> c 0)
    (or
      (= a b c) ;; Equilateral triangles don't respect basic triangle inequality rule
      (and (>= (+ a b) c)       ;; Triangle
           (>= (+ a c) b)       ;; Inequality
           (>= (+ b c) a)))))   ;; Rule

(defn equilateral?
  "Returns true if the triangle with sides a, b, and c is equilateral; otherwise, returns false"
  [a b c]
  (and
    (is-valid? a b c)
    (= a b c)))

(defn isosceles?
  "Returns true if the triangle with sides a, b, and c is isosceles; otherwise, returns false"
  [a b c]
  (and
    (is-valid? a b c)
    (or (= a b)
        (= a c)
        (= b c))))

(defn scalene?
  "Returns true if the triangle with sides a, b, and c is scalene; otherwise, returns false"
  [a b c]
  (and
    (is-valid? a b c)
    (distinct? a b c)))
