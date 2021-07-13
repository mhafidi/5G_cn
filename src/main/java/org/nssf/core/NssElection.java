package org.nssf.core;

/*

  - url: '{apiRoot}/nnssf-nsselection/v2'
    variables:
      apiRoot:
        default: https://example.com
        description: apiRoot as defined in clause 4.4 of 3GPP TS 29.501
externalDocs:
  description: 3GPP TS 29.531 V15.4.0; 5G System; Network Slice Selection Services; Stage 3
  url: http://www.3gpp.org/ftp/Specs/archive/29_series/29.531/
paths:
  /network-slice-information:
    get:
      summary:  Retrieve the Network Slice Selection Information
      tags:
        - Network Slice Information (Document)
      operationId: NSSelectionGet
      parameters:
        - name: nf-type
          in: query
          description: NF type of the NF service consumer
          required: true
          schema:
            $ref: 'TS29510_Nnrf_NFManagement.yaml#/components/schemas/NFType'
        - name: nf-id
          in: query
          description: NF Instance ID of the NF service consumer
          required: true
          schema:
            $ref: 'TS29571_CommonData.yaml#/components/schemas/NfInstanceId'
        - name: slice-info-request-for-registration
          in: query
          description: Requested network slice information during Registration procedure
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/SliceInfoForRegistration'
        - name: slice-info-request-for-pdu-session
          in: query
          description: Requested network slice information during PDU session establishment procedure
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/SliceInfoForPDUSession'
        - name: slice-info-request-for-ue-cu
          in: query
          description: Requested network slice information during UE confuguration update procedure
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/SliceInfoForUEConfigurationUpdate'
        - name: home-plmn-id
          in: query
          description: PLMN ID of the HPLMN
          content:
            application/json:
              schema:
                $ref: 'TS29571_CommonData.yaml#/components/schemas/PlmnId'
        - name: tai
          in: query
          description: TAI of the UE
          content:
            application/json:
              schema:
                $ref: 'TS29571_CommonData.yaml#/components/schemas/Tai'
        - name: supported-features
          in: query
          description: Features required to be supported by the NFs in the target slice instance
          schema:
            $ref: 'TS29571_CommonData.yaml#/components/schemas/SupportedFeatures'







 */
public class NssElection
{





}