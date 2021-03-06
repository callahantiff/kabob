;; --------------------------------------------
;; --------- rRNA Gene Type Assertion ---------
;; --------------------------------------------
 `{:name "rrna-gene-type-assertion"
   :description "This rule asserts rRNA gene type"
   :head ((?/gene rdfs/subClassOf obo/S0_0000252)) ; SO:rRNA
   
   :body ((?/record rdf/type ccp/IAO_EXT_0000681) ; ccp:NCBI_gene_info_record
         (?/record obo/BFO_0000051 ?/gene_field_value) ; BFO:has_part
         (?/gene_field_value rdf/type ccp/IAO_EXT_0000876) ; ccp:NCBI_gene_info_record__gene_identifier_field_value
         (?/gene_field_value rdf/type ?/gene_ice_id)
         (?/gene_ice_id obo/IAO_0000219 ?/gene) ; IAO:denotes

         ;; retrieve gene type
         (?/record obo/BFO_0000051 ?/type_field_value) ; BFO:has_part
         (?/type_field_value rdf/type ccp/IAO_EXT_0000884) ; ccp:NCBI_gene_info_record__type_of_gene_field_value
         (?/type_field_value rdf/type ?/type_ice_id)
         (?/type_ice_id obo/IAO_0000219 ?/type) ; IAO:denotes
         
         (= ?/type "rRNA")) 
   }