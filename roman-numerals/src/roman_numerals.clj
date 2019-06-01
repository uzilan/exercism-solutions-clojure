(ns roman-numerals)

(defn- rpt [num times]
  (apply str (concat (take times (repeat num)))))

(defn- roman [num one five ten]
  (cond
    (= num 10) ten
    (= num 9) (str one ten)
    (<= 6 num 8) (str five (rpt one (- num 5)))
    (= num 5) five
    (= num 4) (str one five)
    (<= 1 num 3) (rpt one num)))

(defn numerals [num]
  (cond
    (> num 1000) (str "M" (numerals (- num 1000)))
    (> num 100) (str (roman (quot num 100) "C" "D" "M") (numerals (rem num 100)))
    (> num 10) (str (roman (quot num 10) "X" "L" "C") (numerals (rem num 10)))
    (>= num 1) (roman num "I" "V" "X")))

