(ns proverb)

(defn- all-for-the-want [thing]
  (str "And all for the want of a " thing "."))

(defn- for-the-want [things]
  (if (= 1 (count things))
    ""
    (str "For want of a " (first things) " the " (second things) " was lost.\n" (for-the-want (rest things)))))

(defn recite [things]
  (if (empty? things)
    ""
    (str (for-the-want things) (all-for-the-want (first things)))))
