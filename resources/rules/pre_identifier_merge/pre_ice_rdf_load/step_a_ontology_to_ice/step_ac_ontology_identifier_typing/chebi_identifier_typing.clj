;; -----------------------------------------------
;; --------- chebi identifier typing ---------
;; -----------------------------------------------
`{:name "chebi-identifier-typing"
  :description "This rule specifically the chebi ontology identifier"
  :head ((?/id rdfs/subClassOf ccp/IAO_EXT_0000198)) ; CCP:chebi_ontology_identifier
  :sparql-string "prefix franzOption_chunkProcessingAllowed: <franz:yes>
                  prefix ccp: <http://ccp.ucdenver.edu/obo/ext/>
                  prefix obo: <http://purl.obolibrary.org/obo/>
                  prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                  prefix oboInOwl: <http://www.geneontology.org/formats/oboInOwl#>
                  select ?id {
                  ?id rdfs:subClassOf ccp:IAO_EXT_0000088 . # CCP:ontology_concept_identifier
                  ?id obo:IAO_0000219 ?c . # IAO:denotes
                  ?c oboInOwl:hasOBONamespace 'chebi_ontology'
                  }"
  }