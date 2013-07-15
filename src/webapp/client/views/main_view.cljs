(ns webapp.client.main-view
    (:refer-clojure :exclude [val empty remove find next parents])
    (:require
        [cljs.reader :as reader]
        [crate.core :as crate]
    )
    (:use
        [webapp.framework.client.coreclient :only [el clear addto remote  add-to]]
;        [jayq.core                          :only [$ css  append ]]
        [webapp.framework.client.help       :only [help]]
        [webapp.framework.client.eventbus   :only [do-action esb undefine-action]]
        [webapp.framework.client.interpreter :only [!fn]]
    )
    (:use-macros
        [webapp.framework.client.eventbus :only [define-action]]
        [webapp.framework.client.coreclient :only [onclick]]
        [webapp.framework.client.interpreter :only [! !! !!!]]
     )
)


(defn homepage-html []

  (el
    :div {}
     [

        (el :h1 {:style "padding: 20px;"
                 :text  "Clojure on Coils"} )

        (el :div {:style "padding: 20px;"
                  :text "Welcome to Clojure on Coils."} )

        (el :div {:style "padding: 20px;"
                  :text "Clojure on Coils is a Clojure based webapp framework for single page database backed webapps"})

        (el :div {:style "padding: 20px;"
                  :text "Uses: Clojure, Clojurescript, JQuery, Bootstrap.js"})


        (el :button
                      {:id    "who-button"
                       :style "margin: 20px;"
                       :class "btn btn-large"
                       :text "Who are we"
                       :onclick #(do-action "show who page")})

        (el :button
                      {:id    "help-button"
                       :style "margin: 20px;"
                       :class "btn btn-large"
                       :text "Help"
                       :onclick #(help)})

        (el :button
                      {:id    "dissappear-button"
                       :style "margin: 20px;"
                       :class "btn btn-large"
                       :text "Dissappear"
                       :onclick  #(! clear)
                       })

        (el :button
                      {:id "show-esb-button"
                       :style "margin: 20px;"
                       :class "btn btn-large"
                       :text "ESB"
                       :onclick #(esb)})

        ;(el :div {:id "popup"})
     ]
  )
)






(define-action
    "show homepage"
    (do
        (add-to "main" (homepage-html))

))

