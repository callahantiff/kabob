
`{:name "irefweb-protein-interactor-types"
 :head ((?/ice kiao/denotesSubClassOf obo/CHEBI_36080)) ;protein
 :body ((_/typefv kiao/hasTemplate iaoirefweb/IRefWebInteractorType_interactorTypeNameDataField1)
        (_/typefv obo/IAO_0000219 "protein") ; denotes
        (_/typerec obo/BFO_0000051 _/typefv) ; has_part
        (_/interactorrec obo/BFO_0000051 _/typerec) ; has_part

        (_/interactorrec obo/BFO_0000051 _/idfv) ; has_part
        (_/idfv kiao/hasTemplate iaoirefweb/IRefWebInteractor_irogidDataField1)
        (_/idfv obo/IAO_0000219 ?/ice)) ; denotes

  :options {:magic-prefixes [["franzOption_clauseReorderer" "franz:identity"]]}
}

;;TODO replicate the above and create denotesSubClassOf for Complexes



;; IREFWEB ids are of type kiao/ProteinIdentifier
;; `{:name "irefweb-A-id-type-assertion"
;;  :head ((?/ice kiao/denotesSubClassOf obo/CHEBI_36080)) ;protein
;;  :body ((_/f kiao/hasTemplate iaoirefweb/irefwebirefwebInteractorID_ADataField1)
;;         (_/f obo/IAO_0000219 ?/ice))}

;; `{:name "irefweb-B-id-type-assertion"
;;  :head ((?/ice kiao/denotesSubClassOf obo/CHEBI_36080)) ;protein
;;  :body ((_/f kiao/hasTemplate iaoirefweb/irefwebirefwebInteractorID_BDataField1)
;;         (_/f obo/IAO_0000219 ?/ice))}


