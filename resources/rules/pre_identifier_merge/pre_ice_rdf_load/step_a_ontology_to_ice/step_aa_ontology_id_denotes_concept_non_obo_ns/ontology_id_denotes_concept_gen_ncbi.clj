;; ------------------------------------------------------------------------
;; --------- Ontology Concept Identifier Denotes Ontology Concept ---------
;; ------------------------------------------------------------------------
`{:name "ontology-id-denotes-concept-gen-ncbi"
  :description "This rule generates an ontology concept identifier for every non-root ontology concept with the NCBI namespace."
  :head ((?/id obo/IAO_0000219 ?/ontology_concept) ; IAO:denotes
         (?/id rdfs/subClassOf ccp/IAO_EXT_0000088) ; CCP:ontology_concept_identifier
         (?/id rdfs/subClassOf ccp/IAO_EXT_0000084)) ; CCP:NCBI_gene_identifier
  :reify ([?/id {:ln (:regex "NCBIGene:" "NCBI_GENE_" ?/concept_id)
                 :ns "ccp" :prefix "" :suffix ""}])
  :sparql-string "prefix franzOption_clauseReorderer: <franz:identity>
                  prefix franzOption_chunkProcessingAllowed: <franz:yes>
                  prefix ccp: <http://ccp.ucdenver.edu/obo/ext/>
                  prefix obo: <http://purl.obolibrary.org/obo/>
                  prefix oboInOwl: <http://www.geneontology.org/formats/oboInOwl#>
                  select ?ontology_concept ?concept_id {
                  ?ontology_concept oboInOwl:id ?concept_id .
                  # include only concepts with the NCBI namespace
                  filter (contains (str(?ontology_concept), 'http://www.ncbi.nlm.nih.gov/gene'))
                  minus {?ontology_concept owl:deprecated true} .
                  }"
  }