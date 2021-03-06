(ns webapp.client.main
    (:require
        [webapp.client.login-panel]
    )
    (:use
        [webapp.framework.client.eventbus  :only [do-action esb]]
    )
)

(do-action "create blank page structure")
(do-action "show top nav")
(do-action "show home page")

(comment remote "say-hello"
        {:name "Johnny"}
        (fn [reply] (js/alert (str (:text reply))))
)



(comment  remote "!say-hello"
        {:name "Johnny"}
        (fn [reply] (js/alert (str (:text reply))))
)


(comment remote "get-db-data" {:a 1}
                           (fn [reply]
                               (js/alert reply)))


;(sql "" {} (fn[reply] (js/alert (str reply))))


;(do-action "refresh homepage")

