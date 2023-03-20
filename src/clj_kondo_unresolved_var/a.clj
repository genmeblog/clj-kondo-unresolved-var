(ns clj-kondo-unresolved-var.a
  ;; get rid of macro call and local call to symbol1
  {:clj-kondo/config '{:config-in-call {clj-kondo-unresolved-var.a/emit-some-symbol
                                        {:ignore [:unresolved-symbol]}}
                       :linters {:unresolved-symbol {:exclude [symbol1]}}}})

(defmacro emit-some-symbol
  [sym]
  `(defn ~sym
     ([] ~(str "I'm a " sym))
     ([z#] (str (~sym) " + " z#))))

(emit-some-symbol symbol1)
;; => #'clj-kondo-unresolved-var.a/symbol1
(emit-some-symbol symbol2)
;; => #'clj-kondo-unresolved-var.a/symbol2
(emit-some-symbol symbol3)
;; => #'clj-kondo-unresolved-var.a/symbol3

(symbol1)
;; => "I'm a symbol1"
(symbol1 23)
;; => "I'm a symbol1 + 23"
