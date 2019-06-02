(ns triangle)

(defn type [a b c]
  (let [longest (max a b c)
        distinct-sides (count (distinct (list a b c)))]
    (cond
      (>= (* longest 2) (+ a b c)) :illogical
      (= distinct-sides 1) :equilateral
      (<= distinct-sides 2) :isosceles
      (= distinct-sides 3) :scalene)))
