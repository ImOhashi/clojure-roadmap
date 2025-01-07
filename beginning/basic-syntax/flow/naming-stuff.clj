;;; we can use def to name values in Clojure

(def shopping-list
  ["Vodka" "Apple juice" "Red Bull"])

shopping-list
;=> ["Vodka" "Apple juice" "Red Bull"]

(def level "info")
(def message "message")
(if (= level "info")
  (def message (str message " (FYI)"))
  (def message (str message " (OMG)")))

;;; or

(defn error
  [message level]
  (str message
       (if (= level "info")
         " (FYI)"
         " (OMG)")))
(error "message" "info")
;=> "message (FYI)"
