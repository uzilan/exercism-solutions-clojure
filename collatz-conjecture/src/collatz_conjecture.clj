(ns collatz-conjecture)

(defn collatz
  ([num]
   (collatz num 0))
  ([num times]
   (cond
     (= num 1) times
     (even? num) (collatz (/ num 2) (+ times 1))
     :else (collatz (+ (* num 3) 1) (+ times 1)))))