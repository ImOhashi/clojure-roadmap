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

;;; with do you can chain several more expression into one condition

;;; with when you have a combination of if and do. But you don't have else operand

(when true
  (println "Clojure seems awesome.")
  (println "And more awesome with when."))
;Clojure seems awesome.
;And more awesome with when.

;;; booleans and nil

;;; there are true and false boolean values in Clojure. nil represents the no value

;;; You can check if a value is nil with nil? expression

(nil? 0)
;=> false

(nil? nil)
;=> true

;;; Both nil and false stand for logical falseness, all other values are considered true

(if nil? "random string"
    "this random string is true")
;=> "this random string is true"

(if nil
  "nil is true"
  "nil is false")
;=> "nil is false"

;;; Equality operator is =

(= 1 1)
;=> true

(= 1 2)
;=> false

;;; Clojure also has and and or operators. Those act bit differently than in other langs

;;; or returns the first true value or the last value

(or false nil "this will be returned")
;=> "this will be returned"

(or (= 0 1) (= "a" "b"))
;=> false

(or nil)
;=> nil