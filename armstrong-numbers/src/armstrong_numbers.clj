(ns armstrong-numbers)

(defn toNum [char]
  "convert a number character to it's number"
  (biginteger (- (int char) (int \0))))

(defn numbers [str]
  "convert a string into a list of numbers"
  (map toNum (seq str)))

(defn powNumbers [numbers]
  "return the list of numbers, each to the power of the number of digits"
  (map #(.pow % (count numbers)) numbers))

(defn add [numbers]
  "sum a list of numbers"
  (reduce + numbers))

(defn armstrong? [num]
  (= num
     (add
      (powNumbers
       (numbers
        (str num))))))