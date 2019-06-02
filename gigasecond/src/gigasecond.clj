(ns gigasecond
  (:import (java.time LocalDateTime)))

(defn from [^long year ^long month ^long day]
  (let [date (-> (LocalDateTime/of year month day 0 0)
                (.plusSeconds 1E9))]
    [(.getYear date) (.getMonthValue date) (.getDayOfMonth date)]))
