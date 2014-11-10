(ns chart-service.core
  	(:require [liberator.core :refer [resource]]
	          [compojure.core :refer [defroutes GET]]
			  [clojure.data.json :as json]))

(def chart-data 
	[{:chartOfAccountsCode "BA" :chartDescription "BLOOMINGTON AUX" :active true :cashObjectCode "8000" :accountsPayableObjectCode "9041" :chartManagerName "Ruffner, Romeo K"}
	 {:chartOfAccountsCode "BL" :chartDescription "BLOOMINGTON" :active true :cashObjectCode "8000" :accountsPayableObjectCode "9041" :chartManagerName "Swinson, Charley H"}])

(defroutes app
	(GET "/charts" []
		(resource :available-media-types ["application/json"]
				  :handle-ok (json/write-str chart-data))))
						
(def handler app)