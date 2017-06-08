;; --------------------------------------------------------
;; --------- Top-Level Object Property Assignment ---------
;; --------------------------------------------------------
`{:name "root-property-identifier-gen"
  :description "This rule creates an identifier for each top-level object property and types it as a top-level object property identifier (IAO_EXT_0000308)"
  :head ((?/id rdf/type ccp/IAO_EXT_0000308) ;; ccp:top-level object property identifer
         (?/id obo/IAO_0000219 ?/top_level_property)) ;; obo:denotes
  :reify ([?/id {:ln (:sha-1 ?/top_level_property)
                 :ns "ccp" :prefix "O_" :suffix ""}])
  :sparql-string "prefix oboInOwl: <http://www.geneontology.org/formats/oboInOwl#>
  select ?top_level_property {
  ?top_level_property rdf:type owl:ObjectProperty .
  minus{?top_level_property rdfs:subPropertyOf ?class}
  minus{?top_level_property owl:deprecated true}
  # exclude the oboInOwl:ObsoleteProperty property
  filter (?top_level_property != oboInOwl:ObsoleteProperty)
  # exclude ICE world properties (IAO, CCP extension ontology, OA ontology)
  filter (!contains (str(?top_level_property), 'http://www.w3.org/2000/01/rdf-schema#member'))
  filter (!contains (str(?top_level_property), ' http://www.w3.org/ns/prov'))
  filter (!contains (str(?top_level_property), 'ext/IAO_'))
  filter (!contains (str(?top_level_property), 'obo/IAO_'))
  filter (!contains (str(?top_level_property), 'http://www.w3.org/ns/oa#'))
  }"
}