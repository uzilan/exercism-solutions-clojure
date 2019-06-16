(ns prime-factors)

(defn- divisible-by? [num div]
  (= (rem num div) 0))

(defn- first-prime [num]
  (some
    #(when (divisible-by? num %) %)
    (range 2 (+ num 1))))

(defn of [num]
  (if (< num 2)
    []
    (let [prime (first-prime num)]
      (cons prime (of (/ num prime))))))
