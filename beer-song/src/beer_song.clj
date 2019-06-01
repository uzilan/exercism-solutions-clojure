(ns beer-song)

(defn- bottles
  "return 'bottle' or 'bottles', based on the number"
  [num]
  (str " bottle" (if (> num 1) "s" "")))

(defn- one
  "return 'it' or 'one', based on the number"
  [num]
  (if (= num 1) "it" "one"))

(defn- on-the-wall
  "return the end of the verse, based on the number"
  [num]
  (if (= num 0)
    "no more bottles of beer on the wall.\n"
    (str num (bottles num) " of beer on the wall.\n")))

(defn verse
  "Returns the nth verse of the song."
  [num]
  (if (= num 0)
    "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
    (str num (bottles num) " of beer on the wall, " num (bottles num) " of beer.\n"
         "Take " (one num) " down and pass it around, " (on-the-wall (- num 1)))))

(defn sing
  "Given a start and an optional end, returns all verses in this interval. If
  end is not given, the whole song from start is sung."
  ([start]
   (sing start 0))
  ([start end]
   (if (= end start)
     (verse start)
     (str (verse start) "\n" (sing (- start 1) end)))))

