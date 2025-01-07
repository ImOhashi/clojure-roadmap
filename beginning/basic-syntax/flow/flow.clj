;;; with if you can do conditions in your code

(if true
  "Clojure seems awesome."
  "Clojure seems like a lot.")
;=> "Clojure seems awesome"

;;; with do you can chain multiple expressions into one

(if true
  (do (println "Clojure seems awesome.")
  (println "And more awesome with do."))
  "Clojure seems like a lot.")
;Clojure seems awesome.
;And more awesome with do.

;;; with do you can chain  more expression into one condition

;;; with when you have a combination of if and do. But you don't have else operand

(when true
  (println "Clojure seems awesome.")
  (println "And more awesome with when."))