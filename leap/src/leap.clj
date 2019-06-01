(ns leap)

(defn- divisible-by [year num]
  (zero? (mod year num)))

(defn- not-divisible-by [year num]
  (not (divisible-by year num)))

(defn leap-year? [year]
  (and (divisible-by year 4)
       (or (not-divisible-by year 100)
           (divisible-by year 400))))
