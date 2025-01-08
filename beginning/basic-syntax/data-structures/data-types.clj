;;; Clojure has a lot of structures and all of them are immutable

;;; Clojure has great support for numerical values. 
;;; It can support integers, floats, rotios, etc...

42
4.2
4/2

;;; Strings are represented just by double-quotes and only by them

"Darth Vader"
;"/"You shall not pass"/"

;;; Maps

;;; You are very similar to Maps in Java or the Dictionaries in Python

;;; An empty map would be defined like this
{}

;;; Values would be defined like so
{:title "Darth" :name "Vader"}

;;; The :title and :name are keywords. 
;;; Additionally keywords can also used like a functions to lookup the value.
(:title {:title "Darth" :name "Vader"})

;;; You can provide default value here.
(:place {:title "Darth" :name "Vader"} "Death Star")

;;; Can use strings as key if needed tho
{"key" +}

;;; To get a value can use get function
(get {"a" 0 "b" 1} "a")

;;; Maps can be nested:
{:name {:first "Anakin" :last "Skywalker"}}

;;; To get values in those you can use get-in expression.
(get-in {:name {:first "Anakin" :last "Skywalker"}} [:name :last])

;;; can also use the hash-map function to create a map.
(hash-map :a 0 :b 1)
